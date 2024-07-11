import java.text.NumberFormat; 
import java.util.*;
import java.text.*;

public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat formatter=NumberFormat.getCurrencyInstance(indiaLocale);  
        String india=formatter.format(payment);  
        NumberFormat formatter1=NumberFormat.getCurrencyInstance(Locale.US);  
        String us=formatter1.format(payment);
        NumberFormat formatter2=NumberFormat.getCurrencyInstance(Locale.PRC);  
        String china=formatter2.format(payment);
        NumberFormat formatter3=NumberFormat.getCurrencyInstance(Locale.FRANCE);  
        String france=formatter3.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}