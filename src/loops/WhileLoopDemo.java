package loops;

public class WhileLoopDemo {

	public static void main(String[] args) {
		int count =1;
		System.out.println("count:" + count);

	int number = 1234;
	int digits = 0;
	int temp = number;
	
	while (temp !=0) {
		temp /= 10;
		digits++;
	}
	System.out.println(number + "has" + digits+"digits");
}
}
