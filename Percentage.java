import java.io.*;
import java.util.*;
class Percentage
{
    public static void main(String args[])throws IOException
    {
       double a=0.0,b=0.0,c=0.0,d=0.0,e=0.0,percentage=0.0;
       Scanner sc=new Scanner(System.in);
       /*String name,rollno,schlclass;
       System.out.println("Enter the name:");
       name=sc.next();
       System.out.println("Enter the rollno.:");
       rollno=sc.next();
       System.out.println("Enter the class:");
       schlclass=sc.next();*/
       System.out.println("The marks in the first subject=");
       a=sc.nextInt();
       System.out.println("The marks in the second subject=");
       b=sc.nextInt();
       System.out.println("The marks in the third subject=");
       c=sc.nextInt();
       System.out.println("The marks in the fourth subject=");
       d=sc.nextInt();
       System.out.println("The marks in the fifth subject=");
       e=sc.nextInt();
       percentage=sc.nextInt();
       percentage=(a+b+c+d+e)/500*100;
       System.out.println("The percentage="+percentage);
       sc.close();
    }
}
       