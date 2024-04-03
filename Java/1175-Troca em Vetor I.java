import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] N = new int[20];
        Scanner leia = new Scanner(System.in);

        for (int i = 0; i < N.length; i++) {
            N[i] = leia.nextInt();
        }

        for (int i = 0; i < N.length / 2; i++) {
            int temp = N[i];
            N[i] = N[N.length - 1 - i];
            N[N.length - 1 - i] = temp;
        }

        for (int i = 0; i < N.length; i++) {
            System.out.printf("N[%d] = %d\n", i, N[i]);
        }
    }
}