
public class CustomerReceipt implements PrintOrder
{
    // instance variables - replace the example below with your own
    public CustomerReceipt()
    {
    }
    
    public Component printingSequence() {

        Composite customerReceipt = new Composite( "Customer Receipt" ) ;
        
        CustomBurger customBurger = new CustomBurger( "" ) ;
        Burger burger = new Burger("1. LBB",5.59);
        Bacon bacon = new Bacon("   {{{Bacon}}}");
        Lettuce lettuce = new Lettuce("   Lettuce");
        Tomato tomato = new Tomato("   Tomato");
        Gonion onion = new Gonion("   ->|G Onion");
        JalaGrilled jalapeno = new JalaGrilled("   ->|G Jalapeno");
        Fries fries = new Fries("1. LTL CAJ",2.79);
        
        customerReceipt.addChild( customBurger ) ;
        
        customBurger.addChild( burger ) ;
        customBurger.addChild( bacon ) ;
        customBurger.addChild( lettuce ) ;
        customBurger.addChild( tomato ) ;
        customBurger.addChild( onion ) ;
        customBurger.addChild( jalapeno ) ;
        
        customerReceipt.addChild(fries);
        
        return customerReceipt;

    }

 }
