import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);
        int A,B,C,D,soma,somab,somacd,teste = 0;
        A = leia.nextInt();
        B = leia.nextInt();
        C = leia.nextInt();
        D = leia.nextInt();
        soma = A%2;
        somab = A+B;
        somacd = C+D;
        if ((C>=0)&&(D>=0)){
            teste = 12;
        }
        if(((B>C)&&(D>A)&&(somacd>somab)&&(teste==12)&&(soma==0))){
            System.out.println("Valores aceitos"); 
        } 
        else {
            System.out.println("Valores nao aceitos");
        }
 }
}