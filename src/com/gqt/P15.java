package com.gqt;
import java.util.Scanner;
public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter The Size");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			 System.out.println();
		}

	}

}
