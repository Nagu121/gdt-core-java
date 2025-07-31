package ARRAYS;

import java.util.Scanner;
class Movieoperatoins{
	long arr[][][];
	long investment;
	long prev_profit;
	long sum_revenue;
	Scanner sc=new Scanner(System.in);
	
	void CreateArray() {
		System.out.println("Enter language count ");
		int lan = sc.nextInt();
		System.out.println("Enter category count in each language: ");
		int cat = sc.nextInt();
		System.out.println("Enter movie count in each category ");
		int mov = sc.nextInt();
		
		arr= new long[lan][cat][mov];
		
		System.out.println("Array created ");
		System.out.println("--------------------");
		
		System.out.println(" Enter the investment ");
		investment = sc.nextLong();
		System.out.println("Enter the previours year profit ");
		prev_profit = sc.nextLong();
		
		System.out.println("--------------------");
	}
	
	void RevenueData() {
		for( int i=0; i<arr.length; i++) {
			System.out.println("Inside language no :"+(i+1));
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("Inside category no: "+(j+1));
				for(int k=0; k<arr[i][j].length; k++) {
					System.out.println("Enter the revenue of movie no: "+(k+1));
				arr[i][j][k]= sc.nextLong();
				sum_revenue += arr[i][j][k];
				
			}
		}
	}		
		System.out.println("Data collected & caluclated");
		System.out.println("--------------------");

   }
	
	void displayData() {
		for(int i=0;i<arr.length; i++) {
			System.out.println("Inside language no: "+(i+1));
			for(int j=0; j<arr[i].length;j++) {
				System.out.println("Inside category no: "+(j+1));
				for(int k=0; k<arr[i][j].length; k++) {
					System.out.println(" the revenue of movie no: "+(k+1)+"is = "+arr[i][j][k]); 
					
				}
			}
		}
		System.out.println("--------------------");
		System.out.println("Overal revenue :"+sum_revenue);
		System.out.println("--------------------");
        if(sum_revenue>investment) {
        	   long profit = (sum_revenue-investment);
        	   System.out.println("The profit made by Heamanth is ="+profit);
        	   if(profit>prev_profit) {
        		   System.out.println("Hemanth Has made more profit than previous year");
        	   }
        }

	}	
}


public class Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movieoperatoins mo =new Movieoperatoins();
		mo.CreateArray();
		mo.RevenueData();
		mo.displayData();

	}

}
