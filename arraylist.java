import java.util.*;

public class arraylist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int b=sc.nextInt();
        int n=0;
        ArrayList<int[]> list=new ArrayList<int[]>();
        for(int i=1;i<=b;i++)
        {
            int c=sc.nextInt();
            int[] d=new int[c]; 
            for(int j=0;j<c;j++)
            {
                d[j]=sc.nextInt();
            }
            list.add(n,d);
            n++;
        }
        sc.nextLine();
        int q=sc.nextInt();
        int[] ans=new int[q];
        int m=0;
        for(int k=0;k<q;k++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            sc.nextLine();
            for(int l=0;l<list.size();l++)
            {try
                {
                if(l==(x-1)&& (y-1)<list.get(x-1).length)
                {ans[m]=list.get(x-1)[y-1];
                    m++;
                }
                else if(l==(x-1)&& (y-1)>=list.get(x-1).length)
                {ans[m]=0;
                m++;}
                }
                catch(Exception e)
               {
                   ans[m]=0;
                   m++;
                 //continue;
                 
               }
            }
        }
        /*for(int p=0;p<q;p++)
        {
            System.out.println(ans[p]);
        }*/
        for(int p=0;p<q;p++)
        {
            if(ans[p]!=0)
            System.out.println(ans[p]);
            else System.out.println("ERROR!");
        }
        sc.close();
        }
    }
