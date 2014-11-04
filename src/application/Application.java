package application;

import control.ExchangeCommand;
import model.CurrencySet;
import persistance.CurrencySetLoader;

public class Application {

    public static void main(String[] args) {
        CurrencySet currencySet = null;
        new CurrencySetLoader(currencySet).load();
        
        while(true){
            ExchangeCommand command = new ExchangeCommand(currencySet);
            command.execute();
        }
    }
    
}
