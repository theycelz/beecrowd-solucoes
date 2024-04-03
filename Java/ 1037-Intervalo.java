import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        double tec;
        Scanner leia = new Scanner(System.in);
        tec = leia.nextDouble();
        
        if((tec >= 0) && (tec <=25.0000)){
            System.out.println("Intervalo [0,25]");
        }
            
        else if ((tec >= 25.0000) && (tec <=50.0000)){
            System.out.println("Intervalo (25,50]");
        }
        else if((tec >= 75.0000) && (tec <=100.0000)){
            System.out.println("Intervalo (75,100]");
        }
        else {
            System.out.println("Fora de intervalo");
        }
        
    }
 
}