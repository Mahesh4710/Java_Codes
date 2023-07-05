public class LargestAnd2ndLargest {
    LargestAnd2ndLargest(int[] urArray){
        int i = 0, largest1 = 0, largest2 = 0, temp = 0;
        System.out.println("Your array is :");
        for(int j=0;j<urArray.length;j++){
            System.out.println(urArray[j]);
        }

        if (largest1 < largest2)
    {
        temp = largest1;
        largest1 = largest2;
        largest2 = temp;
    }
 
    for ( i = 2; i < urArray.length; i++)
    {
        if (urArray[i] > largest1)
        {
            largest2 = largest1;
            largest1 = urArray[i];
        }
        else if (urArray[i] > largest2 && urArray[i] != largest1)
        {
            largest2 = urArray[i];
        }
    }
    System.out.println("First largest is "+largest1);
    System.out.println("2nd largest is "+largest2);
    }
    public static void main(String[] args) {
        int[] myArr={10,20,30,40};
        LargestAnd2ndLargest obj=new LargestAnd2ndLargest(myArr);
    }
}
