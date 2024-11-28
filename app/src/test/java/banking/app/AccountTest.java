package banking.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {
    @Test
    public void testInitialBalance() {
        Account account = new Account("123");
        assertEquals(0, account.getBalance(), 0);
    }
}
