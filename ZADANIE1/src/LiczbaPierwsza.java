class LiczbaPierwsza {
    void sprawdzanieLP(int liczba)
    {
        while (liczba <= 2) {
            System.out.println("Jest to liczba pierwsza");
        }
        for  (int i=2; i*i<=liczba; i++)
        {   if (liczba%i==0)
        { System.out.println("To nie jest liczba pierwsza"); }}

    }
}


