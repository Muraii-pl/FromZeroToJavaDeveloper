package org.example;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    void main() {
        boolean isReset;
        do {
            IO.println("Podaj pierwsza liczbę");
            this.checkValueIsNumber();
            BigDecimal firstNumber = this.scanner.nextBigDecimal();
            BigDecimal secondNumber;
            String charOfCalc;
            secondNumber = this.getSecondNumber();
            charOfCalc = this.getCharOfCalc();
            do {
                if(secondNumber.equals(BigDecimal.valueOf(0)) && charOfCalc.equals("/")) {
                    IO.println("Nie można dzielić przez zero!");
                    IO.println("Wybierz teraz czy chcesz zmienic liczbę czy operacje");
                    IO.println("1 -> Zmiana liczby, 0 -> Zmiana znaku");
                    int operationType = this.getAndCheckValueIsZeroOrOne();

                    if(operationType == 0) {
                        charOfCalc = this.getCharOfCalc();
                    }
                    if(operationType == 1) {
                        secondNumber = this.getSecondNumber();
                    }
                }

            } while (secondNumber.equals(BigDecimal.valueOf(0)) && charOfCalc.equals("/"));

            switch (charOfCalc) {
                case "+":
                    IO.println("Suma to " + firstNumber.add(secondNumber));
                    break;
                case "-":
                    IO.println("Róznica to: " + firstNumber.subtract(secondNumber));
                    break;
                case "*":
                    IO.println("Iloczyn liczb to: " + firstNumber.multiply(secondNumber));
                    break;
                case "/":
                    IO.println("Iloraz lizcb to: " + firstNumber.divide(secondNumber));
                    break;
                default:
                    IO.println("Podałeś zły znak");
            }
            IO.println("Czy chcesz zresetować? Wybierz 1 jeśli tak lub 0 jeśli nie");
            isReset = this.getAndCheckValueIsZeroOrOne() == 1;

        } while (isReset);
        IO.println("Miłego Dnia!!");

    }

    private BigDecimal getSecondNumber() {
        IO.println("Podaj kolejną liczbę");
        this.checkValueIsNumber();
        return this.scanner.nextBigDecimal();
    }

    private String getCharOfCalc() {
        IO.println("Podaj jedn znak działania z podanych ('+', '-', '*', '/') :");
        List<String> allowValue =  Arrays.asList("+", "-", "/", "*");
        String userInput = "";
        while (this.scanner.hasNext() ) {
            userInput = this.scanner.next();
            if(allowValue.contains(userInput)) {
                break;
            }
            IO.println("Musisz podać odpowiedni znak działania jakie chcesz wykonać");
        }
        return userInput;
    }

    private void checkValueIsNumber() {
        while (!this.scanner.hasNextBigDecimal()) {
            IO.println("Musisz podać liczbę!!");
            this.scanner.next();
        }
    }

    private int getAndCheckValueIsZeroOrOne() {
        int userSelect = -1;
        while (true) {
            this.checkValueIsNumber();
            userSelect = this.scanner.nextInt();
            if(userSelect != 0 && userSelect != 1) {
                IO.println("Musisz podać 0 albo 1");
            } else {
                break;
            }
        }

        return userSelect;
    }

}
