import java.util.Arrays;
import java.util.List;

public class TaxStrategyMainWithLambda
{

    public TaxStrategyMainWithLambda()
    {
    }

    public static void main(String [] args) { 

        List<TaxStrategy> taxStrategyList =
                Arrays.asList(
                        (income) -> { System.out.println("Tax"); return 0.25 * income; },
                        (income) -> { System.out.println("Penalized"); return 0.30 * income; },
                        (income) -> { System.out.println("Rebated"); return 0.15 * income; }
            );

        taxStrategyList.forEach((strategy) -> System.out.println(strategy.calculateTax(25000.0)));
    }
}

