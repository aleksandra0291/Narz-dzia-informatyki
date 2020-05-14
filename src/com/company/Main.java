package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj pierwszy ciąg znaków");
        Scanner scan = new Scanner(System.in);
        String first_string =scan.nextLine();
        System.out.println("Podaj drugi ciąg znaków");
        String second_string =scan.nextLine();
        Levensthein lev = new Levensthein();
        System.out.println(lev.LevQWERTY(first_string,second_string));
    }
}

