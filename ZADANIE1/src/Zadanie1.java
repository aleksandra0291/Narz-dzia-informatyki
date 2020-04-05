import java.util.Scanner;

public class Zadanie1 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int liczba;
        int choice;
        System.out.println("Wybierz co mam zrobić: " +
                "1. Sprawdzić czy liczba jest pierwsza " +
                "2. Sprawdzić czy liczba jest parzysta " +
                "3. Zakończyć program ");

        choice=scan.nextInt();
        System.out.println("Podaj liczbę do sprawdzenia");
        liczba=scan.nextInt();
        switch (choice) {
            case 1:
                LiczbaPierwsza var = new LiczbaPierwsza();
                var.sprawdzanieLP(liczba);
                break;
            case 2:
                Dzielenie liczby = new Dzielenie ();
                liczby.dzielBezReszty(liczba);
                break;
            case 3:
                Dzielenie wszystkiego = new Dzielenie();
                LiczbaPierwsza wszystkiego2 = new LiczbaPierwsza();
                break;
        }

    }

}

