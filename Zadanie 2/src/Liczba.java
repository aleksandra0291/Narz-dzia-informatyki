
import java.util.Scanner;
public class Liczba {
    public static void main(String[] args){
        int liczba;
        int liczbaSpr;
        Scanner scan= new Scanner(System.in);
        System.out.println("Podaj liczbę");
        liczba=scan.nextInt();
        {
            Sprawdzenie podanaliczba = new Sprawdzenie();
            podanaliczba.SprawdzenieLiczby(liczba);
        }
    }
}
