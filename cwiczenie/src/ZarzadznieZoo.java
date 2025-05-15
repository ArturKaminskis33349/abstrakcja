public class ZarzadznieZoo {
    public static void main(String[] args) {
        Ptak ptak1 = new Ptak("orzel", 10, true);
        Gad gad1 = new Gad("lew", 2, true);
        Ssak ssak1 = new Ssak("krokodyel", 3, true);

        ssak1.wyswietlInformacje();
        System.out.println(ssak1.wydajDzwiek());
        System.out.println(ssak1.poruszajSie());
        System.out.println(ssak1.powiedzCos());
        gad1.wyswietlInformacje();
        System.out.println(gad1.wydajDzwiek());
        System.out.println(gad1.poruszajSie());
        System.out.println(gad1.metodaGada());
        ptak1.wyswietlInformacje();
        System.out.println(ptak1.wydajDzwiek());
        System.out.println(ptak1.poruszajSie());
        System.out.println(ptak1.metodaPtaka());
    }
}