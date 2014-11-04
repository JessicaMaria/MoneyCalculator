package control;

import model.CurrencySet;
import model.Exchange;
import model.ExchangeRate;
import model.Money;
import ui.dialog.ExchangeDialog;
import ui.display.MoneyDisplay;

public class ExchangeCommand {

    private final CurrencySet currencySet;

    public ExchangeCommand(CurrencySet currencySet) {
        this.currencySet = currencySet;
    }
    
    public void execute(){
        Exchange exchange = readExchange();
        ExchangeRate rate = readExchangeRate(exchange);
        Money money = exchange(exchange.getMoney(),rate);
        MoneyDisplay moneyDisplay = new MoneyDisplay(money);
    }

    private Exchange readExchange() {
        ExchangeDialog dialog = new ExchangeDialog(this.currencySet);
        dialog.execute();
        return dialog.getExchange();
   }

    private ExchangeRate readExchangeRate(Exchange exchange) {
        ExchangeRate rate = null;
        return rate;
    }

    private Money exchange(Money money, ExchangeRate rate) {
        Money money2 = null;
        return money2;
    }
}
