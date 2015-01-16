package ui.dialog;

import java.awt.FlowLayout;
import java.awt.PopupMenu;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Currency;
import model.CurrencySet;
import model.Exchange;
import model.Money;

public class SwingExchangeDialog extends JPanel implements ExchangeDialog {
    
    private final CurrencySet currencySet;
    private Exchange exchange; 
    private Double amount;
    private Currency fromCurrency;
    private Currency toCurrency;
            
    public SwingExchangeDialog(CurrencySet currencySet) {
        this.currencySet = currencySet;
        this.setLayout(new FlowLayout());
        this.add(createAmountField());
        this.add(createFromCurrencyField());
        this.add(createToCurrencyField());
    }
    
    @Override
    public void execute() {
        exchange = new Exchange(new Money(amount, fromCurrency), toCurrency);
    }

    @Override
    public Exchange getExchange() {
        return exchange;
    }

    private JTextField createAmountField() {
        JTextField input = new JTextField();
        input.setColumns(20);
        input.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                amount = Double.parseDouble(input.getText());
            }
        });
        return input;
    }

    private JComboBox<String> createFromCurrencyField() {
        JComboBox<String> combo = new JComboBox<>(currencySet.getCurrenciesString());
        combo.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() != ItemEvent.SELECTED)return;
                fromCurrency = currencySet.getCurrency(combo.getItemAt(combo.getSelectedIndex()));
            }
        });
        return combo;
    }

    private JComboBox<String> createToCurrencyField() {
        JComboBox<String> combo = new JComboBox<>(currencySet.getCurrenciesString());
        combo.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() != ItemEvent.SELECTED) return;
                toCurrency = currencySet.getCurrency(combo.getItemAt(combo.getSelectedIndex()));
            }
        });
        return combo;
    }

}
