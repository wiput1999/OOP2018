package coinpurse;

//TODO import List, ArrayList, and Collections
// You will use Collections.sort() to sort the coins
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

/**
 * A coin purse contains coins. You can insert coins, withdraw money, check the
 * balance, and check if the purse is full.
 *
 * @author your name
 */
public class Purse {

    private final int capacity;
    private ArrayList<Coin> money;

    public Purse(int capacity) {
        this.capacity = capacity;
        money = new ArrayList<Coin>();
    }

    public int count() {
        return money.size();
    }

    public double getBalance() {
        double balance = 0;
        for (Coin i : money) {
            balance += i.getValue();
        }
        return balance;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean isFull() {
        return money.size() >= capacity;
    }

    public boolean insert(Coin coin) {
        if (!isFull()) {
            money.add(coin);
            Collections.sort(money);
            return true;
        }
        return false;
    }

    public Coin[] withdraw(double amount) {
        ArrayList<Integer> selected = new ArrayList<Integer>();
        double total = 0;

        for (int i = 0; i < money.size(); i++) {
            for (int j = i; j < money.size(); j++) {
                if (total + money.get(j).getValue() <= amount) {
                    selected.add(j);
                    total += money.get(j).getValue();
                } else if (total >= amount) {
                    break;
                }
            }

            if (total == amount) {
                break;
            } else {
                selected.clear();
                total = 0;
            }
        }

        Coin[] withdrawCoins = new Coin[selected.size()];

        for (int i = 0; i < withdrawCoins.length; i++) {
            withdrawCoins[i] = money.get(selected.get(i));
        }

        for (Coin c : withdrawCoins) {
            money.remove(c);
        }

        if (withdrawCoins.length > 0) {
            return withdrawCoins;
        }
        return null;
    }

    public String toString() {
        return count() + " coin(s) with value " + getBalance();
    }

}
