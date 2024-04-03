import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        float A, B, c;
		Scanner s = new Scanner( System.in );
		A = s.nextFloat();
		B = s.nextFloat();
		c = ((A* 35/10) + (B*75/10)) / 11;
		System.out.printf("MEDIA = %.5f",c);
				System.out.println();

    }
 
}