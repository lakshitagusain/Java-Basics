import java.util.*;
class EqMat
{
    int m;
    int n;
    int a[][];
   EqMat (int mm,int nn)
   {
       m=mm;
       n=nn;
       a=new int[m][n];
   }
   void readarray()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the array elements");
       for(int i=0;i<m;i++)
       {
           for(int j=0;j<n;j++)
           {
               a[i][j]=sc.nextInt();
            }
        }
        sc.close();
    }
   int check(EqMat P,EqMat Q)
   {
       int f=0;
       for(int i=0;i<P.m;i++)
       {
           for(int j=0;j<P.n;j++)
           {
               if(P.a[i][j]!=Q.a[i][j])
               {
                   f=1;
                }
            }
        }
       if(f==1)
       {
           return 0;
        }
        else
        return 1;
    }
   void print()
   {
        for(int i=0;i<m;i++)
       {
           for(int j=0;j<n;j++)
           {
               System.out.print(+a[i][j]);
            }
            System.out.println();
        }
   }
   public static void main(String args[])
   {
       EqMat o1=new EqMat(3,3);
       o1.readarray();
       o1.print();
       EqMat o2=new EqMat(3,3);
       o2.readarray();
       o2.print();
       EqMat o3=new EqMat(3,3);
       int l=o3.check(o1,o2);
       if(l==1)
       {
          System.out.println("The matrices are equal");
       }
       else
       System.out.println("The matrices are unequal");
    }
}
        