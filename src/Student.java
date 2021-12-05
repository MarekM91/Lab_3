/**
 * @author Michal Marek
 */
public class Student {
    String imie;
    String nazwisko;
    int wiek;
    boolean studentDzienny;

    public Student(String imie, String nazwisko, int wiek, boolean studentDzienny) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.studentDzienny = studentDzienny;
    }

    @Override
    public String toString() {
        String typStudiów;
        if (studentDzienny){
            typStudiów = "dzienne";
        }else{
            typStudiów = "zaoczne";
        }
        return "Student " + imie + " " + nazwisko + ", " + wiek + " lat," + typStudiów;
    }
}
