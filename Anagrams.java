import java.util.Scanner;
class Anagrams
{
    public static boolean isAna(String a, String b) 
    {
        int c=a.length();
        int d=b.length();
        int f=0,g=0,e=0;
        if(c==d)
        {
            for(int i=0;i<c;i++)
            { for(int k=0;k<c;k++)
            {
                if((" "+a.charAt(i)).equalsIgnoreCase(" "+a.charAt(k)))
                g++;
            }    
            for(int j=0;j<d;j++)
            {
                if((" "+a.charAt(i)).equalsIgnoreCase(" "+b.charAt(j)))
                f++;
            }
            if(f==g)
            e++;
            }
            
        }
        if(e==c)
            return true;
        else return false;
    }

    public static void main(String args[])  {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        
        boolean ret = isAna(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        scan.close();
    }
}