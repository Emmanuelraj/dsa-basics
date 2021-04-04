/**
 * 
 */
package com.dsabasics.array;

import java.util.Scanner;

/**
 * @author Emmanuel
 *
 */
public class MultiDimensionalArrayDemo 
{
	
	public void printMatrix(int[][] matrix) {
		
		//accessing the arrays
		for (int row = 0; row < matrix.length; row++) {
			 for (int col = 0; col < matrix.length; col++) {
				 System.out.printf(" "+ matrix[row][col]);
			}
			 System.out.println(" ");
		}
	}
	
	public void userDefinedArrayInput() 
	{	
		 // Scanner class to take
        // values from console
        Scanner scanner = new Scanner(System.in);
  
        // totalTestCases = total
        // number of TestCases
        // eachTestCaseValues =
        // values in each TestCase as
        // an Array values
        int totalTestCases, eachTestCaseValues;
  
        // takes total number of
        // TestCases as integer number
        totalTestCases = scanner.nextInt();
  
        // An array is formed as row
        // values for total testCases
        int[][] arrayMain = new int[totalTestCases][];
  
        // for loop to take input of
        // values in each TestCase
        for (int i = 0; i < arrayMain.length; i++) {
            eachTestCaseValues = scanner.nextInt();
            arrayMain[i] = new int[eachTestCaseValues];
            for (int j = 0; j < arrayMain[i].length; j++) {
                arrayMain[i][j] = scanner.nextInt();
            }
        } // All input entry is done.
        
        for (int i = 0; i < arrayMain.length; i++) {
			
        	for(int j=0;j<arrayMain.length;j++) {
        		System.out.println(arrayMain[i][j]);
        	}
		}
  
	}
	
	public static void main(String[] args) {
	MultiDimensionalArrayDemo   multiDimensionalArrayDemo = new MultiDimensionalArrayDemo();
	int[][] arr = {{1,21,3},{4,51,6},{7,81,9}};
	//multiDimensionalArrayDemo.printMatrix(arr);
	multiDimensionalArrayDemo.userDefinedArrayInput();
	}

}
