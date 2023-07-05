package com.exceptions.main;

public class ArrayOtOfBondExc {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		try {
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException exc){
			exc.printStackTrace();
		}
		System.out.println();
		System.out.println("We are printing element at array index which is not valid hence getting ArrayOutOfBound ");
		
	}

}
