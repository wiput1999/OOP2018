package lab10;

import java.io.*;

/**
 *
 * @author wiput
 */
public class CustomerStorage {

    public static double getBalance() throws FileNotFoundException, IOException {
        FileInputStream fin = new FileInputStream("Customer.dat");
        DataInputStream din = new DataInputStream(fin);
        double balance = din.readDouble();

        return balance;
    }

    public static void saveBalance(double balance) throws FileNotFoundException, IOException {
        FileOutputStream fout = new FileOutputStream("Customer.dat");
        DataOutputStream dout = new DataOutputStream(fout);
        dout.writeDouble(balance);
    }
}
