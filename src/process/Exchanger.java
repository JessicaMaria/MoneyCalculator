package process;

import model.ExchangeRate;
import model.Money;

public class Exchanger {

    public Money exchage(Money money, ExchangeRate exchangeRate){
        double amount = money.getAmount()*exchangeRate.getRate();
        return new Money(amount,exchangeRate.getTo());
    }
}
