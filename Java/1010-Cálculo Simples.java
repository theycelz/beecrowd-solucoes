import java.io.IOException;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws IOException {
        int p1,p2,np1,np2;
        float v1,v2,resultado;
        Scanner leia = new Scanner(System.in);
        p1 = leia.nextInt();
        np1 =leia.nextInt();
        v1 = leia.nextFloat();
        p2 = leia.nextInt();
        np2 =leia.nextInt();
        v2 = leia.nextFloat();
        resultado = (np1*v1)+(np2*v2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",resultado);
    }
}
  