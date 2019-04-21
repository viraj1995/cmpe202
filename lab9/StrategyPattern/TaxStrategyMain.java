import java.util.Arrays;
import java.util.List;

public class TaxStrategyMain
{
    public TaxStrategyMain()
    {
    }

    public static void main(String [] args) {

        List<TaxStrategy> taxStrategyList =
                Arrays.asList(
                        new PersonalTaxStrategy(),
                        new PersonalTaxPenaltyStrategy(),
                        new PersonalTaxRebateStrategy());

        for (TaxStrategy taxStrategy : taxStrategyList) {
            System.out.println(taxStrategy.calculateTax(25000.0));
        }
    }
}


