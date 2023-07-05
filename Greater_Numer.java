import java.util.*;

class Greater_Number{
    // int a,b,c;
    Greater_Number(int a,int b,int c){
        if(a>=b && a>=c)
            System.out.println(a+"is a greater number");
        else if(b>=a && b>=c)   
            System.out.println(b+"is a greater number");
        else    
        System.out.println(c+"is a greater number");
    }

    public static void main(String[] args) {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number :");
        x=sc.nextInt();
        System.out.println("Enter 2nd number :");
        y=sc.nextInt();
        System.out.println("Enter 3rd number :");
        z=sc.nextInt();

        Greater_Number oj=new Greater_Number(x, y, z);
    }
}