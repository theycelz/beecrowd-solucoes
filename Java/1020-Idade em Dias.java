import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    int ano = 0, mes = 0, dias = 0, num;
    Scanner s = new Scanner(System.in);
    num = s.nextInt();
    ano = num / 365;
    mes = (num % 365) / 30;

    dias = (num % 365) % 30;

    System.out.println(ano + " ano(s)");
    System.out.println(mes + " mes(es)");
    System.out.println(dias + " dia(s)");

  }

}