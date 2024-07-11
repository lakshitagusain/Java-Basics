import java.util.*;
class Employee
{
    public static void main(String args[])
    {
       double bs,HRA,DA,TA,PF,NS;
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter name of the employee:");
       String Name=sc.next();
       System.out.print("Enter the value of basic salary=");
       bs=sc.nextDouble();
       HRA=0.15*bs;
       DA=0.7*bs;
       TA=0.02*bs;
       PF=0.1*bs;
       NS=bs+HRA+DA+TA-PF;
       System.out.println("HRA="+HRA);
       System.out.println("DA="+DA);
       System.out.println("TA="+TA);
       System.out.println("PF="+PF);
       System.out.println("NS="+NS);
       sc.close();
    }
}
       