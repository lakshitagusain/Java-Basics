import java.util.Scanner;
class Palin
{
    int num;
    int revnum;
    Palin()
    {
        num=0;
        revnum=0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        sc.close();
    }
    int reverse(int y)
    {
        int r=0;
        while(y>0)
        {
            r=y%10;
            revnum=revnum*10+r;
            y=y/10;
        }
        return(revnum);
    }
    void check()
    {
        if(num==reverse(num))
        System.out.println("It is a palindrome number");
        else
        System.out.println("It is not a palindrome number");
    }
    public static void main(String args[])
    {
        Palin P =new Palin();
        P.accept();
        P.check();
    }
}
    