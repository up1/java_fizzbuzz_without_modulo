package demo.fizzbuzz.no.modulo;

public class FizzBuzz {

	public String say(int input) {
		if(isBuzz(input) && isFizz(input)) {
			return "FizzBuzz";
		}
		if(isFizz(input)) {
			return "Fizz";
		}
		if(isBuzz(input)) {
			return "Buzz";
		}
		return String.valueOf(input);
	}
	
	private boolean isBuzz(int input) {
		for(int number = 0; number<= input; number+=5) {
			if( number == input ) {
				return true;
			}
		}
		return false;
	}

	private boolean isFizz(int input) {
		for(int number = 0; number<= input; number+=3) {
			if( number == input ) {
				return true;
			}
		}
		return false;
	}

}
