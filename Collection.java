import java.util.*;
class Collection
{
    int arr[];
    int len;
    Collection()
    {
        arr=new int[10];
        len=10;
    }
    Collection(int size)
    {
        arr=new int[size];
        len=size;
    }
    void inparr()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<len;++i)
        {
            System.out.println("Enter the element"+(i+1));
            arr[i]=sc.nextInt();
        }
        sc.close();
    }
    void setlength(int le)
    {
        len=le;
    }
    Collection common(Collection c2)
    {
        Collection c3=new Collection();
        int val;int k=0;
        for(int i=0;i<len;++i)
        {
            val=arr[i];
            for(int j=0;j<c2.arr.length;++j)
            {
                if(val==c2.arr[j])
                {
                    c3.arr[k]=val;
                    k++;
                }
            }
        }
        c3.setlength(k);
        return c3;
    }
    void display()
    {
         for(int i=0;i<len;i++)
         {
             System.out.print(arr[i]+" ");
         }
         System.out.println();
    }
    void arrange()
    {
       for(int i=len-1;i>=0;i--) 
       {
         int highestIndex=i;
           for(int j=i;j>=0;j--)
         {
          if(arr[j]>arr[highestIndex])
          {
            highestIndex=j;
          }
          int temp=arr[i];
          arr[i]=arr[highestIndex];
          arr[highestIndex]=temp;
         }
       }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Collection a=new Collection();
        System.out.println("Enter the elements of the first collection");
        a.inparr();
        Collection b=new Collection();
        System.out.println("Enter the elements of the second collection");
        b.inparr();
        a.common(b);
        a.arrange();
        System.out.println("elements of the common collection");
        a.display();
        sc.close();
    }
}
        
        