import java.util.Scanner;
public class FiibonacciSeries {
    int number;
    int n1=0;
    int n2=1;
    int n3;
    void printSeries(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of element you want;");
        number=sc.nextInt();
        System.out.println(n1+"\n"+n2);


        for(int i=2;i<number;i++){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }

    }

    public static void main(String[] args) {
        FiibonacciSeries obj=new FiibonacciSeries();
        obj.printSeries();
        
    }
}
