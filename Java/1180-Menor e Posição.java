import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int N = -1;
        int menor = Integer.MAX_VALUE;
        int posicao = 0;
        
        while(N<1 || N>1000){
        
            N = leia.nextInt();
        }
        
        int[] X = new int[N];
        
        for(int i = 0; i < X.length; i++){
            X[i] = leia.nextInt();
            if(X[i] < menor){
                menor = X[i];
                posicao = i;
            }
        }
        
        System.out.printf("Menor valor: %d\n", menor);
        System.out.printf("Posicao: %d\n", posicao);
    }
}
