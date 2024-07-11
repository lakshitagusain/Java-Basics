import java.io.*;
import java.util.*;
public class hourglass
{
  public static void main (String[]args) throws IOException
  {
    Scanner sc = new Scanner (System.in);
    ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
    for (int i = 0; i < 6; i++)
    {
	ArrayList < Integer > arrRowItems = new ArrayList <> ();
	for (int j = 0; j < 6; j++)
	{
	    int arrItem = sc.nextInt ();
	      arrRowItems.add (j,arrItem);
	}
	arr.add (i,arrRowItems);
    }int a = 0, b = 1, c = 2, sum = 0,largest=-100,k=1;
    for (int i = 0; i < 4; i++)
    {
	while(c < 6)
	{
	    sum = arr.get (i).get (a) + arr.get (i).get (b) +arr.get (i).get (c) + arr.get (i + 1).get (b) + arr.get (i +2).get (a) + arr.get (i + 2).get (b) + arr.get (i + 2).get (c);
	    a++;
	    b++;
	    c++;
        System.out.println(sum);
	    if (sum>largest)
	    {largest = sum;}
	}
    a=0;b=1;c=2;
    }
    System.out.println (largest);
    sc.close ();
  }
}
