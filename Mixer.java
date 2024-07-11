import java.util.*;
class Mixer 
{
    int arr[];
    int n;
    static Scanner sc=new Scanner(System.in);
    Mixer(int nn)
    {
        n=nn;
        arr=new int [n];
    }
    void accept()
    {
        System.out.println("Enter "+n+" elements in ascending order");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    Mixer mix(Mixer A)
    {
       Mixer B=new Mixer(n+A.n);
       int x=0,y=0,z=0;
       while(x<n&&y<A.n)
       {
          if(arr[x]>A.arr[y])
          {
             B.arr[z]=A.arr[y];
             y++;
          }
          else
          {
             B.arr[y]=arr[x];
             x++;
          }
          z++;
       }
       while(x<n)
       {
           B.arr[z++]=arr[x++];
       }
        while(y<A.n)
       {
           B.arr[z++]=A.arr[y++];
       }
       return B;
    }
    void display()
    {
       System.out.println("The merged array:");
       for(int i=0;i<n;i++)
       {
         System.out.println(arr[i]);
       }
        }
    static void main()
    {
       int i,g,h;
       System.out.println("Enter the lenght of the first array");
       g=sc.nextInt();
       System.out.println("Enter the lenght of the second array");
       h=sc.nextInt();
       i=g+h;
       Mixer P=new Mixer(g);
       Mixer Q=new Mixer(h);
       Mixer R=new Mixer(i);
       P.accept();
       Q.accept();
       R=P.mix(Q);
       R.display();
    }
}

