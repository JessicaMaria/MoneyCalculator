package application;

import control.ExchangeCommand;
import model.CurrencySet;
import persistance.CurrencySetLoader;

public class Application {

    public static void main(String[] args) {
        CurrencySet currencySet = new CurrencySetLoader().load();
        
        while(true){
            ExchangeCommand command = new ExchangeCommand(currencySet);
            command.execute();
        }
    }
    
}
