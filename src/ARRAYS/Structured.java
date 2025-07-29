package ARRAYS;

import java.util.Scanner;

class ArrayOperation {
    int arr[];
    Scanner sc = new Scanner(System.in);

    void createArray() {
        System.out.print("Enter the student count: ");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Array created.");
    }

    void collectData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the marks of student " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Data stored into the array.");
    }

    void displayData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The marks of student no " + (i + 1) + " is = " + arr[i]);
        }
    }
}

public class Structured {
    public static void main(String[] args) {
        ArrayOperation a = new ArrayOperation();
        a.createArray();
        a.collectData();
        a.displayData();
    }
}
