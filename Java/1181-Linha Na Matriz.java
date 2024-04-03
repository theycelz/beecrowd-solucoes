import java.util.Scanner;

public class Main
{
 public static void main(String[] args) 
 {
  Scanner leia = new Scanner(System.in);

  int i, j;
  int linha;
  char operacao;
  float matriz [][] = new float [12][12];

  float resultado = 0;

  linha = leia.nextInt();
  operacao = leia.next().charAt(0);

  for(i = 0; i < 12; i++)
  {
   for(j = 0; j < 12; j++)
   {
    matriz[i][j] = leia.nextFloat();
   }
  }


  if(operacao == 'S')
  {
   for(i = 0; i < 12; i++)
   {
    for(j = 0; j < 12; j++)
    {
     if(linha == i)
     {
      resultado = resultado + matriz[i][j];
     }
    }
   }
  }
  if(operacao == 'M')
  {
   for(i = 0; i < 12; i++)
   {
    for(j = 0; j < 12; j++)
    {
     if(linha == i)
     {
      resultado = resultado + matriz[i][j];
     }
    }
   }
   resultado = resultado/12;
  }

 System.out.printf("%.1f\n", resultado);

 }
}