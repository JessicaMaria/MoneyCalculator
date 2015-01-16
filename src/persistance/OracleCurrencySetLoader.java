package persistance;

import model.Currency;
import model.CurrencySet;

public class OracleCurrencySetLoader implements CurrencySetLoader{
    
    private final CurrencySet currencySet;
    
    public OracleCurrencySetLoader() {
        this.currencySet = new CurrencySet();
    }

    @Override
    public CurrencySet load(){
        currencySet.add(new Currency("EUR","Euro","€"));
        currencySet.add(new Currency("USD","Dolar USA","$"));
        currencySet.add(new Currency("GBP","Libra Esterlina","£"));
        currencySet.add(new Currency("JPY","Yen Japonés","¥"));
        currencySet.add(new Currency("JPY","Yuan Chino","yn"));
        currencySet.add(new Currency("CAD","Dolar Canadiense","$"));
        currencySet.add(new Currency("ARS","Peso Argentino","$A"));
        currencySet.add(new Currency("BRL","Real Brasileño","R$"));
        currencySet.add(new Currency("MXN","Peso Mexicano","$"));
        currencySet.add(new Currency("CHF","Franco Suizo","Fr"));
        return currencySet;
    }
}
