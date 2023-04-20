package conditionalStatements;

public class IfElseIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test Started");

		String browser = "IE";

		if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println("TC executed on chrome");
		}

		else if (browser.equalsIgnoreCase("Firefox")) {
			System.out.println("TC executed on firefox");
		} else if (browser.equalsIgnoreCase("IE")) {
			System.out.println("TC executed on IE");
		} else {
			System.out.println("Kindly provide valid browser names");
		}
		System.out.println("Test End");

	}

}
