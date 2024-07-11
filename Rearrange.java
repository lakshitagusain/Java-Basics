import java.util.Scanner;
class Rearrange
{
    String Txt;
    String Cxt;
    int len;
    Rearrange()
    {
        Txt="";
        Cxt="";
        len=0;
    }
    void readword()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word in UPPERCASE letters");
        Txt=in.next();
        Txt=Txt.toUpperCase();
        len=Txt.length();
        in.close();
    }
    void convert()
    {
       int i1=-1,i2=-1,i3=-1,i4=-1,i5=-1,begVowel=-1;
       i1=Txt.indexOf('A');
       i2=Txt.indexOf('E');
       i3=Txt.indexOf('I');
       i4=Txt.indexOf('O');
       i5=Txt.indexOf('U');
       if(i1!=-1)
       {
           begVowel=i1;
           if(i2!=-1&&begVowel>i2)
           begVowel=i2;
           if(i3!=-1&&begVowel>i3)
           begVowel=i3;
           if(i4!=-1&&begVowel>i4)
           begVowel=i4;
           if(i5!=-1&&begVowel>i5)
           begVowel=i5;
       }
       if(i2!=-1)
       {
           begVowel=i2;
           if(i1!=-1&&begVowel>i1)
           begVowel=i2;
           if(i3!=-1&&begVowel>i3)
           begVowel=i3;
           if(i4!=-1&&begVowel>i4)
           begVowel=i4;
           if(i5!=-1&&begVowel>i5)
           begVowel=i5;
       }
       if(i3!=-1)
       {
           begVowel=i3;
           if(i2!=-1&&begVowel>i2)
           begVowel=i2;
           if(i1!=-1&&begVowel>i1)
           begVowel=i1;
           if(i4!=-1&&begVowel>i4)
           begVowel=i4;
           if(i5!=-1&&begVowel>i5)
           begVowel=i5;
       }
       if(i4!=-1)
       {
           begVowel=i4;
           if(i2!=-1&&begVowel>i2)
           begVowel=i2;
           if(i3!=-1&&begVowel>i3)
           begVowel=i3;
           if(i1!=-1&&begVowel>i1)
           begVowel=i1;
           if(i5!=-1&&begVowel>i5)
           begVowel=i5;
       }
       if(i5!=-1)
       {
           begVowel=i5;
           if(i2!=-1&&begVowel>i2)
           begVowel=i2;
           if(i3!=-1&&begVowel>i3)
           begVowel=i3;
           if(i4!=-1&&begVowel>i4)
           begVowel=i4;
           if(i5!=-1&&begVowel>i5)
           begVowel=i1;
       }
       if(begVowel==0)
       Cxt=Txt+"Y";
       else if(begVowel>0&&begVowel<len)
       {
           String sub1=Txt.substring(0,begVowel);
           String sub2=Txt.substring(begVowel+1,len);
           Cxt=""+Txt.charAt(begVowel)+sub2+sub1+"C";
       }
       else
       Cxt=Txt+"N";
    }
    void Display()
    {
        System.out.println("Original string:"+Txt);
        System.out.println("Changed string:"+Cxt);
    }
    public static void main(String args[])
    {
        Rearrange reobj=new Rearrange();
        reobj.readword();
        reobj.convert();
        reobj.Display();
    }
}