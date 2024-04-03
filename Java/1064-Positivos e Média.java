import java.io.IOException;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {

    double soma = 0;
    int contap = 0;
    Scanner leia = new Scanner(System.in);
    for(int i = 0; i < 6; i++) 
    {
        double valor = leia.nextDouble();
        if (valor > 0) 
        {
          contap++;  
          soma += valor;
        }
    }
    soma = soma/contap;
    System.out.printf("%d valores positivos\n",contap);
    System.out.printf("%.1f\n",soma);
    
    }
}