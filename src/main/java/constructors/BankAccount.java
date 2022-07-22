package constructors;

import java.time.LocalDateTime;


public class BankAccount {
    String name;
    LocalDateTime opened;
    double balance;

    public BankAccount() {
        this.name = "";
        this.opened = LocalDateTime.now();
        this.balance = 0.0d;
    }

    public BankAccount(String name, LocalDateTime opened, double balance) {
        this.name = name;
        this.opened = opened;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %f",
                this.name, this.opened.toString(), this.balance);
    }
}
