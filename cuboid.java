import java.io.*;
import java.util.*;
class cuboid
{
    int l,b,h;
    double v,sa,d;
        public void main(String args[])throws IOException
        {       
            input();
            calculate();
            display();
        }
        void input()
        {
            Scanner sc= new Scanner(System.in);
            v=sc.nextDouble();
            sa=sc.nextDouble();
            d=sc.nextDouble(); 
            System.out.println("Enter the value of length");
            l=sc.nextInt();
            System.out.println("ebter the value of breadth");
            b=sc.nextInt();
            System.out.println("enter the value of height");
            h=sc.nextInt();
            sc.close();
        }
        void calculate()
        {
            v=l*b*h;
            sa=2*(l*b+b*h+h*l);
            d=Math.sqrt(Math.pow(l,2)+Math.pow(b,2)+Math.pow(h,2));
        }
        void display()
        {
            System.out.println("Volume of the cuboid is"+v);
            System.out.println("Surface area of the cuboid is"+sa);
            System.out.println("Diagonal of the cuboid is"+d);
        }
}      
           
        
