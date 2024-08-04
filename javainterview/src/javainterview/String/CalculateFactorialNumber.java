package javainterview.String;

import java.util.Scanner;

public class CalculateFactorialNumber {

	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner scn= new Scanner(System.in);
		int num=scn.nextInt();
		int fact=1;
		if(num==1||num==0) {
			System.out.println("the factorial of " +num+" is : " +1);
			
		}
		else {
			for(int i=1;i<=num;i++) {
				fact=fact*i;
			}
			System.out.println("the factorial of " +num+" is : " +fact);
		}

	}

}
