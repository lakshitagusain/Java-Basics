import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class palindrome_positioning {

    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = "abcbm";
        int len = str.length(); 
        int mtr[][] =new int[len-1][len-1]
        for(int i=0; i<len; i++){
            for(int j=i; j<len; j++){
                if(i==j){
                    mtr[i][j]=0;
                }
                else{
                    for(int k=1; k<j-1; k++){
                        mtr[i][j] = min(mtr[i][k], mtr[k+1][j]);
                    }                
                }
            }
        }


    }
}