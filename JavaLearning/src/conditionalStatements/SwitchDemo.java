package conditionalStatements;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=5576;
		switch(x) {
		case 1:
			System.out.println("Performance is poor");
			break;
			
		case 2:
			System.out.println("Slow performance");
			break;
			
		case 3:
			System.out.println("Meeting expectation");
			break;
		case 4:
			System.out.println("Well done keep rocking");
			break;
		case 5:
			System.out.println("Empl of the year");
			break;
			
			default :
				System.out.println("You are fired");
		}

	}

}
