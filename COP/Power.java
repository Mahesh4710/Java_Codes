//Calculate power of a number
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
       int base,exp;
       int result=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base number : ");
        base=sc.nextInt();
        System.out.println("Enter base number : ");
        exp=sc.nextInt();
        int temp=exp;
        while(exp!=0){
            result *= base;
            --exp;
        }
        System.out.println(base+"^"+temp+ "="+result);
    }
    
}
