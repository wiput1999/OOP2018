package coinpurse;

public class Coin implements Comparable<Coin> {

    private double value;
    private String currency;

    public Coin(double value, String currency) {
        setValue(value);
        setCurrency(currency);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object arg) {
        try {
            return this.getValue() == ((Coin) arg).getValue() && this.getCurrency().equals(((Coin) arg).getCurrency());
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.getValue() + "-" + this.getCurrency();
    }

    @Override
    public int compareTo(Coin coin) {
        if (this.getValue() < coin.getValue()) {
            return 1;
        } else if (this.getValue() > coin.getValue()) {
            return -1;
        }
        return 0;
    }
}
