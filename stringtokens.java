import java.io.*;
import java.util.*;

public class stringtokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] split = s.split("[|,.!?'\\s]+");
        System.out.println(split.length);
        for(int i=0; i<split.length; i++) {
           
            System.out.println(split[i]);
        }
        // Write your code here.
        
        scan.close();
    }
}



