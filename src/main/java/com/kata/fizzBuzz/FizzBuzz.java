package com.kata.fizzBuzz;

public class FizzBuzz {

	private static final String FIZZ_BUZZ = "FizzBuzz";
	private static final String BUZZ = "Buzz";
	private static final String FIZZ = "Fizz";

	public static String compute(int number) {

		if (isFizzBuzz(number)) {
			return FIZZ_BUZZ;
		} else {
			if (isFizz(number)) {
				return FIZZ;
			}

			if (isBuzz(number)) {
				return BUZZ;
			}
		}

		return String.valueOf(number);
	}

	private static boolean isFizzBuzz(int number) {
		return isFizz(number) && isBuzz(number);
	}

	private static boolean isBuzz(int number) {
		return number % 5 == 0;
	}

	private static boolean isFizz(int number) {
		return number % 3 == 0;
	}

}
