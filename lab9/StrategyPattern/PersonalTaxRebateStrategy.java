public class PersonalTaxRebateStrategy implements TaxStrategy
{
    public PersonalTaxRebateStrategy()
    {
    }
    
     @Override

    public double calculateTax(double income) {
        System.out.println("Rebated");
        double tax = income * 0.15       ;
        return tax;

    }
}
