
//Zdefiniuj klasę TOsoba posiadającą następujące pola:
//- imie
//- nazwisko
//- wiek
//- adres (obiekt niezależnej klasy o polach: miasto, ulica, numer z konstruktorem ustawiającym
//pola na podstawie parametrów, destruktorem oraz metodą Wyswietl).
//Klasa zawiera następujące metody:
//- konstruktor ustawiający wszystkie pola na podstawie swoich parametrów,
//-Wyswietl – wyświetlającą informacje o osobie,
//- PodajImie – zwraca imię,
//- PodajNazwisko – zwraca nazwisko,
//- destruktor.
//Zdefiniuj klasę TStudent dziedziczącą po klasie TOsoba. Klasa TStudent posiada dodatkowo pola:
//- kierunek
//- rok
//oraz metody:
//- konstruktor ustawiający wszystkie pola na podstawie swoich parametrów,
//-Wyswietl – wyświetlającą informacje o studencie,
//- PodajKierunek – zwraca kierunek,
//- destruktor.
//Dla każdej klasy zdefiniuj konstruktory i destruktory tak, aby wyświetlały komunikaty informujące o swoim
package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nazwisko");
        String surname = scan.nextLine();
        System.out.println("Imię");
        String name = scan.nextLine();
        System.out.println("Miasto");
        String city = scan.nextLine();
        System.out.println("Ulica");
        String street = scan.nextLine();
        System.out.println("Kod Pocztowy");
        String zip_code = scan.nextLine();
        System.out.println("Wiek");
        int age = scan.nextInt();
        int liczba= scan.nextInt();
        Person p1 = new Person("","",liczba,"","","");
    }
}
