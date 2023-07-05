import java.util.Scanner;
public class temp {
    public static void prime(int n1, int n2){
        int i,j;
for (i=n1; i<=n2;i++){

    for(j=2; j<=i; j++) {
        if (i%j==0)
            break;
    }
    if (i==j)
        System.out.println(j);
    }
}

    public static void main(String[] args) {
        int n1, n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n1 & n2");
        n1=sc.nextInt();
        n2=sc.nextInt();
        //temp obj=new temp();
        //obj.prime(n1,n2);
        temp.prime(n1, n2);
    }
}   
