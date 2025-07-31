package ARRAYS;
import java.util.Scanner;

class ArrayOperations3{
	String arr[][][];
	Scanner sc=new Scanner(System.in);
	
	void CreateArray() {
		System.out.println("Enter school count ");
		int sch= sc.nextInt();
		arr = new String[sch][][];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the class count in school :"+(i+1));
			arr[i]=new String[sc.nextInt()][];
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside School No: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter count of students inside class No: "+(j+1));
				arr[i][j]= new String[sc.nextInt()];
			}
		}
		
		System.out.println("Array created ");
		System.out.println("----------");
	}
	
	void CollectData() {
		for( int i=0; i<arr.length; i++) {
			System.out.println("Inside school no :"+(i+1));
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("Inside class no: "+(j+1));
				for(int k=0; k<arr[i][j].length; k++) {
					System.out.println("Enter the name of student no: "+(k+1));
				arr[i][j][k]= sc.next();
				
			}
		}
	 }		
		
   }
	
	void DisplayData() {
		for(int i=0;i<arr.length; i++) {
			System.out.println("Inside class no: "+(i+1));
			for(int j=0; j<arr[i].length;j++) {
				System.out.println("The name of student no: "+(j+1));
				for(int k=0; k<arr[i][j].length; k++) {
					System.out.println("The name of student no: "+(k+1)+ " is "+arr[i][j][k]);
				}
			}
		}
	}	
}
public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperations3 ao =new ArrayOperations3();
		ao.CreateArray();
		ao.CollectData();
		ao.DisplayData();

	}

}
