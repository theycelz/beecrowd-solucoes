import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        int conta = 0;
        int valor = 0;
        Scanner leia = new Scanner(System.in);
        for(int i = 0; i <5; i++) 
        {
            valor = leia.nextInt();
            if (valor%2 == 0)
            {
                conta++;
            }
        }
        System.out.printf("%d valores pares\n",conta);
 
    }
 
}