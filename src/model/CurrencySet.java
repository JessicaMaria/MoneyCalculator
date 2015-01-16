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
    
    private Currency[] getCurrencies(){
        Currency[] currencies = new Currency[currencyList.size()];
        int i = 0;
        for (String key : currencyList.keySet()) {
            currencies[i++] = currencyList.get(key);
        }
        return currencies;
    }
    
    public String[] getCurrenciesString(){
        Currency[] currencies = getCurrencies();
        String[] currenciesString = new String[currencies.length];
        for (int i=0; i<currencies.length; i++)
            currenciesString[i] = currencies[i].getName();
        return currenciesString;
    }
    
    public Currency getCurrency(String currencyString){
        Currency[] currencies = getCurrencies();
        for (Currency currency : currencies){
            if (currency.getName().equals(currencyString))
                return currency;
        }
        return null;
    }
        
}
