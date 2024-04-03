import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
    char operacao = input.next().charAt(0);
    double[][] M = new double[12][12];

    // Leitura da matriz
    for (int i = 0; i < 12; i++) {
        for (int j = 0; j < 12; j++) {
            M[i][j] = input.nextDouble();
        }
    }

    double soma = 0;
    int elementosAcimaDiagonal = 0;

    // Cálculo da soma ou da média dos elementos acima da diagonal principal
    for (int i = 0; i < 12; i++) {
        for (int j = i + 1; j < 12; j++) {
            soma += M[i][j];
            elementosAcimaDiagonal++;
        }
    }

    double resultado = operacao == 'M' ? soma / elementosAcimaDiagonal : soma;

    System.out.printf("%.1f\n", resultado);

    }
}