class ExcCmd{
	public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        String s1 = args[2];

        for (int i = 0; i <= 2; i++) {
            try {
                int num = Integer.parseInt(args[i]);
                System.out.println(num);
            } catch (NumberFormatException exc) {
                System.out.println(args[i] + " is not a valid integer");
            }
	}
    }
}