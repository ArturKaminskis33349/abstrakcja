public class Gad extends Zwierze{
    private boolean jestemGadem;
    public Gad(String nazwa, int wiek, boolean jestemGadem) {
        super(nazwa, wiek);
        this.jestemGadem = jestemGadem;
    }

    public boolean isJestemGadem() {
        return jestemGadem;
    }

    public void setJestemGadem(boolean jestemGadem) {
        this.jestemGadem = jestemGadem;
    }

    @Override
    public String wydajDzwiek() {
        return "Wydaje dzwiek gada";
    }

    @Override
    public String poruszajSie() {
        return "Poruszam sie jak gad";
    }

    public String metodaGada(){
        return "Tak, napewno jestem gadem";
    }
}
