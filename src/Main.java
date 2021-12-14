import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */
        Osoba osoba1 = new Osoba("Michał", "Marek", 131);
        Osoba osoba2 = new Osoba("Andrzej", "Kręciołek", 142);
        Osoba osoba3 = new Osoba("Grzegorz", "Prosty", 224);
        Osoba osoba4 = new Osoba("Gienek", "Gieniowski", 659);
        Osoba osoba5 = new Osoba("Ela", "Elenowska", 999);

        Student student1 = new Student(osoba1,WydzialEnum.WYDZIAŁ_EKONOMICZNY);
        Student student2 = new Student(osoba2,WydzialEnum.WYDZIAŁ_FIZYKI);
        Student student3 = new Student(osoba3,WydzialEnum.WYDZIAŁ_INFORMATYCZNY);
        Student student4 = new Student(osoba4,WydzialEnum.WYDZIAŁ_FIZYKI);
        Student student5 = new Student(osoba5,WydzialEnum.WYDZIAŁ_EKONOMICZNY);

        ArrayList list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        list.forEach((n) -> System.out.println(n.toString()));

        }

    }

