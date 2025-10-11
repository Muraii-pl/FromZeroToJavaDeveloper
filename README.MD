# From Zero to Java Developer 

## Projekty
1. Podstawa
    - [Kalkulator konsolowy](#kalkulator-konsolowy)
    - [Guess the number](#guess-the-number)
    - [Console ATM](#console-atm)
2. Średnio zawansowane
    - [To Do List](#to-do-list)
    - [Library Management](#library-management)
    - [Quiz](#quiz)
    - [Tic-Tac-Toe](#tix-tac-toe)
3. Zawansowane
    - [Śledzenie wydatków](#sledzenie-wydatkow)
    - [Blog RestApi](#blog-rest-api)
    - [Snake](#snake)
    - [Chat](#chat)


### Kalkulator konsolowy

> Aplikacja operująca na tekście w terminalu. Wymaga: czytania danych wejściowych od użytkownika (Scanner), instrukcji warunkowych (if/else lub switch) do wyboru operacji (+, -, *, /) oraz obsługi podstawowych typów danych liczbowych. Rozwinięcie: dodaj obsługę błędu dzielenia przez zero.

### Guess the number

> Prosta gra, w której komputer losuje liczbę. Wymaga: użycia klasy Random do generowania losowej liczby, pętli (while lub do-while) do kontynuowania gry aż do odgadnięcia oraz instrukcji warunkowych do podpowiedzi ("za dużo", "za mało"). Rozwinięcie: dodaj licznik prób.

### Console ATM

> Symulacja podstawowych operacji bankomatowych. Wymaga: zmiennej do przechowywania salda, menu w konsoli z opcjami (wpłata, wypłata, saldo, wyjście), pętli do utrzymania menu oraz walidacji danych (np. czy wypłacana kwota nie jest większa niż saldo). Rozwinięcie: użycie prostych tablic lub map do symulacji kilku kont.

### To Do List

> Aplikacja do zarządzania listą zadań. Wymaga: Programowania Obiektowego (OOP) – stworzenia klasy Task (z polami np. description, dueDate, isCompleted), Kolekcji – użycia ArrayList do przechowywania listy obiektów Task. Rozwinięcie: Obsługa Plików (I/O) – zapisywanie i odczytywanie listy zadań do/z pliku (np. CSV, TXT) przy starcie/zamknięciu programu.

### Library management

>  Książek/Filmów	System do inwentaryzacji zbioru mediów. Wymaga: zaawansowanego OOP – klasa Item (lub Book/Movie) z odpowiednimi atrybutami, użycia List lub Map do przechowywania kolekcji. Rozwinięcie: implementacja funkcji sortowania (np. po tytule, roku) oraz wyszukiwania (np. po fragmencie tytułu).

### Quiz

> Program przeprowadzający testy wiedzy. Wymaga: ładowania pytań i odpowiedzi z zewnętrznego źródła (np. plik JSON lub CSV), obsługi logiki sprawdzania poprawności odpowiedzi i zliczania wyników. Rozwinięcie: tworzenie klasy QuizQuestion i mechanizmu punktacji oraz wyświetlania podsumowania.

### Tic Tac Toe

> Gra dla dwóch graczy w konsoli. Wymaga: dwuwymiarowej tablicy (np. char[3][3]) do reprezentacji planszy, funkcji do sprawdzania warunków zwycięstwa (w poziomie, pionie i na skosach), oraz zarządzania turami graczy. Rozwinięcie: implementacja prostego AI (komputera) jako drugiego gracza.


### Sledznie Wydatkow

> Pełnoprawna aplikacja z interfejsem graficznym. Wymaga: użycia JavaFX lub Swing do stworzenia okien, przycisków i tabel. Wymaga kluczowo: Bazy Danych (SQL) – konfiguracja bazy (np. PostgreSQL, MySQL) i połączenie za pomocą JDBC lub bardziej zaawansowanych narzędzi, jak Hibernate/JPA do zarządzania danymi.

### Blog Rest API

> Projekt backendowy do tworzenia, odczytywania, aktualizowania i usuwania zasobów (np. wpisów blogowych). Wymaga kluczowo: nauki frameworka Spring Boot oraz biblioteki Spring Data JPA. Poznanie metodyk REST oraz protokołu HTTP (żądania GET, POST, PUT, DELETE). Rozwinięcie: dodanie walidacji danych wejściowych.

### Snake

> Bardziej skomplikowana gra z ruchomą grafiką. Wymaga: JavaFX/Swing do wyświetlania grafiki, zaawansowanego zarządzania obiektami, oraz kluczowego elementu: Timerów lub wątków do kontrolowania ciągłego, płynnego ruchu i logiki gry (kolizje, wzrost). Rozwinięcie: system punktacji i zapisywanie najlepszych wyników.

### Chat

> Aplikacja komunikacyjna w czasie rzeczywistym. Wymaga: użycia podstaw gniazd (sockets) Javy do komunikacji sieciowej. Wymaga stworzenia oddzielnego programu Serwera (zarządzającego połączeniami) i Klienta (interfejsu użytkownika). Rozwinięcie: obsługa wielu klientów jednocześnie za pomocą wątków.