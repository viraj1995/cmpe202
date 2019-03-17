  
import java.text.DecimalFormat;

public class Customer {

    public static void main(String[] args)
    {
        DecimalFormat format = new DecimalFormat("0.00");
        double subTotal = 0;
        double tax = 0;
        double totalPrice = 0;
        Component customerReceipt, packingSlip;
        CustomerReceipt cr = new CustomerReceipt();
        customerReceipt = cr.printingSequence() ;
        customerReceipt.printDescription();
        subTotal = customerReceipt.getsubTotal();
        tax = subTotal * 9 / 100;
        totalPrice = subTotal + tax;
        System.out.println("Sub. Total: "+ format.format(subTotal));
        System.out.println("Tax: " + format.format(tax));
        System.out.println("Total: " + format.format(totalPrice));
        System.out.println("\n\n");
        PackingReceipt pr = new PackingReceipt();
        packingSlip = pr.printingSequence() ;
        packingSlip.printDescription();
        


    }
}
 
