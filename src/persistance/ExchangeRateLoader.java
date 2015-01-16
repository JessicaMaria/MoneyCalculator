package persistance;

import model.Currency;
import model.ExchangeRate;

public class ExchangeRateLoader {

    public ExchangeRate load(Currency from, Currency to){
        return new ExchangeRate(from,to,(double) 2); 
    }
}
