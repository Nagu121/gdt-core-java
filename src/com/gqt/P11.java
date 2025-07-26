package com.gqt;
import java.util.Scanner;
public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int c=1;
		for (int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(c+"  ");
				c++;
			}
			System.out.println();
		}

	}

}