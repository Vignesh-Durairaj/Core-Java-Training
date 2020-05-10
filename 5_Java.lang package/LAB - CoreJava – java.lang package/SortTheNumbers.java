package cg.javaflp.practice;

/**
 * This class is use to sort the numbers in
 * ascending and descending order 
 *
 * Numbers will be pass on run time as command line args 
 */

public class SortTheNumbers {

	public static void main(String[] args) {
		Double a = Double.parseDouble(args[0]);
		Double b = Double.parseDouble(args[1]);
		Double c = Double.parseDouble(args[2]);
		Double d = Double.parseDouble(args[3]);
		
		System.out.println("Four numbers to be sorted..");
		System.out.println(a + ", " + b + ", " + c +", " + d);
		
		/* Logic to sort many numbers
		 * 1. store the numbers as an array
		 * 2. compare each element (number) to its next element (number)
		 * 3. replace the numbers if first no is greater then second
		 * 4. after step 3, array will be modified
		 * 5. iterate step 2 and 3, "length of array" times   
		 */
		
		// step 1 of above mentioned logic
		Double arr[] = new Double[]{a, b, c, d};
		
		// outer FOR loop is for step 5
		for (int i = 0; i < arr.length; i++){
		
			// inner FOR loop is for steps 2, 3 and 4
			for (int j = 1 ; j <arr.length; j++){
				Double temp;
				if (arr[j - 1].compareTo(arr[j])>0){
					temp = arr[j - 1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted value is : ");
		System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2] +", " + arr[3]);
	}

}
