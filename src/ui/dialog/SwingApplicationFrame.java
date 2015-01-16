package ui.dialog;

import static java.awt.BorderLayout.SOUTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.CurrencySet;

public class SwingApplicationFrame extends JFrame {
    
    private final CurrencySet currencySet;
    private ExchangeDialog exchangeDialog;
    private ActionListener actionListener;

    public SwingApplicationFrame(CurrencySet currencySet) {
        this.currencySet = currencySet;
        this.setTitle("Money Calculator");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(createExchangeDialogPanel(currencySet));
        this.getContentPane().add(createMoneyPanel(), SOUTH);
        this.getContentPane().add(createCalculateButton(), SOUTH);
        this.setVisible(true);
    }

    private JPanel createExchangeDialogPanel(CurrencySet currencySet) {
        SwingExchangeDialog dialogPanel = new SwingExchangeDialog(currencySet);
        exchangeDialog = dialogPanel;
        return dialogPanel;
    }

    private JPanel createMoneyPanel() {
        return new JPanel();
    }

    private JButton createCalculateButton() {
        JButton button = new JButton("Calcular");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionListener.actionPerformed(e);
            }
        });
        return button;
    }

    public void register(ActionListener actionListener){
        this.actionListener = actionListener;
    }
    
    public ExchangeDialog getExchangeDialog() {
        return exchangeDialog;
    }
    
}
