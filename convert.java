import java.io.*;
import java.util.*;
class convert
    {
    int n;
    convert()
        {
        n=0;
        }
    void impnum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        sc.close();
    }
    void extdigit(int y)
    {
        int d=0;
        while(y>0)
        {
        d=y%10;
        num_to_words(d);
        y=y/10;
        }
    }
    void num_to_words(int a)
    {
        switch(a)
        {
         case 1:
         System.out.println("one");
         break;
         case 2:
         System.out.println("two");
         break;
         case 3:
         System.out.println("three");
         break;
         case 4:
         System.out.println("four");
         break;
         case 5:
         System.out.println("five");
         break;
         case 6:
         System.out.println("six");
         break;
         case 7:
         System.out.println("seven");
         break;
         case 8:
         System.out.println("eight");
         break;
        case 9:
         System.out.println("nine");
        break;
        }
    }
    public void main(String args[])throws IOException
    {
        convert obj=new convert();
        obj.impnum();
        obj.extdigit(n);
    }
}
