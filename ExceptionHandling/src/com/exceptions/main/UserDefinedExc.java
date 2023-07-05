package com.exceptions.main;

import java.util.Scanner;

import com.exeptions.MyException;

public class UserDefinedExc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int num = getNumber(sc);
            System.out.println(num + " is between 20 and 100.");
        } catch (MyException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static int getNumber(Scanner sc) throws MyException {
        while (true) {
            System.out.print("Enter a number between 20 and 100: ");
            int num = sc.nextInt();

            if (num < 20 || num > 100) {
                throw new MyException("Number is outside the valid range.");
            }

            return num;
        }
    }
}
