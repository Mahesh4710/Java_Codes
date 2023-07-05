class AscendingOrder{
    AscendingOrder(int[] urArray){
        int temp=0;
        System.out.println("Your array is :");
        for(int i=0;i<urArray.length;i++){
            System.out.println(urArray[i]);
        }

        for (int i = 0; i < urArray.length; i++) {   
            for (int j = i+1; j < urArray.length; j++) {   
               if(urArray[i] > urArray[j]) {  
                   temp = urArray[i];  
                   urArray[i] = urArray[j];  
                   urArray[j] = temp;  
               }   
            } 
        }  
        
        System.out.println("Your array after ascending order is :");
        for(int i=0;i<urArray.length;i++){
            System.out.println(urArray[i]);
        }
    }

    public static void main(String[] args) {
        int[] arrayEle={5,4,3,2,1};
        AscendingOrder obj=new AscendingOrder(arrayEle);
    }
}