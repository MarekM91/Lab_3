/**
 * @author Michal Marek
 */
public class Student extends Osoba {

    private int nrIndeksu;

    public Student(String imie, String nazwisko, int nrIndeksu) {
        super(imie, nazwisko);
        this.nrIndeksu = nrIndeksu;
    }

    public Student(int nrIndeksu){
        super();
        this.nrIndeksu = nrIndeksu;
    }

    public int getNrIndeksu() {
        return nrIndeksu;
    }

    public void setNrIndeksu(int nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    @Override
    public String toString() {
        return "Student " + super.toString() + " o numerze indeksu " + nrIndeksu;
    }
}
