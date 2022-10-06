package org.example.chapter06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankAccountTest {


    private BankAccount account;

    @BeforeEach
    void setUp() {

      /* account = new BankAccount();
        {
            account.setAccountNumber("12345");
            account.setBalance(0d);
            account.setCustomerName("Bob Brown");
            account.setCustomerEmail("bob@email.com");
            account.setCustomerPhone("(087) 123-4567");
        }*/

        account = new BankAccount("12345", 0d, "Bob Brown", "bob@email.com", "(087) 123-4567");
    }

    @Test
    void constructor() {

        {
            assertEquals("12345", account.getAccountNumber());
            assertEquals(0d, account.getBalance());
            assertEquals("Bob Brown", account.getCustomerName());
            assertEquals("bob@email.com", account.getCustomerEmail());
            assertEquals("(087) 123-4567", account.getCustomerPhone());
        }

        {
            account = new BankAccount();
            assertEquals("-1", account.getAccountNumber());
            assertEquals(0d, account.getBalance());
            assertEquals("default name", account.getCustomerName());
            assertEquals("default email", account.getCustomerEmail());
            assertEquals("default phone", account.getCustomerPhone());
        }
    }

    @Test
    void deposit() {

        assertEquals(0d, account.getBalance());

        //Invalid amount. Deposit  of 0.0 not made
        account.deposit(0d);
        assertEquals(0d, account.getBalance());

        //Deposit  of 0.1 made. New balance is 0.1
        account.deposit(0.1d);
        assertEquals(0.1d, account.getBalance());

        //Deposit  of 10.0 made. New balance is 10.1
        account.deposit(10d);
        assertEquals(10.1d, account.getBalance());

        //Invalid amount. Deposit  of -10.0 not made.
        account.deposit(-10d);
        assertEquals(10.1d, account.getBalance());

        //Invalid amount. Deposit  of 0.0 not made.
        account.deposit(0d);
        assertEquals(10.1d, account.getBalance());

        //Deposit  of 10.0 made. New balance is 20.1
        account.deposit(10d);
        assertEquals(20.1d, account.getBalance());
    }

    @Test
    void withdraw() {

        //Only 0.0 available. Withdrawal  of 10.0 not processed.
        account.withdraw(10d);
        assertEquals(0d, account.getBalance());

        //Only 0.0 available. Withdrawal  of -5.0 not processed.
        account.withdraw(-5d);
        assertEquals(0d, account.getBalance());

        //Deposit  of 10.55 made. New balance is 10.55
        //Withdrawal  of 10.55 processed. Remaining balance is 0.0
        account.deposit(10.55d);
        account.withdraw(10.55d);
        assertEquals(0d, account.getBalance());

        //Deposit  of 5.0 made. New balance is 5.0
        //Only 5.0 available. Withdrawal  of 6.0 not processed.
        account.deposit(5d);
        account.withdraw(6d);
        assertEquals(5d, account.getBalance());

    }
}