public class ReverseArray {
    ReverseArray(int [] yourArray){
        System.out.println("Array you entered is :");
        for(int i=0;i<yourArray.length;i++){
            System.out.print(yourArray[i]+" ");
        }
        System.out.println("");
        System.out.println("Reversed array is :");
        for(int j=yourArray.length-1;j>=0;j--){
            System.out.print(yourArray[j]+" "); 
        }
    }
    public static void main(String[] args) {
        int[] myArr={1,2,3,4,5};
        ReverseArray o=new ReverseArray(myArr);
    }
}
