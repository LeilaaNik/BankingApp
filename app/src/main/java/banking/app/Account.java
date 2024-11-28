package banking.app;

/**
 * Represents a bank account with an account ID and balance.
 */
public class Account {
    private String accountId;
    private double balance;

    /**
     * Constructs a new Account with the specified account ID and an initial balance of 0.
     *
     * @param accountId the unique identifier for the account
     */
    public Account(String accountId) {
        this.accountId = accountId;
        this.balance = 0;
    }

    /**
     * Returns the account ID.
     *
     * @return the account ID
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Returns the current balance of the account.
     *
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }
}
