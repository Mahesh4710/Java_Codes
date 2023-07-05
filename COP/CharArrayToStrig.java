public class CharArrayToStrig {

    String toString(char[] a){
        String afterConversion=new String(a);

        return afterConversion;
    }
    public static void main(String[] args) {
        char[] myArray={'m','a','h','e','s','h'};
        CharArrayToStrig obj=new CharArrayToStrig();
        System.out.println(obj.toString(myArray));
    }
}
