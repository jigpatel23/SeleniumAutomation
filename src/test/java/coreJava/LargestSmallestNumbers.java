package coreJava;

import java.util.Arrays;

public class LargestSmallestNumbers {

	public static void main(String[] args) {
		int numbers[] = { -22, 500, -334, 987, 0, -43, 34 };
		System.out.println("ArrayList is: " + Arrays.toString(numbers));
		int largest = numbers[0];
		int smallest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println("Largest number is: " + largest);
		System.out.println("Smallest number is: " + smallest);

	}

}
