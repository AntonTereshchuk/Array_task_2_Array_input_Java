package task;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] array;
		int arrayDimension;
		
		System.out.println("Please enter array dimension: ");
		arrayDimension = sc.nextInt();
				
		array = new int[arrayDimension];
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("Enter integer element of array with index " + i + " :");
			
			if (!sc.hasNextInt()) {
				System.out.println("Wrong integer number !");
				break;
			}
			
			array[i] = sc.nextInt();	
		}
		
		System.out.println();
		System.out.println(Arrays.toString(array));
		
		sc.close();

	}

}
