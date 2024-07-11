import java.io.*;
import java.util.*;
class rev
{
    public static void main(String args[])throws IOException
    {
        int n,rev,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        n=sc.nextInt();
        rem=sc.nextInt();
        rev=sc.nextInt();
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n%10;
        }
            System.out.println("reverse of the no."+rev);
            sc.close();
        }
}
