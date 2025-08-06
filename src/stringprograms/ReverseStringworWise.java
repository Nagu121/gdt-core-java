package stringprograms;

import java.util.Scanner;

public class ReverseStringworWise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.nextLine();
		
		//step-1 counting spaces
		int spc_count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				
			}
		}
        //step-2 find the word count
		int word_count= spc_count+1;
		
		//step-3 Create array based on word count
		String arr[] = new String[word_count];
		
		//step-4 Traverse the string and Store into the array
		int temp=arr.length-1;
		String temp_str="";
		for(int i=str.length()-1;i>=0;i++);
			if(str.charAt(i)!=' ') {
		    	temp_str+=str.charAt(i);	
		    }
			else {
				arr[tem]
			}
	}

}
