import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        int num, horas;
        float horastrab, salario;
        Scanner leia = new Scanner(System.in);
        num = leia.nextInt();
        horas = leia.nextInt();
        horastrab = leia.nextFloat();
        salario = (horastrab*horas);
        System.out.println("NUMBER = "+num);
        System.out.printf("SALARY = U$ %.2f\n",salario);
    }
        

}