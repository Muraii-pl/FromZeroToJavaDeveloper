package org.example;

import java.math.BigDecimal;

public class Account {
    private final int id;
    private BigDecimal balance = new BigDecimal("0.0");

    Account(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }
    public void withdraw(BigDecimal amount) {
        if(this.balance.compareTo(amount) == -1) {
            IO.println("Kwota wypłaty jest większa niż saldo");
        } else {
            this.balance = this.balance.subtract(amount);
        }
    }
}
