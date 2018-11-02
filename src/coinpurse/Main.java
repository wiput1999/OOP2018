package coinpurse;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ConsoleDialog ui = new ConsoleDialog(new Purse(20));
        ui.run();
    }
}
