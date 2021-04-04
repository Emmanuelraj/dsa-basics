/**
 * 
 */
package com.dsabasics.array;



/**
 * @author Emmanuel
 * array is sequence of same data types, it can object as well
 * it allows continous memerory allocation and fixed size
 * In this class we are going to understand how to define single array and access
 * after finishing that let have 
 *  singleDimensional Array
 */
public class ArrayIntro {

	
	/**
	 * syntax of array 
	 * dataty var = new dataty[];
	 * array literals 
	 * dty [] var = new dty[]{}
	 * array literal
	 *  int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
	 *  or
	 *  int[] intArray = new int[20];
	 */
	/**
	 * 
	 * @param args
	 */
   public static void main(String[] args) {
	   
	   //declare an array
	   int[] arr;
       //initialize the array	   
	   arr = new int[5];
	
	   for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	   int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
	   
	   for (int i = 0; i < intArray.length; i++) {
		System.out.println(intArray[i]);
	}
	   //Object array
	   Student[] studArr = new Student[4];
	   
	   
	   studArr[0] = new Student(10,"Imman");
	   studArr[1] = new Student(11,"Raj");
	   studArr[2] = new Student(21,"sf");
	   studArr[3] = new Student(41,"dfg0");
	   
	   for(int i=0;i<studArr.length;i++) {
		   System.out.println(studArr[i].name+""+studArr[i].roll_no);
	   }
	   
	   //possible err AIOBEx
	  // System.out.println(studArr[4]);
	   
	   int[] arr1 = new int[2];
       arr1[0] = 10;
       arr1[1] = 20;
 
       for (int i = 0; i <= arr1.length; i++)
           System.out.println(arr1[i]);
   }
}
