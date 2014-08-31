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
	
	@Test
	public void numberDivideByFiveShouldReturnBuzz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Buzz", fizzBuzz.say(5));
		assertEquals("Buzz", fizzBuzz.say(10));
		assertEquals("Buzz", fizzBuzz.say(20));
	}
	
	@Test
	public void numberDivideByThreeAndFiveShouldReturnFizzBuzz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("FizzBuzz", fizzBuzz.say(15));
		assertEquals("FizzBuzz", fizzBuzz.say(30));
		assertEquals("FizzBuzz", fizzBuzz.say(45));
	}

}
