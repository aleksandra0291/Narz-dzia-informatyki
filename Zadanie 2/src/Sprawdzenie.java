public class Sprawdzenie {
    public void SprawdzenieLiczby (int liczba)
    { int suma=0;
    int var=liczba;
        while (liczba<0){
            System.out.println("LICZBA NIE JEST PODZIELNA");}
        while (liczba>0) {
           suma+=liczba%10;
           liczba/=10;

        }
        if (var%suma==0){

            System.out.println ("Liczba jest podzielna");
        }
        else {
            System.out.println("Liczba jest niepodzielna");
        }

        System.out.println ("Suma cyfr wynosi" + suma);

    }

}
