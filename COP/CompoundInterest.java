// Calculate compound interest
// import java.util.Scanner;
public class CompoundInterest {
    double compound_interest;
    CompoundInterest(double principal_amount,double rate,double time){
        compound_interest=principal_amount *(Math.pow((1 + rate / 100), time));
        System.out.println("Compound interest for given amount is :"+compound_interest);
    }

    public static void main(String[] args) {
        CompoundInterest obj=new CompoundInterest(10000,10.25,5);
    }    
}
    