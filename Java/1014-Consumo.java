import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int dis;
        float comb, conta;
        Scanner leia = new Scanner(System.in);
        dis = leia.nextInt();
        comb = leia.nextFloat();
        
        conta = dis/comb;
        System.out.printf("%.3f km/l\n",conta);

        }
}