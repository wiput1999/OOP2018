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
public class TestPurse {

    public static void main(String[] args) {
        Purse purse = new Purse(3);
        purse.getBalance();
        purse.isFull();
        purse.insert(new Coin(5, "THB"));
        purse.insert(new Coin(10, "THB"));
        purse.insert(new Coin(0, "THB"));
        purse.insert(new Coin(1, "THB"));
        purse.insert(new Coin(5, "THB"));
        purse.count();
        purse.isFull();
        purse.getBalance();
        purse.toString();
        purse.withdraw(12);
        purse.withdraw(11);
    }
}
