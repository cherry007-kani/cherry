package first;

public class OperatorPrecedence {

	public static void main(String[] args) {
		int result1 = 5 + 3 *2;
		int result2 = (5+3) *2;
		boolean result3 = 5 >3 && 2< 4 || 1 == 0;
		
		System.out.println(" 5+3*2 :" + result1 );
		System.out.println(" (5+3) *2 :" + result1 );
		System.out.println(" 5 >3 && 2< 4 || 1 == 0 :" + result3 );
	
	}

}
