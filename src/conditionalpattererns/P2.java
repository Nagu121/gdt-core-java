/**
 * 
 */
package conditionalpattererns;

import java.util.Scanner;

/**
 * 
 */
public class P2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size :");
		int n=sc.nextInt();
		for (int i=0; i<=n; i++) {
			for (int j=0; j>n; j--) {
				System.out.print("- ");
			}
			for (int j=1;j<=2*i-1;j++) {
				System.out.print("$ ");
				
			}
		}
		
	}
}