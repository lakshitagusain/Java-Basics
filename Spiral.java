import java.util.Scanner;
class Spiral
{
    int [][]a;
    int N;
    Spiral(int n)
    {
        a=new int[n][n];
        N=n;
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++) 
        a[i][j]=1+N*i+j;
    }
    void printNormal()
    {
         for(int i=0;i<N;i++)
         {
              for(int j=0;j<N;j++)
              System.out.print(a[i][j]+"\t");
              System.out.println();
         }
    }
    void printSpiral()
    {
         for(int i=N-1,j=0;i>0;i--,j++)
         {
              for(int k=j;k<i;k++)
              {
                  System.out.print(a[j][k]+" ");
              }
              for(int k=j;k<i;k++)
              {
                  System.out.print(a[k][i]+" ");
              }
              for(int k=i;k>j;k--)
              {
                  System.out.print(a[i][k]+" ");
              }
              for(int k=i;k>j;k--)
              {
                  System.out.print(a[k][j]+" ");
              }
         }
         if(N%2==1)
         {
             System.out.print(a[(N-1)/2][(N-1)/2]);
         }
    }
    public static void main(String[]args)
    {
        Scanner in=new Scanner (System.in);
        System.out.println("Enter N to create an N x N array:");
        int N=in.nextInt();
        Spiral sp=new Spiral(N);
        System.out.println("The given array is:");
        sp.printNormal();
        System.out.println("when printed in spiral order:");
        sp.printSpiral();
        in.close();
    }
}
        