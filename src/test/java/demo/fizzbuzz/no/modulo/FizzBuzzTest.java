package demo.fizzbuzz.no.modulo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void numberDivideByThreeShouldReturnFizz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Fizz", fizzBuzz.say(3));
		assertEquals("Fizz", fizzBuzz.say(6));
		assertEquals("Fizz", fizzBuzz.say(9));
	}

}
