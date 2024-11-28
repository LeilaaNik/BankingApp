package banking.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {
    @Test
    public void testInitialBalance() {
        Account account = new Account("123");
        assertEquals(0, account.getBalance(), 0);
    }

    @Test
    public void testGetAccountId() {
        Account account = new Account("123");
        assertEquals("123", account.getAccountId());
    }

    @Test
    public void testToString() {
        Account account = new Account("123");
        String expected = "Account{accountId='123', balance=0.0}";
        assertEquals(expected, account.toString());
    }
}
