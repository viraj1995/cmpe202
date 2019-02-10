

import java.util.Random;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter(int quarter) {
	        if (gumballMachine.gumballPrice == 25 || gumballMachine.total>50)
		System.out.println("You can't insert another coin");
	}
 
	public void ejectQuarter() {
		System.out.println("Coin returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		if(gumballMachine.total >= 50 || gumballMachine.gumballPrice == 25) 
		gumballMachine.setState(gumballMachine.getSoldState());
		else
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
