package ui.display;

import model.Money;

public class MoneyDisplay {
    
    private final Money money;

    public MoneyDisplay(Money money) {
        this.money = money;
        System.out.println(money.getAmount());
    }
    
}
