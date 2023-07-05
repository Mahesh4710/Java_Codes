import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.studentinfo.Student;

public class MainStudent {
    
    public static void main(String[] args) {
        
        Student[] array1 = new Student[100];
        Student[] array2 = new Student[100];
        int count1 = 0;
        int count2 = 0;
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        
        while (choice != 0) {
            
            System.out.println("MENU");
            System.out.println("1. Add student to list 1");
            System.out.println("2. Add student to list 2");
            System.out.println("3. Merge and sort lists");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter student name, subject, and mark:");
                    String name1 = scanner.next();
                    String subject1 = scanner.next();
                    int mark1 = scanner.nextInt();
                    array1[count1++] = new Student(name1, subject1, mark1);
                    break;
                    
                case 2:
                    System.out.println("Enter student name, subject, and mark:");
                    String name2 = scanner.next();
                    String subject2 = scanner.next();
                    int mark2 = scanner.nextInt();
                    array2[count2++] = new Student(name2, subject2, mark2);
                    break;
                    
                case 3:
                    Student[] mergedArray = mergeArrays(array1, count1, array2, count2);
                    sortArray(mergedArray, count1 + count2);
                    System.out.println("Merged and sorted list:");
                    for (int i = 0; i < count1 + count2; i++) {
                        System.out.println(mergedArray[i].getName() + " " + mergedArray[i].getSubject() + " " + mergedArray[i].getMark());
                    }
                    break;
                    
                case 0:
                    System.out.println("Exiting program...");
                    break;
                    
                default:
                    System.out.println("Invalid choice, try again.");
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
    
    public static Student[] mergeArrays(Student[] array1, int count1, Student[] array2, int count2) {
        Student[] mergedArray = new Student[count1 + count2];
        int i = 0, j = 0, k = 0;
        while (i < count1 && j < count2) {
            if (array1[i].getMark() <= array2[j].getMark()) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }
        while (i < count1) {
            mergedArray[k++] = array1[i++];
        }
        while (j < count2) {
            mergedArray[k++] = array2[j++];
        }
        return mergedArray;
    }
    
    public static void sortArray(Student[] array, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] leftArray = new Student[mid];
        Student[] rightArray = new Student[n - mid];
        for (int i = 0; i < mid; i++) {
            leftArray[i] = array[i];
        }
        for (int i = mid; i < n    ; i++) {
            rightArray[i - mid] = array[i];
        }
        sortArray(leftArray, mid);
        sortArray(rightArray, n - mid);
        mergeArrays(leftArray, mid, rightArray, n - mid, array);
    }

    public static void mergeArrays(Student[] leftArray, int leftCount, Student[] rightArray, int rightCount, Student[] array) {
        int i = 0, j = 0, k = 0;
        while (i < leftCount && j < rightCount) {
            if (leftArray[i].getMark() <= rightArray[j].getMark()) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < leftCount) {
            array[k++] = leftArray[i++];
        }
        while (j < rightCount) {
            array[k++] = rightArray[j++];
        }
    }
}
    
