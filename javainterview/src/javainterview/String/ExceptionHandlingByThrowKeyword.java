package javainterview.String;

public class ExceptionHandlingByThrowKeyword extends RuntimeException {
	
	String msg;
	
 public ExceptionHandlingByThrowKeyword(String msg) {
	 this.msg=msg;
 }

}

class Vote{
	
	public static void vote(int age) {
		if(age>15) {
			System.out.println("you are eligible for voting");
		}
		else {
			throw new ExceptionHandlingByThrowKeyword("your are not eligible for voting");
		}
	}
	
	
}

class VotingDriver{
	public static void main(String[] args) {
		Vote.vote(14);
	}
}

