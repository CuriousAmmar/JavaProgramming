package Tax;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        double ProductPrice = 9.99;
        double taxRate = 0.23;
        double taxAmount = ProductPrice * taxRate;
        double Totalprice = taxAmount + ProductPrice;
        double tenKsold = Totalprice * 100000;
        System.out.println("The total price is " + Totalprice);
        System.out.println("The price of 10,000 units is " + tenKsold);

        BigDecimal ProductPriceB = new BigDecimal("9.99");
        BigDecimal taxRateB = new BigDecimal("0.23");
        BigDecimal amountB = new BigDecimal("10000");
        BigDecimal taxAmountB = ProductPriceB.multiply(taxRateB);
        BigDecimal TotalpriceB = taxAmountB.add(ProductPriceB);
        BigDecimal tenKsoldB = TotalpriceB.multiply(amountB);
        System.out.println("The total price is " + TotalpriceB);
        System.out.println("The price of 10,000 units is " + tenKsoldB);
        // we can see that BigDecimal is the correct one

    }
}
