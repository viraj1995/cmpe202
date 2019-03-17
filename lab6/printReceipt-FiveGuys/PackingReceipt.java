
public class PackingReceipt implements PrintOrder
{
     
    public PackingReceipt()
    {

    }
    
     public Component printingSequence() {
        Composite packageReceipt = new Composite( "Packing Receipt" ) ;
        
        CustomBurger customBurger = new CustomBurger("1. LBB") ;
        Bacon bacon = new Bacon("   {{{Bacon}}}");
        Lettuce lettuce = new Lettuce("   Lettuce");
        Tomato tomato = new Tomato("   Tomato");
        Gonion onion = new Gonion("   ->|G Onion");
        JalaGrilled jalapeno = new JalaGrilled("   ->|G Jalapeno");
        Fries fries = new Fries("1. LTL CAJ");
        
        packageReceipt.addChild( customBurger );
        customBurger.addChild( lettuce ) ;
        customBurger.addChild( tomato ) ;
        customBurger.addChild( onion ) ;
        customBurger.addChild( jalapeno ) ;
        customBurger.addChild( bacon ) ;
        packageReceipt.addChild(fries);
        
        return packageReceipt;

    }
}

