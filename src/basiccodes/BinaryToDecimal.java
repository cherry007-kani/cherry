package basiccodes;

public class BinaryToDecimal {

	public static void main(String[] args) {
		String binary = "110110111";
		int decimal = Integer.parseInt(binary, 2);
		System.out.println("Decimal of" + binary + "is:" + decimal);

	}

}
