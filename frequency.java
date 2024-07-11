import java.io.*;
class frequency
{
    public static void main(String args[])throws IOException
    {
        String str;
        int i,j,f=1,sum=0;
        for(i=1;i<=20;i++)
        {
            for(j=1;j<=i;j++)
            {f=f*j;
            }
            sum=sum+f;
        }
    }
}
            
        
