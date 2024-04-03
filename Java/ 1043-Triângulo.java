import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        float A,B,C, peri, area;
        Scanner leia = new Scanner(System.in);
        A = leia.nextFloat();
        B = leia.nextFloat();
        C = leia.nextFloat();
        if (A<(B+C) && B<(A+C) && C<(B+A)){
            peri = A+B+C;
            System.out.printf("Perimetro = %.1f\n",peri);
        }
        else { 
            area = ((A+B)*C)/2;
            System.out.printf("Area = %.1f\n",area);
            
            
        } 

    }
 
}