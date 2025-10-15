package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP Symulacja podstawowych operacji bankomatowych. Wymaga: zmiennej do przechowywania salda, menu w konsoli z opcjami (wpłata, wypłata, saldo, wyjście), pętli do utrzymania menu oraz walidacji danych (np. czy wypłacana kwota nie jest większa niż saldo). Rozwinięcie: użycie prostych tablic lub map do symulacji kilku kont.
public class Main {

    public List<Account> accounts = new ArrayList<Account>();
    public Scanner scanner = new Scanner(System.in);
    void main() {
        int action;
        IO.println("Witam w bankomacie!");

        do {
            IO.println("Wybierz z menu czynnść której chcesz dokonać");

            IO.println("1. Załóż konto");
            IO.println("2. Sprawdz Saldo");
            IO.println("3. Wpłać pieniądze");
            IO.println("4. Wypłać pieniądze");
            IO.println("5. Wyjdz");
            action = this.scanner.nextInt();
            switch (action) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    checkBalance();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    break;
                default:
                    IO.println("Wybrałeś złą opcje. Spróbuj jeszcze raz\n");
            }

        } while (action != 5);

    }

    private void createAccount()  {
        Account newAccount = new Account(this.accounts.size() + 1);
        this.accounts.add(newAccount);
        IO.println("Id twojego konta to: "+newAccount.getId()+ " a saldo wynosi: " + newAccount.getBalance());
    }

    private void checkBalance(int accountId) {
        Account account = accountExist(getAccount(accountId));
        if(account != null) {
            IO.println("Stan twojego konta to: " + account.getBalance());
        }
    }
    private void checkBalance() {
        Account account = accountExist(getAccount(selectAccount()));
        if(account != null) {
            IO.println("Stan twojego konta to: " + account.getBalance());
        }
    }

    private void deposit() {
        Account account = accountExist(getAccount(selectAccount()));
        IO.println("Podaj kwote jaką chcesz wpłacić");
        BigDecimal amount = this.scanner.nextBigDecimal();
        if(account != null) {
           account.deposit(amount);
           checkBalance(account.getId());
        }
    }

    private void withdraw() {
        Account account = accountExist(getAccount(selectAccount()));
        IO.println("Podaj kwote jaką chcesz wyplacic");
        BigDecimal amount = this.scanner.nextBigDecimal();
        if(account != null) {
            account.withdraw(amount);
        }
    }

    private int selectAccount() {
        IO.println("Podaj id konta");
        return this.scanner.nextInt();
    }

    private Account accountExist(Account account) {
        try {
            if(account == null) {
                throw new Exception("Twoje konto nie isnieje, utwórz je lub spóbuj wybrać inne");
            } else {
                return account;
            }
        } catch (Exception e) {
            IO.println(e.getMessage());
            return null;
        }
    }

    private Account getAccount(int accountId) {
        return accounts.stream()
                .filter(a -> a.getId() == accountId)
                .findAny()
                .orElse(null);
    }
}
