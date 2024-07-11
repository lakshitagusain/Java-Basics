import java.util.Scanner;

class Result {

    public static void main(String arg[])
        
    {int year, day, month;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        year=sc.nextInt();
        System.out.println("Enter the monthr");
        month=sc.nextInt();
        System.out.println("Enter the day");
        day=sc.nextInt();
         String str="";
        if(year>2000 && year<3000)
        {
            int a=0,c=0,p=0;
            for(int i=2000;i<year;i++)
            {
                if((i%4==0 && i%100!=0)||(i%400==0))
                {a=a+366;
                    p=p+1;}
                else a=a+365;
            }
            for(int j=1;j<month;j++)
            {
                if(j<8&&j%2==0&&j!=2)
                a=a+30;
                else if(j==2)
                a=a+28;
                else if(j==8)
                a=a+31;
                else if(j>8&&j%2==0)
                a=a+30;
                else a=a+31;
            }
            a=a+day+p;
            System.out.println(a);
            for(int k=1;k<=a;k++)
            {
                if(k%7==0)
                c=c+1;
            }
            System.out.println(c);
            int d=a-(c*7);
            System.out.println(d);
            if(d==0)
                str="MONDAY";
            else if(d==1)    
                str="TUESDAY";
            else if(d==2)    
             str="WEDNESDAY";
            else if(d==3)  
               str="THRUSDAY";
            else if(d==4)    
                str="FRIDAY";
            else if(d==5)    
               str="SATURDAY";
            else if(d==6)
                str="SUNDAY"; 
               
            
        }System.out.println(str);
        sc.close();
    }
}