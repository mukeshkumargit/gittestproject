package conditionalStatements;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test Started");
		
		String browser="chrome";
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.out.println("TC executed on chrome");
		}

		
		else
		{
			System.out.println("TC executed on firefox");
		}
		System.out.println("Test End");

	}

}
