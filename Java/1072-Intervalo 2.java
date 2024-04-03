import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);
        int tam = 0, in =0, out=0;
        tam = leia.nextInt();
        int[] vetor = new int[tam];
        for(int i = 0; i<tam;i++){
            vetor[i] = leia.nextInt();
        }
        for(int j= 0; j<vetor.length; j++){
            if(vetor[j]>=10 && vetor[j]<=20){
                in++;
            }
            else {
                out++;
            }
        }
        System.out.printf("%d in\n",in);
        System.out.printf("%d out\n",out);
    }
}
    