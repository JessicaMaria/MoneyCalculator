package control;

import model.CurrencySet;
import model.Exchange;
import model.ExchangeRate;
import model.Money;
import persistance.ExchangeRateLoader;
import process.Exchanger;
import ui.dialog.ExchangeDialog;
import ui.dialog.SwingExchangeDialog;
import ui.display.MoneyDisplay;

public class ExchangeCommand {

    private final CurrencySet currencySet;

    public ExchangeCommand(CurrencySet currencySet) {
        this.currencySet = currencySet;
    }
    
    public void execute(){
        Exchange exchange = readExchange();
        ExchangeRate rate = readExchangeRate(exchange);
        Money money = calculateExchange(exchange,rate);
        displayMoney(money);
    }

    private Exchange readExchange() {
        ExchangeDialog dialog = new SwingExchangeDialog(this.currencySet);
        dialog.execute();
        return dialog.getExchange();
   }

    private ExchangeRate readExchangeRate(Exchange exchange) {
        ExchangeRate rate = new ExchangeRateLoader().load(exchange.getMoney().getCurrency(),exchange.getCurrency());
        return rate;
    }

    private Money calculateExchange(Exchange exchange,ExchangeRate rate) {
        return new Exchanger().exchange(exchange.getMoney(),rate);
    }

    private void displayMoney(Money money) {
        MoneyDisplay moneyDisplay = new MoneyDisplay(money);
    }

}
