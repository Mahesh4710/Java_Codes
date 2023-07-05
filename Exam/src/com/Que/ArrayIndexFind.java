/*
 * 1.      Write
a Java program to find the index of an element in an array of size ‘N’.
 */



package com.Que;

import java.util.Scanner;

public class ArrayIndexFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of array : ");
        int size = sc.nextInt();

        int check = -1;
        int[] arr = new int[size];
        System.out.println("Enter elements in array : ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements in array are : ");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.println("Enter element to search its index : ");
        int ele = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (ele == arr[i]) {
                check = i;
                break; 
            }
        }
        if (check == -1) {
            System.out.println("Element not present in array.");
        } else
            System.out.println("Element present at index " + check);

    }
}







