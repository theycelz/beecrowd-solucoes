import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = leia.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                int quadrado = i * i;
                System.out.printf("%d^2 = %d%n", i, quadrado);
            }
        }
    }
}
