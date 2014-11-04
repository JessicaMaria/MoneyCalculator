package persistance;

import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader {

    private final CurrencySet currencySet;
    
    public CurrencySetLoader() {
        this.currencySet = new CurrencySet();
    }

    public CurrencySet load(){
        currencySet.add(new Currency("EUR","Euro","€"));
        currencySet.add(new Currency("USD","Dolar USA","$"));
        return currencySet;
    }
}
