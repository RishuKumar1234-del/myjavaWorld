package javainterview.String;

import java.util.Scanner;

public class Voting {
	
	public static void vote(int n) {
		if(n>=18) {
			System.out.println("you are eligible  for vote");
		}
		else {
			System.err.println("you are not eligible for vote!!");
		}
		
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=scn.nextInt();

        Voting.vote(age);



	}

}
