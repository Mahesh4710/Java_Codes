//Swap two numbers
public class Swap {
    void bSwap(int a,int b){//without using third variable
        System.out.println("Before swap a="+a +" and b=" +b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap a="+a +" and b=" +b);
    }
    void aSwap(int a,int b){//using temp variable
        System.out.println("Before swap a="+a +" and b=" +b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swap a="+a +" and b=" +b);
    }
    
    public static void main(String[] args) {
        Swap s=new Swap();
        s.bSwap(1, 2);
        s.aSwap(1,2);
    }
}
