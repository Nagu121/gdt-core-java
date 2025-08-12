package stringprograms;
import java.util.Scanner;
public class Comparetoexample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string -1 :");
		String str1 = sc.next();
		System.out.println("Enter string -2 :");
		String str2 = sc.next();
		
		if(str1.compareTo(str2)==0) {
			System.out.println("String are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		System.out.println("--------------");
		System.out.println("Enter string -1 :");
		 str1 = sc.next();
		System.out.println("Enter string -2 :");
		 str2 = sc.next();
		 
		 if(str1.compareToIgnoreCase(str2)==0) {
				System.out.println("String are equal");
			}
			else {
				System.out.println("Strings are not equal");
		}		
	}

}
