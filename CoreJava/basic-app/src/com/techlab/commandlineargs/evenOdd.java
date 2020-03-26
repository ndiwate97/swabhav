package com.techlab.commandlineargs;

public class evenOdd {

	public static void main(String[] args) {

		int[] number = new int[args.length - 2];
		for (int i = 0; i < args.length - 2; i++) {
			number[i] = Integer.parseInt(args[i]);
		}

		String action = args[args.length - 1];
		System.out.println(action);

		if (action.equals("-even"))
			printEvenNo(number);
		else if (action.equals("-odd"))
			printOddNo(number);
		else if (action.equals("-prime"))
			printPrimeNo(number);
		else
			printArray(number);
	}

	private static void printEvenNo(int[] numbers) {
		System.out.println("even no:");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0)
				System.out.print(numbers[i] + " ");
		}
	}

	private static void printOddNo(int[] numbers) {
		System.out.println("odd no:");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0)
				System.out.print(numbers[i] + " ");
		}
	}

	private static void printPrimeNo(int[] numbers) {
		
		System.out.println("Prime no:");
		for (int n = 0; n < numbers.length; n++) {
			int num = numbers[n];
			boolean flag = false;
			for (int i = 2; i <= num / 2; ++i) {

				if (num % i == 0) {
					flag = true;
				}
				break;
			}

			if (!flag)
				System.out.print(num + " ");
		}
	}

	private static void printArray(int[] numbers) {
		System.out.println("all no:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

	}

}
