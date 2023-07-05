import java.util.Scanner;
class FactorialExample{  
    int factorialOfNumber(){

        int i,fact=1;
        System.out.println("Enter the number to calculate its factorial :");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();    
        for(i=1;i<=number;i++){    
            fact=fact*i;    
        }  
        return fact;  
    }
    public static void main(String args[]){  
    FactorialExample obj=new FactorialExample();
     System.out.println("Factorial of number is: "+obj.factorialOfNumber());    
    }  
   }  