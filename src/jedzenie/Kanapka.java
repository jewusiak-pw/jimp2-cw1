package jedzenie;

import java.util.Arrays;

public class Kanapka {
    protected String typ;
    protected String[] zawartosc;

    public Kanapka(String typ) {
        this.typ = typ;
    }

    public void

    private String getAllZawartosc() {
        String tr = "";
        for (String x : zawartosc)
            tr += x;
        return tr;
    }

    public void zjedz() {
        System.out.printf("Zjedzono %s kanapkę z zawartoscią %s.\n", typ, getAllZawartosc());
    }

    public String getTyp() {
        return typ;
    }

    public String[] getZawartosc() {
        return zawartosc;
    }

    @Override
    public String toString() {
        return "Oto %s kanapka z zawartoscią: %s.".formatted(typ, getAllZawartosc());
    }

}
