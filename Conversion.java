import java .io.*;
import java.util.*;
class Conversion
{
    public static void main(String args[])throws IOException
    {
        int f,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of f=");
        f=sc.nextInt();
        c=sc.nextInt();
        c=5*(f-32)/9;
        System.out.println("its value in degree celcius is"+c);
        sc.close();
    }
}