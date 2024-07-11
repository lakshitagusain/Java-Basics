import java.util.*;
class automorphic
{
    public static void main(String args[])
    {
        int r,n,sq,count,temp,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        n=sc.nextInt();
        count=sc.nextInt();
        temp=n;
        sq=n*n;
        while(n>0)
        {
        rem=n%10;
        count=count+1;
        n=n/10;
        }
        r=(int) (sq%Math.pow(10,count));
        if(r==temp)
        { System.out.println("it is a automorphic no.");}
        else
        {System.out.println("it is not a automorphic no.");}
        sc.close();
    }
}
