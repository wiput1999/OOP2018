package coinpurse;

import java.util.ArrayList;
import java.util.Collections;

//TODO import List, ArrayList, and Collections
// You will use Collections.sort() to sort the coins
/**
 * A coin purse contains coins. You can insert coins, withdraw money, check the
 * balance, and check if the purse is full.
 *
 * @author your name
 */
public class Purse {

    /**
     * Collection of objects in the purse.
     */
    //TODO declare a List of Coins named "money".
    /**
     * Capacity is maximum number of items the purse can hold. Capacity is set
     * when the purse is created and cannot be changed.
     */
    private int capacity;
    private ArrayList<Coin> money;

    /**
     * Create a purse with a specified capacity.
     *
     * @param capacity is maximum number of coins you can put in purse.
     */
    public Purse(int capacity) {
        money = new ArrayList<Coin>();
        this.capacity = capacity;
    }

    /**
     * Count and return the number of coins in the purse. This is the number of
     * coins, not their value.
     *
     * @return the number of coins in the purse
     */
    public int count() {
        return money.size();
    }

    /**
     * Get the total value of all items in the purse.
     *
     * @return the total value of items in the purse.
     */
    public double getBalance() {
        double count = 0;
        for (Coin i : money) {
            count += i.getValue();
        }
        return count;
    }

    /**
     * Return the capacity of the coin purse.
     *
     * @return the capacity
     */
    //TODO write accessor method for capacity. Use Java naming convention.
    public int getCapacity() {
        return capacity;
    }

    /**
     * Test whether the purse is full. The purse is full if number of items in
     * purse equals or greater than the purse capacity.
     *
     * @return true if purse is full.
     */
    public boolean isFull() {
        return count() > capacity;
    }

    /**
     * Insert a coin into the purse. The coin is only inserted if the purse has
     * space for it and the coin has positive value. No worthless coins!
     *
     * @param coin is a Coin object to insert into purse
     * @return true if coin inserted, false if can't insert
     */
    public boolean insert(Coin coin) {
        if (coin.getValue() <= 0) {
            return false;
        }
        if (isFull()) {
            return false;
        }
        money.add(coin);
        return true;
    }

    /**
     * Withdraw the requested amount of money. Return an array of Coins
     * withdrawn from purse, or return null if cannot withdraw the amount
     * requested.
     *
     * @param amount is the amount to withdraw
     * @return array of Coin objects for money withdrawn, or null if cannot
     * withdraw requested amount.
     */
    public Coin[] withdraw(double amount) {
        //TODO don't allow to withdraw amount < 0

        if (amount < 0) {
            return null;
        }

        if (amount > getBalance()) {
            return null;
        }

        /*
		* See lab sheet for outline of a solution, 
		* or devise your own solution.
		* The idea is to be greedy.
		* Try to withdraw the largest coins possible.
		* Each time you choose a coin as a candidate for
		* withdraw, add it to a temporary list and
		* decrease the amount (remainder) to withdraw.
		* 
		* If you reach a point where amountNeededToWithdraw == 0
		* then you found a solution!
		* Now, use the temporary list to remove coins
		* from the money list, and return the temporary
		* list (as an array).
         */
        // Did we get the full amount?
        double withdraw = amount;
        Coin[] coins = new Coin[5];

        Collections.sort(money);

        // This code assumes you decrease amount each time you remove a coin.
        // Your code might use some other variable for the remaining amount to withdraw.
        if (withdraw != 0) {
            return null;
        }

        // Success.
        // Remove the coins you want to withdraw from purse,
        // and return them as an array.
        // Use list.toArray( array[] ) to copy a list into an array.
        // toArray returns a reference to the array itself.
        return coins; //TODO replace this with real code
    }

    /**
     * toString returns a string description of the purse contents. It can
     * return whatever is a useful description.
     */
    @Override
    public String toString() {
        //TODO complete this
        return count() + " coin with value " + getBalance();
    }

}
