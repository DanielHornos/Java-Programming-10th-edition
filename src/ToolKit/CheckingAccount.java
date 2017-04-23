package ToolKit;

/**
 * Chapter 11 Exercise :
 * <p>
 * Created by Daniel Hornos Valiente on 9/8/16.
 */
public class CheckingAccount extends Account {

    protected double OVERDRAFT_LIMIT = -100;

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (mBalance - amount >= OVERDRAFT_LIMIT) {
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount{"+
                "mBalance=" + mBalance +
                '}';
    }
}
