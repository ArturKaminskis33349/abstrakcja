public class Ptak extends Zwierze{
    private boolean jestemPtakiem;
    public Ptak(String nazwa, int wiek, boolean jestemPtakiem) {
        super(nazwa, wiek);
        this.jestemPtakiem = jestemPtakiem;
    }

    public boolean isJestemPtakiem() {
        return jestemPtakiem;
    }

    public void setJestemPtakiem(boolean jestemPtakiem) {
        this.jestemPtakiem = jestemPtakiem;
    }

    @Override
    public String wydajDzwiek() {
        return "Wydaje dzwiek ptaka";
    }

    @Override
    public String poruszajSie() {
        return "Poruszam sie jak ptak";
    }

    public String metodaPtaka(){
        return "Napewno jestem Ptakiem";
    }
}
