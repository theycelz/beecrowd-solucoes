import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    int a,b,c,d,e,f,g,h,i,j=1,N,p=0,q=0,r = 0;
    Scanner input = new Scanner(System.in);
    while(1==1)
    {
        N = input.nextInt();
        if(N==0) break;
        else
        {
            j=1;p=0;q=0;
            int ara[][]=new int[N][N];
            i=N;
            if(N%2==0)
                r=N/2;
            else if(N%2==1)
                r=(N/2)+1;
            for(c=1; c<=r; c++)
            {
                for(a=p; a<i; a++)
                {
                    for(b=q; b<i; b++)
                        ara[a][b]=j;
                }
                j++;
                p++; q++; i--;
            }
            for(g=0; g<N; g++)
            {
                for(h=0; h<N; h++)
                {
                    if(h==0)
                        System.out.printf("%3d",ara[g][h]);
                    else
                        System.out.printf(" %3d",ara[g][h]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    input.close();
}
}