package SDA;

public class Metody {


    public static boolean isPrimeNumber(int liczba) {
        if (liczba < 2) {
            return false;
        }
        for (int i = 2; i <= liczba / 2; i++) {
            if (liczba % i == 0) {
                return false;
            }
        }
        return true;
    }}


