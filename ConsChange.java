import java.util.*;
public class ConsChange
{
    String word;
    int len;
    public ConsChange()
    {
        this.word="Spoon";
        this.len=0;
    }
    void readWord()
    {
        Scanner reader=new Scanner(System.in);
        this.word=reader.next();
        this.len=reader.nextInt();
        reader.close();
    }
    boolean Search(char[]a,char s,int n)
    {
        for(int i=0;i<n;i++)
        {
            if(s==a[i])
            return true;
        }
        return false;
    }
    String shiftCons()
    {
        char[]vowels=new char[]{'a','e','i','o','u'};
        String shiftedWord=" ";
        for(int i=0;i<this.len;i++)
        {
            if(Search(vowels,this.word.charAt(i),5)==false)
            shiftedWord+=this.word.charAt(i);
        }
        for(int i=0;i<this.len;i++)
        {
             if(Search(vowels,this.word.charAt(i),5)==true)
            shiftedWord+=this.word.charAt(i);
        }
        return shiftedWord;
    }
    String changeWord()
    {
        char[]vowels=new char[]{'a','e','i','o','u'};
        String shiftedWord=shiftCons();
        String changedWord=" ";
        int i;
        for(i=0;i<=this.len;i++)
        {
             if(Search(vowels,shiftedWord.charAt(i),5)==false)
             changedWord=changedWord+Character.toUpperCase(shiftedWord.charAt(i));
             else
             changedWord=changedWord+shiftedWord.charAt(i);
        }
        return changedWord;
    }
        void show()
        {
            String shiftedWord=shiftCons();
            String changedWord=changeWord();
            System.out.println("Original word is:"+this.word);
            System.out.println("Shifted word is:"+shiftedWord);
            System.out.println("Changed word is:"+changedWord);
        }
        public static void main(String args[])
        {
            ConsChange C=new ConsChange();
            C.readWord();
            C.show();
        }
}   
        
