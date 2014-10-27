package model;

public class Money {
    
    private final Number money;
    private final Currency currency;

    public Money(Number money, Currency currency) {
        this.money = money;
        this.currency = currency;
    }

    public Number getMoney() {
        return money;
    }

    public Currency getCurrency() {
        return currency;
    }
    
}
