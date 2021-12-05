import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */
        Student michał = new Student("Michał", "Marek", 30, false);
        Student andrzej = new Student("Andrzej", "Filek", 28, false);
        Student magda = new Student("Magda", "Magdaleńska", 25, true);

        Student[] listaStudentów = new Student[]{michał, andrzej, magda};
        for (Student s:listaStudentów) {
            System.out.println(s.toString());
        }
    }
}
