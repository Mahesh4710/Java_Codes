package com.entity;

class DowncastExample {
	public static void main(String[] args) {
		ABC abc = new PQR();	// UPCASTING
		if (abc instanceof PQR) {
			PQR pqr = (PQR) abc;	// SECURE DOWNCASTING
			pqr.display();
		}
	}
}
