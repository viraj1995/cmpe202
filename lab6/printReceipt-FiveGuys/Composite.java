   
import java.text.DecimalFormat;

import java.util.ArrayList;

public class Composite implements Component {

    protected ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String description ;
    protected double price ;
    
    public Composite ()
    {
       
    }
    
    public Composite ( String d )
    {
        description = d ;
    }
    
    public Composite ( String d, double p )
    {
        description = d ;
        price = p;
    }

    public void printDescription() {

        if (price > 0)
            description = description + " " + String.valueOf(price);

        System.out.println( description );

        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }
    
    public double getsubTotal() {
        double subTotal = 0;
        DecimalFormat format = new DecimalFormat("0.00");
        
          
        for (Component obj  : components)
        {
            subTotal += obj.getsubTotal();
            
        }
        
        return subTotal;
        
    }
    

    public void addChild(Component c) {
        components.add( c ) ;
    }
     
    public void removeChild(Component c) {
        components.remove(c) ;
    }
     
    public Component getChild(int i) {
        return components.get( i ) ;
    }
     
}
 
