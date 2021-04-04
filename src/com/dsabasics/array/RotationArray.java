/**
 * 
 */
package com.dsabasics.array;

import java.util.Scanner;

/**
 * @author Emmanuel
 * input Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
 * [3,4,5,6,7,1,2]
 */
public class RotationArray {

	public int[] rotateArray(int[]ar,int d, int n) {

		int [] resultArr = new int[n];
		int k=0;
		for(int i=d+1;i<n;i++){
			resultArr[k++]=ar[i];
		}
		for(int j=0;j<=d;j++) {
			resultArr[k++]=ar[j];
		}
		return rotateOneLeft(ar, d, n);
	}
	
	public int[] rotateOneLeft(int[]arr,int d, int n) {
		
		 int i, temp;
	        temp = arr[0];
	        for (i = 0; i < n - 1; i++)
	            arr[i] = arr[i + 1];
	        arr[n-1] = temp;
	        
	        return arr;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		RotationArray rotateArr = new RotationArray();
		Scanner scan = new Scanner(System.in);
		int[] arr1 = rotateArr.rotateArray(arr, scan.nextInt(), arr.length);
		for (int i : arr1) {
			System.out.println(i);
		}
	}
}
