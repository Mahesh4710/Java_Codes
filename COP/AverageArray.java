public class AverageArray{
    int[] intArray=new int[10];

    int totalSum(int[] intArray){
        int sum=0;
        for(int i=0;i<intArray.length;i++){
            sum=sum+intArray[i];
        }
        return sum;   
     }

    int arrayAverage(int total,int count){
        int average=total/count;
        return average;
    }
    public static void main(String[] args) {
        int[] myArray={10,20,30,40,50,60,70,80,90,100};
        int length=myArray.length;
        AverageArray obj= new AverageArray();
        obj.totalSum(myArray);
        System.out.println("Toal sum of array elements is :"+obj.totalSum(myArray));
        obj.arrayAverage(obj.totalSum(myArray), length);
        System.out.println("Average of array elements is :"+obj.arrayAverage(obj.totalSum(myArray), length));
    }
}
