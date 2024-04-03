import java.io.IOException;
import java.util.Scanner;

public class Main {

 public static void main(String[] args) throws IOException {

	Scanner entradaTeclado = new Scanner(System.in);
	final int carroX = 60;
	final int carroY = 90;

	int distancia = entradaTeclado.nextInt();
	int x = (carroX*distancia) / 30;

	System.out.printf("%d minutos\n", x);
    
    }
}
