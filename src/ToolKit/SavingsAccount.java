package ToolKit;

/**
 * Chapter 11 Exercise :
 * <p>
 * Created by Daniel Hornos Valiente on 9/8/16.
 */
public class SavingsAccount extends Account {

    protected double OVERDRAFT_LIMIT = 0;

    public SavingsAccount(int id, double balance) {
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
        return "SavingsAccount{" +
                "mBalance=" + mBalance +
                '}';
    }
}
