

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter(int quarter) {
		if( quarter == 25){
             System.out.println("You inserted a coin");  
             gumballMachine.total += quarter;
             if(gumballMachine.gumballPrice == 25 || gumballMachine.total >=50 )
                gumballMachine.setState(gumballMachine.getHasQuarterState());
        }else if(!gumballMachine.gumballType.equals("Quarter")){
                 System.out.println("You inserted a coin");
                 gumballMachine.total += quarter;
                 if(gumballMachine.total >=50)
                 gumballMachine.setState(gumballMachine.getHasQuarterState());
                }else{
                  System.out.println("You haven't inserted a quarter");  
               }
	}
 
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for quarter";
	}
}
