/**
 * @author Michal Marek
 */
public class Wykladowca extends Osoba{

    protected String wydzial;

    public Wykladowca(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    public Wykladowca(String imie, String nazwisko, String wydzial) {
        super(imie, nazwisko);
        this.wydzial = wydzial;
    }

    public String getWydzial() {
        return wydzial;
    }

    public void setWydzial(String wydzial) {
        this.wydzial = wydzial;
    }

    @Override
    public String toString() {
        return "Wykładowca " + super.toString() + " prowadzący zajęcia na wydziale " + wydzial;
    }
}
