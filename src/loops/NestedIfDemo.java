package loops;

public class NestedIfDemo {

	public static void main(String[] args) {
		int age =10;
		boolean hasLicense = true;
		
		if(age>18) {
			if (hasLicense) {
				System.out.println("you can drive");
			}else {
				System.out.println("you need a driving license");	
			}
		}else {
				System.out.println("you are too young to drive");
		}
	}

}
