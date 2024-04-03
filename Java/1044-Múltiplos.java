import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int A = leia.nextInt();
        int B = leia.nextInt();
        if (B % A == 0 || A % B == 0) {
            System.out.println("Sao Multiplos");
        
        }
            
        
        else {
            System.out.println("Nao sao Multiplos");
        
        }
    }

}