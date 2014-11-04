package model;

import java.util.HashMap;

public class CurrencySet {
    
    private final HashMap<String,Currency> currencyList;

    public CurrencySet() {
        this.currencyList = new HashMap<>();
    }

    public void add(Currency currency){
        currencyList.put(currency.getCode(),currency);
    }
    
    public Currency get(String key){
        return currencyList.get(key);
    }
}
