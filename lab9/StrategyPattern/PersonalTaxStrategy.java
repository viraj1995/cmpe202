public class PersonalTaxStrategy implements TaxStrategy
{

    public PersonalTaxStrategy()
    {
    }

     @Override

    public double calculateTax(double income) {
        System.out.println("Tax");
        double tax = income * 0.25;
        return tax;

    }

}
