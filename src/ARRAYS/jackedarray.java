package ARRAYS;
import java.util.Scanner;

class ArrayOperations2{
	String arr[][][];
	Scanner sc=new Scanner(System.in);
	
	void CreateArray() {
		System.out.println("Enter school count ");
		int sch= sc.nextInt();
		System.out.println("Enter class count in each school: ");
		int cls= sc.nextInt();
		System.out.println("Enter student count in each class: ");
		int stu= sc.nextInt();
		arr= new String[sch][cls][stu];
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
		System.out.println("Data collected ");
		System.out.println("----------");
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


public class jackedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperations2 ao =new ArrayOperations2();
		ao.CreateArray();
		ao.CollectData();
		ao.DisplayData();

	}

}
