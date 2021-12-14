public class Main {

    public static void main(String[] args) {

        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */
        Punkt punktA = new Punkt();
        punktA.setpX(7);
        punktA.toString();

        Punkt punkt = new Punkt(1,2,3);
        punkt.toString();

        punktA.setpX(3);
        punktA.setpY(5);
        punktA.setpZ(7);
        punktA.toString();

        System.out.println(punktA.getpX());
        System.out.println(punktA.getpY());
        System.out.println(punktA.getpZ());

        System.out.println("Suma wszystkich punktów to: " + punktA.suma());
        System.out.println("Różnica wszystkich punktów to: " + punktA.roznica());
        System.out.println("Różnica wszystkich punktów przy x = 5, y=2, z=1 to: " + punktA.roznica(5,2,1));

    }
}
