public class Ssak extends Zwierze{
    private boolean jestemSsakiem;

    public Ssak(String nazwa, int wiek, boolean jestemSsakiem) {
        super(nazwa, wiek);
        this.jestemSsakiem = jestemSsakiem;
    }

    public boolean isJestemSsakiem() {
        return jestemSsakiem;
    }

    public void setJestemSsakiem(boolean jestemSsakiem) {
        this.jestemSsakiem = jestemSsakiem;
    }

    @Override
    public String wydajDzwiek() {
        return "wydaje dziek ssaka";
    }

    @Override
    public String poruszajSie() {
        return "poruszam sie jak ssak";
    }

    public String powiedzCos(){
        return "Jestem Ssakiem";
    }
}
