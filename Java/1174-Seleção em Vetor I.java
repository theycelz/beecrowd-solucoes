import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        double[] A = new double[100];
        Scanner leia = new Scanner(System.in);
        //* length é o tamanho do vetor
        for(int i = 0; i <A.length; i++){
            A[i] = leia.nextDouble();
        }
        for(int j = 0; j <A.length; j++){
            if(A[j]<=10){
                System.out.printf("A[%d] = %.1f\n",j,A[j]);
            }
        }
    }
}