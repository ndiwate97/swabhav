package com.techlab.commandlineargs;

public class evenOddSwitch {

	public static void main(String[] args) {

		String action = args[args.length - 1];

		int[] number = new int[args.length - 2];
		for (int i = 0; i < args.length - 2; i++) {
			number[i] = Integer.parseInt(args[i]);
		}

		switch (action) {
		case "-even":
			printEvenNo(number);
			break;
		case "-odd":
			printOddNo(number);
			break;
		default:
			printArray(number);
			break;

		}

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

	private static void printArray(int[] numbers) {
		System.out.println("all no:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}
