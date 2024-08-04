package javainterview;

import java.util.Scanner;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		int a,b;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter first number");
		a=scn.nextInt();
		System.out.println("Enter second number");
		b=scn.nextInt();
		System.out.println("numbers before swapping = " + a + ", " +b);
		
		
		//logic for swapping two numbers
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("numbers after swapping = " + a + ", " +b);
		
		
		

	}

}
