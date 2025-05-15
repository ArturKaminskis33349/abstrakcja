public class ZarzadznieZoo {
    public static void main(String[] args) {
        Ptak ptak1 = new Ptak("ptak", 10, true);
        Gad gad1 = new Gad("gad", 2, true);
        Ssak ssak1 = new Ssak("ssak", 3, true);

        System.out.println(ssak1.wydajDzwiek());
        System.out.println(ssak1.poruszajSie());
        System.out.println(ssak1.powiedzCos());
        System.out.println(gad1.wydajDzwiek());
        System.out.println(gad1.poruszajSie());
        System.out.println(gad1.metodaGada());
        System.out.println(ptak1.wydajDzwiek());
        System.out.println(ptak1.poruszajSie());
        System.out.println(ptak1.metodaPtaka());
    }
}