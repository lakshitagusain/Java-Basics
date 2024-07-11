import java.util.*;
public class merger
{
    long n1;   
    long n2;
    long mergnum;
     merger()
    {
        n1=0;
        n2=0;
        mergnum=0;
    }
    public void readNum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        n1=sc.nextInt();
        System.out.println("Enter the second number");
        n2=sc.nextInt();
        sc.close();
    }
     public void joinNum()
    {
        mergnum=n1;
        long R=0;
        for(long a=n2;a>0;a=a/10)
        {
            R=(R*10)+(a%10);
        }
        while(R>0)
        {
            mergnum=(mergnum*10)+(R%10);
            R=R/10;
        }
    }
    public void show()
    {
        System.out.println("First number="+n1);
        System.out.println("Second number="+n2);
        System.out.println("Merged number="+mergnum);
    }
    public static void main(String args[])
    {
        merger M1=new merger();
        M1.readNum();
        M1.joinNum();
        M1.show();
    }
}
    
            