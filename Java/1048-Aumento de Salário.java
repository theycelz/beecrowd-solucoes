import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double valor = 0, salario =0 , reajuste = 0;
        int percentual = 0;
        Scanner leia = new Scanner(System.in);
        valor = leia.nextDouble();
        if (valor <= 400.00 && valor >= 0)
        {
            reajuste = valor * 0.15;
            salario = reajuste + valor;
            percentual = 15;
        }
        else if (valor >= 400.01 && valor <= 800.00)
        {
            reajuste = valor * 0.12;
            salario = reajuste + valor;
            percentual = 12;
        }
        else if (valor >= 800.01 && valor <= 1200.00)
        {
            reajuste = valor * 0.10;
            salario = reajuste + valor;
            percentual = 10;
        }
        else if (valor >= 1200.01 && valor <= 2000.00)
        {
            reajuste = valor * 0.07;
            salario = reajuste + valor;
            percentual = 7;
        }
        else if (valor > 2000.00)
        {
            reajuste = valor * 0.04;
            salario = reajuste + valor;
            percentual = 4;
        }
        System.out.printf("Novo salario: %.2f\n", salario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.printf("Em percentual: %d %%\n", percentual);
    }
}