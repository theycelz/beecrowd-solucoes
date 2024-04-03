import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);
        int v1 = leia.nextInt();
        int v2 = leia.nextInt();
        int maior = 0, menor = 0;
        int soma = 0;

        if(v1 > v2) {
            maior = v1;
            menor = v2;
        }
        else {
            maior = v2;
            menor = v1;
        }

        for(int i = menor + 1; i < maior; i++) {
            if(i % 2 != 0) {
                soma += i;
            }
        }
        System.out.println(soma);
    }
}