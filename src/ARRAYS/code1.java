package ARRAYS;
import java.util.Scanner;
public class code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print(" enter the students count:");
		int n=sc.nextInt();
		// creating the array tto store n students marks
		int arr[ ] = new int[n];
		//collecting of storing marks of n studnets
		for(int i=0; i<arr.length; i++) 
		{
			System.out.println("enter the marks of students no: " +(i+1));
			arr[i] = sc.nextInt();
		}
		System.out.println("-----------");
		// display marks stored inside the array 
		for(int i=0; i<arr.length; i++)
		{
		  System.out.println("the marks of students no: " +(i+1) +" is = "+ arr[i]);
		}

	}

}
