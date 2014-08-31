package demo.fizzbuzz.no.modulo;

public class FizzBuzz {

	public String say(int input) {
		for(int number = 0; number<= input; number+=3) {
			if( number == input ) {
				return "Fizz";
			}
		}
		return String.valueOf(input);
	}

}
