import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int valor = 0, i = 0;
        int par = 0, impar = 0, pos = 0, neg = 0;
        Scanner leia = new Scanner(System.in);
        for(i = 0; i<5;i++){
            valor = leia.nextInt();
            if(valor%2==0){
                par++;
            }
            else{
                impar++;
            }
            if(valor>0){
                pos++;
            }
            else if(valor==0){
                continue;
            }
            else{
                neg++;
            }
        }
        
        System.out.printf("%d valor(es) par(es)\n", par);
        System.out.printf("%d valor(es) impar(es)\n", impar);
        System.out.printf("%d valor(es) positivo(s)\n", pos);
        System.out.printf("%d valor(es) negativo(s)\n", neg);

        }
}