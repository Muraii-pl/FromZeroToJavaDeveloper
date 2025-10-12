import java.util.Random;
import java.util.Scanner;

public class Main {
    void main() {
        String isReset;
        Scanner scanner = new Scanner(System.in);
        do {
            int attempt = 0;
            int number = new Random().nextInt(1,101);
            IO.println("Podaj liczbę z przedziału 1-100");
            int userGuess;
            do {
                userGuess = scanner.nextInt();
                attempt++;
                if(userGuess > number) {
                    IO.println("Za dużo");
                }
                if(userGuess < number) {
                    IO.println("Za Mało");
                }

            } while (userGuess != number);
            IO.println(String.format("Brawo liczba prawidłowa: %d, liczba twoich prób to %d", number, attempt));
            IO.println("Jeśli chcesz powtórzyć wpisz 'YES'");
            isReset = scanner.next();
        } while (isReset.equals("YES"));
    }
}
