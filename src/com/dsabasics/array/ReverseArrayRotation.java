/**
 * 
 */
package com.dsabasics.array;

import java.util.Scanner;

/**
 * @author Emmanuel
 * Write a function rotate(arr[], d, n) that rotates arr[] of size n by d elements. 
Example : 

Input :  arr[] = [1, 2, 3, 4, 5, 6, 7]
         d = 2
Output : arr[] = [3, 4, 5, 6, 7, 1, 2] 

 *
 */
public class ReverseArrayRotation {

	public int[] rotateArray(int[]ar,int d, int n) {
      return ar;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		ReverseArrayRotation rotateArr = new ReverseArrayRotation();
		Scanner scan = new Scanner(System.in);
		int[] arr1 = rotateArr.rotateArray(arr, scan.nextInt(), arr.length);
	}
}
