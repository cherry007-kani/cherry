package basiccodes;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n =10;
		int first =0, second =1;
		System.out.print("fabonacci series:" + first+" "+second);
		
		for(int i=2; i<n; i++) {
			int next = first + second;
			System.out.println(" "+next);
			first =second;
			second =next;
		}
	}

}
