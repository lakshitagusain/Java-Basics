import java.util.*;
class Adder
{
    int a[]=new int[2];
    public Adder()
    {
        a[0]=0;
        a[1]=0;
    }
    void readtime()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter hours and minutes");
        a[0]=sc.nextInt();
        a[1]=sc.nextInt();
        sc.close();
    }
    void addtime(Adder X,Adder Y)
    {
        a[0]=X.a[0]+Y.a[0]+(X.a[1]+Y.a[1])/60;
        a[1]=(X.a[1]+Y.a[1])%60;
    }
    void disptime()
    {
        System.out.println("hours="+a[0]+" And minutes="+a[1]);
    }
    public static void main()
    {
        Adder t1=new Adder();
        Adder t2=new Adder();
        Adder t3=new Adder();
        t2.readtime();
        t3.readtime();
        t1.addtime(t2,t3);
        t1.disptime();
    }
}