import java.util.*;
public class Disarium
{
    int num;
    int size;
    public Disarium(int nn) 
    {
        this.num=nn;
        this.size=0;
    }
    private void countDigit()
    {
        int x=num;
        int count=0;
        while(x>0)
        {
            count++;
            x/=10;
        }
        this.size=count;
    }
    private int power(int a,int b)
    {
        if(b==0)
         return 1;
        return a*power(a,b-1);
    }
    private int sumOfDigit(int n,int p)
    {
        if(n==0)
        return 0;
        int divisor=power(10,this.size-p);
        return power(n/divisor,p)+sumOfDigit(n%divisor,p+1);
    }
    void check()
    {
        countDigit();
        int ans=sumOfDigit(this.num,1);
        if(ans==this.num)
        System.out.println(this.num+" is a Disarium number!");
        else
        System.out.println(this.num+" is not a Disarium number!");
    }
    public static void main(String args[])
    {
        int r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        r=sc.nextInt();
        Disarium d=new Disarium(r);
        d.check();
        sc.close();
    }
}
        
        
        
        
    