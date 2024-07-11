import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class lps {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str = "agbdba";
        int len = str.length();
        int mtr[][] = new int[len][len];
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++)
            {if(i==j){
                mtr[i][j]=1;}
            }
        }
        int i=0;
        for(int j=i+1; j<len; j++){
            for(i=0; i<len; i++)
            {
                if(j>i){
                    if (str.charAt(i) == str.charAt(j))
                    {
                        mtr[i][j] =2+ mtr[i+1][j-1];
                    }
                    else{
                        if(mtr[i][j-1] > mtr[i+1][j]){
                            mtr[i][j] = mtr[i][j-1];
                        }
                        else mtr[i][j] = mtr[i+1][j];
                    }
                }
            }
        }
        for(i=0; i<len; i++){
            for(int j=0; j<len; j++)
            {
                System.out.print(mtr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}