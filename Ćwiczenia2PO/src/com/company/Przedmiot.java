package com.company;
import java.util.Scanner;

public class Przedmiot {
    private String nazwa;
    private String typ;
    private String producent;
    private int rok_produkcji;

    void wczytaj() {
        Scanner scan= new Scanner(System.in);
        System.out.println("Podaj nazwę");
        nazwa= scan.nextLine();
        System.out.println("Podaj typ przedmiotu");
        typ= scan.nextLine();
        System.out.println("Podaj producenta");
        producent= scan.nextLine();
        System.out.println("Podaj rok produkcj");
        rok_produkcji= scan.nextInt();
    }
    void wypisz() {
        System.out.println("Nazwa przedmiotu : " + nazwa + "/n" + "Typ przedmiotu : " + typ + "/n" + "Wyprodukowano przez :" + producent + "/n" + "Rok produkcji : " + rok_produkcji + "/n");
    }


}
