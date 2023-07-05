public class JavaStringFun {
    public static void main(String[] args) {
        String a="Mahesh Patil";
        String b="Mahesh is from Kolhapur";

        System.out.println("1st string is :"+a);
        System.out.println("2nd string is :"+b);

        System.out.println(a+b);
        System.out.println(a.toUpperCase());//print all the string in uppercase
        System.out.println(b.toLowerCase());//print all the string in lowercase


        System.out.println("Length of 1st string is "+a.length());//calculate length of string
        System.out.println("Length of 2nd string is "+b.length());

        char[] a1=a.toCharArray();//connvert string into character array

        for(int i=0;i<a1.length;i++){//to print char array we need to use for loop
            System.out.println(a1[i]);
        }
        System.out.println(b.charAt(0));//to print character at specific index

        System.out.println(a.equals(b));//compairs two string and returns true if strings are equal and viceversa

        String M="Mahesh";
        String m="mahesh";

        System.out.println(M.equalsIgnoreCase(m));//compairs two string and returns true if strings are equal and viceversa igorig the whether
                                                //                                                    string is in uppercase or lowercase

        System.out.println(M.compareTo(m));
        System.out.println(M.compareToIgnoreCase(m));

        System.out.println(M.startsWith("Mahesh",3));
        System.out.println(M.startsWith("Mahesh"));
        System.out.println(m.startsWith("esh",3));

        String newSubstring = m.substring(3);
        System.out.println(newSubstring);

        System.out.println(m.replace(m, M));

        int[] rollNo=new int[5];
        for(int i1=0;1<=5;i1++){
            rollNo[i1]=i1+1;
            System.out.println(rollNo[i1]);
        }

    }
    
}
