import java.util.Scanner;

class substringcomp {

    static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int l=s.length();
        int c=l-(k-1);
        String[] a=new String[c];
        for(int i=0;i<c;i++)
        {
            a[i]=s.substring(i,(i+k));
            
        }for(int b=0;b<(c-1);b++)
        {for(int j=0;j<(c-1-b);j++)
        {
            if((a[j].compareTo(a[j+1]))>0)
            {
                String temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
        smallest=a[0];
        largest=a[c-1];
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        int k = scan.nextInt();
        
        System.out.println(getSmallestAndLargest(s, k));
        scan.close();
    }
}
