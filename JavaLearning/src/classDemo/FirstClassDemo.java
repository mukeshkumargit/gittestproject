package classDemo;

public class FirstClassDemo {

	
		int x=90;
		int y=100;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Program Started");

			FirstClassDemo obj1=new FirstClassDemo();
			obj1.sum();
			System.out.println("X value is "+obj1.x);
			System.out.println("Y value is "+obj1.y);

			System.out.println("Program End");
			
			
			FirstClassDemo obj2=new FirstClassDemo();
			
			obj2.sum();
			System.out.println("X value is "+obj1.x);
			System.out.println("Y value is "+obj1.y);
			
		}

	

		public void sum() {
			
			int a=90;
			int b=100;
			int c=a+b;
			System.out.println("Sum of two numbers is "+c);
		}

}
