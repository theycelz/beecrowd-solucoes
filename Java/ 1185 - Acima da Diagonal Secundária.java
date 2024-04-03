import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0.0;
        double[][] M = new double[12][12];
        char[] T = new char[2];
        int C, x, y, z, p = 10;
        
        T = sc.next().toCharArray();
        for (x = 0; x <= 11; x++) {
            for (y = 0; y <= 11; y++) {
                M[x][y] = sc.nextDouble();
            }
        }
        for (z = 0; z <= 10; z++) {
            for (C = 0; C <= p; C++) {
                a += M[z][C];
            }
            p--;
        }
        if (T[0] == 'S') {
            System.out.printf("%.1f\n", a);
        } else if (T[0] == 'M') {
            a = a / 66.0;
            System.out.printf("%.1f\n", a);
        }
        
        sc.close();
    }
}
