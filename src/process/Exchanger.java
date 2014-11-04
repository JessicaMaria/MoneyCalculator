package process;

import model.ExchangeRate;
import model.Money;

public class Exchanger {

    public Money exchange(Money money, ExchangeRate exchangeRate){
        return new Money(calculateAmount(money,exchangeRate),exchangeRate.getTo());
    }

    private double calculateAmount(Money money, ExchangeRate exchangeRate) {
        return money.getAmount()*exchangeRate.getRate();
    }
}
