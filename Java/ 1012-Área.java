import java.util.Scanner;
import java.io.IOException;
import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner leia = new Scanner(System.in);
        float  A,B,C;
        double areat, areaci,areatra,areaqua,arearet, contabase;
        A = leia.nextFloat();
        B = leia.nextFloat();
        C = leia.nextFloat();

        areat = (A*C)/2;
        contabase = C*C;
        areaci = contabase * 3.14159;
        areatra = ((A+B)*C)/2;
        areaqua = B*B;
        arearet = A*B;

        System.out.printf("TRIANGULO: %.3f\n",areat);
        System.out.printf("CIRCULO: %.3f\n",areaci);
        System.out.printf("TRAPEZIO: %.3f\n",areatra);
        System.out.printf("QUADRADO: %.3f\n",areaqua);
        System.out.printf("RETANGULO: %.3f\n",arearet); }

}