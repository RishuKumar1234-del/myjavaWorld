package javainterview;

import java.util.Arrays;
import java.util.Iterator;

public class MergSort2 {

	public static void main(String[] args) {
		int[] a= {1,9,8,0};
		int[] b= {9,2,6};
		
		//1.logic for sorting any array
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}

//System.out.println(Arrays.toString(a));
//		for(int i:a) {
//			System.out.print(i+" ");
//		}
		
		System.out.println(Arrays.toString(a));

		
	

		System.out.println("\n\n-----------------------------");
		int[] c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[i+a.length]=b[i];
		}
		//Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		

		
		}

}
