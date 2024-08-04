package javainterview;

import java.util.Arrays;

public class MergeAndSortTwoArrays {

	public static void main(String[] args) {
		int[] arr1= {1,9,8,0};
		System.out.println(arr1.length);
		int[] arr2= {9,2,6};
		System.out.println(arr2.length);
		int[] arr3= new int[arr1.length+arr2.length];
		System.out.println(arr3.length);
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++) {
			arr3[i+arr2.length]=arr2[i];
		}
		System.out.println("Merged Array is: ");
        System.out.println(Arrays.toString(arr3));


	}

}
