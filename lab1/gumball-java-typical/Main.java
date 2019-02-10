

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5, 25, "Quarters");

		System.out.println("");
		System.out.println("Gumball Machine 1");

		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter ( 5 );
		gumballMachine.turnCrank();
		

		System.out.println("");
		GumballMachine gumballMachine1 = new GumballMachine(5, 50, "Quarters");
		System.out.println("Gumball Machine 2");

		gumballMachine1.insertQuarter( 25 );
		gumballMachine1.turnCrank();
		gumballMachine1.insertQuarter( 25 );
		gumballMachine1.turnCrank();
		gumballMachine1.insertQuarter ( 25 );
		gumballMachine1.insertQuarter ( 25 );
		gumballMachine1.turnCrank();

		System.out.println("");
		GumballMachine gumballMachine2 = new GumballMachine(1, 50, "Any");
		System.out.println("Gumball Machine 3");
		
		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter( 5 );
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter ( 10 );
		gumballMachine2.insertQuarter ( 10 );
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter ( 25 );
		gumballMachine2.insertQuarter ( 5 );
		gumballMachine2.insertQuarter ( 10 );
		gumballMachine2.insertQuarter ( 10 );
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter ( 25 );
		gumballMachine2.insertQuarter ( 25 );
		gumballMachine2.turnCrank();
		
		System.out.println("");
		System.out.println("");
		
		
		
	}
}
