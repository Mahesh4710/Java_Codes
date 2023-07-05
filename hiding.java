// Method Hiding

class ABC {
	public static void show() {
		System.out.println("ABC's show() called");
	}
}

class PQR extends ABC {
	public static void show() {
		System.out.println("PQR's show() called");
	}
}

class AppMain {
	public static void main(String[] args) {

		//ABC abc=new ABC();
		//PQR pqr=new PQR();

		//pqr.show();
		//abc.show();

		ABC obj = new PQR();	// UPCASTING
		obj.show();
	}
}