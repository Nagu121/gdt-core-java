package stringprograms;

import java.util.Scanner;

public class VowelCount2 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string :");
			String str = sc.nextLine();
			int vowel_count = 0;
			int vowel2_count = 0;
			
			for(int i=0; i<str.length();i++) {
				if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
					if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O'
					|| str.charAt(i)=='U') {
					   vowel_count++;
					}
				
				}
			}	
			
			
			for(int i=0; i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o'
					|| str.charAt(i)=='u') {
					 vowel2_count++;
							}
						}
			}		
				
			
	        System.out.println("Vowel BIG Count = "+vowel_count);
	        System.out.println("Vowel Small Count = "+vowel2_count);
	}

}
