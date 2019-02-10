
public class GumballMachine
{

    private int num_gumballs;
    private boolean has_quarter;
    private int gumballPrice;
    private int total;
    private String gumballType;

    public GumballMachine( int size, int price, String type )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
        this.gumballType = type;
        this.gumballPrice = price;
        this.total = 0;
    }

    public void insertQuarter(int coin)
    {
        if (( coin == 25 ) && (this.gumballPrice == 25) && (this.gumballType.equals("Quarters")))
        {
            this.has_quarter = true ;
        }
        else if(coin == 25 && gumballPrice == 50 && gumballType.equals("Quarters"))
        {
            total = total + coin;
        }
        else if (gumballPrice == 50 && !gumballType.equals("Quarters"))
        {
            total = total + coin;
        }
        else {
            System.out.println("Invalid");
        }
    }
    
    public void turnCrank()
    {
    	if ( this.has_quarter || (this.total >=this.gumballPrice ) )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_quarter = false ;
    			System.out.println( "Thanks.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please check the coin you inserted." ) ;
    	}        
    }
}
