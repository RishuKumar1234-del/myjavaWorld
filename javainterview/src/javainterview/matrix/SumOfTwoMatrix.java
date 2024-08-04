package javainterview.matrix;

import java.util.Scanner;

public class SumOfTwoMatrix {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter rows and column of Matrix A");
		a=scn.nextInt();
		b=scn.nextInt();
		System.out.println("Enter rows and column of Matrix B");
		c=scn.nextInt();
		d=scn.nextInt();
		if(a==c && b==d) {
			int[][] A=new int[a][b];
			int[][] B=new int[c][d];
			int[][] C=new int[a][b];
			System.out.println("Enter element of  Matrix A");
			for(int i=0;i<a;i++) {
				for(int j=0;j<b;j++) {
					A[i][j]=scn.nextInt();
					
				}
			}
			System.out.println("the  Matrix A is: ");
			for(int i=0;i<a;i++) {
				for(int j=0;j<b;j++) {
					System.out.print(A[i][j] +" ");
					
				}
				System.out.println();
			}
			System.out.println("Enter element of  Matrix B");
			for(int i=0;i<c;i++) {
				for(int j=0;j<d;j++) {
					B[i][j]=scn.nextInt();
					
				}
			}
			System.out.println("the  Matrix B is: ");
			for(int i=0;i<a;i++) {
				for(int j=0;j<b;j++) {
					System.out.print(B[i][j] +" ");
					
				}
				System.out.println();
			}
		
			System.out.println("the resultant  Matrix C is: ");
			for(int i=0;i<a;i++) {
				for(int j=0;j<b;j++) {
					System.out.print(A[i][j] + B[i][j] +" ");
					
				}
				System.out.println();
			}
			
		}
		else {
			System.err.println("addition of two matrices is not possible " );
		}
		
	}

}
