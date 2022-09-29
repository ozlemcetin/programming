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

        assertEquals("12345", account.getAccountNumber());
        assertEquals(0d, account.getBalance());
        assertEquals("Bob Brown", account.getCustomerName());
        assertEquals("bob@email.com", account.getCustomerEmail());
        assertEquals("(087) 123-4567", account.getCustomerPhone());
    }

    @Test
    void deposit() {

        assertEquals(0d, account.getBalance());

        account.deposit(10d);
        assertEquals(10d, account.getBalance());

        account.deposit(-10d);
        assertEquals(10d, account.getBalance());

        account.deposit(0d);
        assertEquals(10d, account.getBalance());

        account.deposit(10d);
        assertEquals(20d, account.getBalance());
    }

    @Test
    void withdraw() {

        account.withdraw(10d);
        assertEquals(0d, account.getBalance());

        account.withdraw(-5d);
        assertEquals(0d, account.getBalance());


        account.deposit(10d);
        account.withdraw(5d);
        assertEquals(5d, account.getBalance());

        account.withdraw(6d);
        assertEquals(5d, account.getBalance());

    }
}