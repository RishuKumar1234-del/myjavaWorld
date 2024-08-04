package javainterview.String;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any word");
		String w=scn.next();
		System.out.println("the Enetered word is: " +w);
		char c=' ';
		String rev="";
//		for(int i=w.length()-1;i>=0;i--) {
//			c=w.charAt(i);
//			rev=rev+c;
//			
//		}
//		System.out.println("the reversed word is: " +rev);
//		System.out.println();
		String reverse = Stream.of(w).map(e->new StringBuilder(e).reverse()).collect(Collectors.joining(""));
		System.out.println("the reversed word is: " +reverse);
		

	}

}
