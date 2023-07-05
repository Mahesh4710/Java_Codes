import java.util.Scanner;
public class AmstrongNumber {
    int checkAmstrong(int urNumber)    {
        int total=0;
        System.out.println("hello");
        while(urNumber!=0){
            total=total+total%10;
            urNumber=urNumber/10;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        AmstrongNumber oj=new AmstrongNumber();
        int k=oj.checkAmstrong(number);
        System.out.println("Sum of digits of "+number+"is :"+k);
    }
}
