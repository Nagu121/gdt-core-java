/**
 * 
 */
package conditionalpattererns;
/* # # # # # 
 * # - - - #
 * # - - - #
 * # - - - #
 * # # # # # 
 */
import java.util.Scanner;

/**
 * @author nagu
 * @category patterns
 * @description This is an example for conditional patterns
 * 
 */
public class P1 {

	/**
	 * @param args
	 * @description This contains source code for pattern
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size :");
		int n=sc.nextInt();
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (i==0 || i==(n-1)|| j==0 || j==(n-1));
				System.out.print("# ");
				
			}
			System.out.println(" ");
		}

	}

}
