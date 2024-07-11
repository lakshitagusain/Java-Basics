import java.io.*;
import java.util.*;

public class strev{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int a= A.length();
        if(a<=50)
        {
        String Arev="";
        for(int i=a-1;i>=0;i--)
        {
            char ch=A.charAt(i);
            Arev=Arev+ch;
            System.out.println(Arev);
        }
        
        if(Arev.equals(A))
        System.out.println("Yes");
        else
        System.out.println("No");
        }
        sc.close();
    }
}