/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coinpurse;

/**
 *
 * @author wiput
 */
public class Coin implements Comparable<Coin> {

    private double value;
    private String currency;

    Coin(double value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public double getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
    }

    public boolean equals(Coin arg) {
        return arg.getValue() == value && (arg.getCurrency()).equals(currency);
    }

    @Override
    public int compareTo(Coin coin) {
        return (int) (coin.getValue() - this.value);
    }

    @Override
    public String toString() {
        return value + "-" + currency;
    }

}
