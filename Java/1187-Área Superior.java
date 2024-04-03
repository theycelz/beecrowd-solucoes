import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char operacao = sc.next().charAt(0);
        double[][] M = new double[12][12];
        double soma = 0.0;
        int count = 0;


        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = sc.nextDouble();
            }
        }


        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 11 - i; j++) {
                soma += M[i][j];
                count++;
            }
        }


        if (operacao == 'S') {
            System.out.printf("%.1f\n", soma);
        } else if (operacao == 'M') {
            double media = soma / count;
            System.out.printf("%.1f\n", media);
        }

        sc.close();
    }
}
