package model;

public class ExchangeRate {
    
    private final Currency from;
    private final Currency to;
    private final Number rate;

    public ExchangeRate(Currency from, Currency to, Number rate) {
        this.from = from;
        this.to = to;
        this.rate = rate;
    }

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public Number getRate() {
        return rate;
    }
    
}
