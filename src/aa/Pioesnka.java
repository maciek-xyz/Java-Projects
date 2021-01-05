package aa;

public class Pioesnka implements Comparable<Pioesnka>  {
    String tytul;
    String artysta;
    int ocena;
    int bpm;

    public Pioesnka(String tytul, String artysta, int ocena, int bpm) {
        this.tytul = tytul;
        this.artysta = artysta;
        this.ocena = ocena;
        this.bpm = bpm;
    }

    public String getTytul() {
        return tytul;
    }

    public String getArtysta() {
        return artysta;
    }

    public int getOcena() {
        return ocena;
    }

    public int getBpm() {
        return bpm;
    }

    @Override
    public String toString() {
        return "Pioesnka{" +
                "tytul='" + tytul + '\'' +
                ", artysta='" + artysta + '\'' +
                ", ocena=" + ocena +
                ", bpm=" + bpm +
                '}';
    }

    @Override
    public int compareTo(Pioesnka o) {
        return ocena - o.ocena;
    }

}
