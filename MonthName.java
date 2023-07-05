import java.util.Scanner;
public class MonthName {
    MonthName(int month){
        if(month==1)
            System.out.println("Janaury");
        else if(month==2)
            System.out.println("februry");
        else if(month==3)
            System.out.println("march"); 
        else if(month==4)
            System.out.println("april");   
        else if(month==5)
            System.out.println("may");  
        else if(month==6)
            System.out.println("june");  
        else if(month==7)
            System.out.println("july"); 
        else if(month==8)
            System.out.println("augast");
        else if(month==9)
            System.out.println("septmeber");  
        else if(month==10)
            System.out.println("octomber");        
        else if(month==1)
            System.out.println("November");
        else if(month==1)
            System.out.println("December"); 
        else        
            System.out.println("Enter the valid month");    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month number you want :");
        int monthNumber=sc.nextInt();
        MonthName obj=new MonthName(monthNumber);
    }
}
