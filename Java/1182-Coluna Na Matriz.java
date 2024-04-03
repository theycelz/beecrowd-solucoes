import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0.0;
        double[][] M = new double[12][12];
        char[] T = new char[2];
        int C, x, y;
        
        C = sc.nextInt();
        T = sc.next().toCharArray();
        
        for (x = 0; x <= 11; x++) {
            for (y = 0; y <= 11; y++) {
                M[x][y] = sc.nextDouble();
                if (y == C) {
                    a += M[x][y];
                }
            }
        }
        
        if (T[0] == 'S') {
            System.out.printf("\n%.1f\n", a);
        } else if (T[0] == 'M') {
            a = a / 12.0;
            System.out.printf("%.1f\n", a);
        }
        
        sc.close();
    }
}
