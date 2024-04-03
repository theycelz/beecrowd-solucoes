import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        int A,B,C,D ;
        Scanner entra = new Scanner(System.in);
        A =entra.nextInt();
        B=entra.nextInt();
        C =entra.nextInt();
        D = entra.nextInt();
        int resultado = 0;
        resultado = (A*B-C*D);
        System.out.println("DIFERENCA = "+resultado);
    }
    
 
}