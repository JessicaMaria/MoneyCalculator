package ui.dialog;

import model.CurrencySet;
import model.Exchange;
import model.Money;

public class ExchangeDialog {
    
    private final CurrencySet currencySet;
    private Exchange exchange; 
            
    public ExchangeDialog(CurrencySet currencySet) {
        this.currencySet = currencySet;
    }
    
    public void execute() {
        exchange = new Exchange(new Money(300,currencySet.get("EUR")),currencySet.get("USD"));        
    }

    public Exchange getExchange() {
        return exchange;
    }

}
