import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] N = new double[100];
        double pri = 0;
        Scanner leia = new Scanner(System.in);
        pri = leia.nextDouble();
        N[0] = pri;
        for (int i = 1; i < N.length; i++) {
            N[i] = pri / 2;
            pri = N[i];
        }

        for (int i = 0; i < N.length; i++) {
            System.out.printf("N[%d] = %.4f\n", i, N[i]);
        }
    }
}
