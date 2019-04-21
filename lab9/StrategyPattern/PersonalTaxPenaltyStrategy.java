public class PersonalTaxPenaltyStrategy implements TaxStrategy
{
    public PersonalTaxPenaltyStrategy()
    {
    }

     @Override

    public double calculateTax(double income) {
        System.out.println("Penalized");
        double tax = income * 0.3;
        return tax;

    }
}
