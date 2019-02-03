package SDA;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Metody p = new Metody();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int nowa = scanner.nextInt();
        boolean a = p.isPrimeNumber(nowa);

        if (a == true) {
            System.out.println(nowa + " jest liczba pierwszą");
        } else System.out.println(nowa + " nie jest liczba pierwszą");

    }
}
