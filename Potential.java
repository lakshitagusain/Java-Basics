import java.io.*;
import java.util.*;
class Potential
{
    public static void main(String args[])throws IOException
    {
        String sent,word="";
        int a=1,k=0,temp;String tem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        sent=sc.nextLine();
        int len=sent.length();
        if(sent.endsWith(".")||sent.endsWith("?")||sent.endsWith("!"))
        {
        for(int i=0;i<len;i++)
        {
            if(sent.charAt(i)==' ')
            {
                a=a+1;
            }
        } 
        String arr[]=new String[a];
        int arr2[]=new int[a];
        for(int i=0;i<len;i++)
        {
            char ch=sent.charAt(i);
            if(ch!=' '&&ch!='.'&&ch!='?'&&ch!='!')
            {word=word+ch;
            }
            else
            {arr[k++]=word;
            word="";
            }
        }
        for(int i=0;i<a;i++)
        {
            int sum=0;
            String b=arr[i];
            int l=b.length();
            for(int j=0;j<l;j++)
            {
                char c=b.charAt(j);
                sum=sum+(int)c;
            }
            arr2[i]=sum;
            System.out.println(arr[i]+"="+arr2[i]);
        }
        for(int i=0;i<a;i++) 
        {
             for(int j=i+1;j<a;j++)
            {
                if(arr2[i]>arr2[j])
                {
                    temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                    tem=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
            }
        }
         for(int i=0;i<a;i++)
         {
             System.out.print(arr[i]+" ");
         }
    }
    else
     System.out.println("INVALID INPUT");
     sc.close();
}
}