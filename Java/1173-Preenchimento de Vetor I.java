import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int v = leia.nextInt();
        int[] n = new int[10];

        n[0] = v;
        System.out.println("N[0] = " + n[0]);

        for (int i = 1; i < 10; i++) {
            n[i] = n[i - 1] * 2;
            System.out.println("N[" + i + "] = " + n[i]);
        }
    }
}
