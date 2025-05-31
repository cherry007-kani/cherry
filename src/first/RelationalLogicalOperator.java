package first;

public class RelationalLogicalOperator {

	public static void main(String[] args) {
		int age =25;
		boolean hasLicense = true;
		
		// Relational
		System.out.println("Age >21:" + (age > 21) );
		System.out.println("Age <= 30:" + (age <=30));
		System.out.println("Age == 25:" + (age == 25));
		System.out.println("Age !=30:" + (age !=30));

		
		// Logical 
		System.out.println("Can drive:" + (age >=16 && hasLicense));
		System.out.println("Is teenager or senior :" + (age >=13 && age <19 || age >= 65));
		System.out.println("Not eligible:" + !(age >=18));
	}

}
