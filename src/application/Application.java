package application;

import control.ExchangeCommand;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.CurrencySet;
import persistance.OracleCurrencySetLoader;
import ui.dialog.SwingApplicationFrame;

public class Application {

    public static void main(String[] args) {
        CurrencySet currencySet = new OracleCurrencySetLoader().load();
        SwingApplicationFrame frame = new SwingApplicationFrame(currencySet);
        frame.register(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new ExchangeCommand((CurrencySet) frame.getExchangeDialog()).execute();
            }
        });
    }
}
