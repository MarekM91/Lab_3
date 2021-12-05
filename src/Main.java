import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 1 enum-y */

        /* zad.1
        a) Stworzyć prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi słownie,
        b) stworzyć prosty enum "StatusEnum" z wartościami KONTYNUUJEMY i KONIEC,
        c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla),
        d) niech w pętli są podawane wartości liczbowe z klawiatury,
        e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie,
        f) umieścić w pętli switch() case: które będą wypisywały cyfry słownie odpowiednio
        do podanych cyfr przez użytkownika,
        g) gdy użytkownik wciśnie 0 ma wyświetlić się status KONIEC w innym wypadku KONTYNUUJEMY :),
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość itereacji:");

        int i = scanner.nextInt();
        System.out.println("Podaj numer:");

        while (i > 0) {
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println(LiczbyEnum.JEDEN);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    break;
                case 2:
                    System.out.println(LiczbyEnum.DWA);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    break;
                case 3:
                    System.out.println(LiczbyEnum.TRZY);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    break;
                case 4:
                    System.out.println(LiczbyEnum.CZTERY);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    break;
                case 5:
                    System.out.println(LiczbyEnum.PIĘĆ);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    break;
                case 6:
                    System.out.println(LiczbyEnum.SZEŚĆ);
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    break;
                case 0:
                    i = 0;
                default:
                    System.out.println(StatusEnum.KONIEC);
                    break;
            }
            i--;
        }

    }

    /* statusy i wybór ze switch case to najczęstsze użycia enumów, enumy są często używane
     * w różnego rodzaju listach, selectach jako krótkie opcje wyboru np. jako status A, X (Aktualny, Usunięty) */

}

