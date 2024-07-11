import java.io.*;
import java.util.*;
class niven
{
    public static void main(String args[])throws IOException
    {
        int n,rev,rem,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        n=sc.nextInt();
        rev=sc.nextInt();
        temp=n;
        while(n>0)
        {
            rem=n%10;
            rev=rev+rem;
            n=n/10;
        }
        if(temp%rev==0)
        {
            System.out.println("the no.is a niven no.");
        }
        else
        
            {
            System.out.println("the no.is not a niven no.");
            }
        sc.close(); 
    }
}
