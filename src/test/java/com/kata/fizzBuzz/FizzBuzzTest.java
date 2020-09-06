package com.kata.fizzBuzz;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


class FizzBuzzTest {

	@Test
	void should_return_empty_String_with_one() {
		assertThat(FizzBuzz.compute(1)).isEqualTo("1");
	}
	
	@Test
	void should_return_empty_String_with_two() {
		assertThat(FizzBuzz.compute(2)).isEqualTo("2");
	}
	
	@Test
	void should_return_fizz_with_param_tree() {
		assertThat(FizzBuzz.compute(3)).isEqualTo("Fizz");
	}
	
	@Test
	void should_return_fizz_with_param_six() {
		assertThat(FizzBuzz.compute(6)).isEqualTo("Fizz");
	}
	
	@Test
	void should_return_buzz_with_param_fife() {
		assertThat(FizzBuzz.compute(5)).isEqualTo("Buzz");
	}

	@Test
	void should_return_buzz_with_param_ten() {
		assertThat(FizzBuzz.compute(10)).isEqualTo("Buzz");
	}
	
	@Test
	void should_return_fizzbuzz_with_param_fifeteen() {
		assertThat(FizzBuzz.compute(15)).isEqualTo("FizzBuzz");
	}

}
