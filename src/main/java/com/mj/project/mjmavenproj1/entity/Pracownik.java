package com.mj.project.mjmavenproj1.entity;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;


@Entity
@DiscriminatorValue("2")
public class Pracownik extends Uzytkownik{
    private static double PensjaMinimalna;
    private double Pensja;
    private Date DataZatrudnienia;
    private String AdresZamieszkania;
    private String NumerKontaBankowego;

    public Pracownik() {
    super();
    }
    public Pracownik(String Email, String Haslo) {
        super();
        this.setEmail(Email);
        this.setHaslo(Haslo);
    }

    public Pracownik(String imie, String nazwisko, String email, String pensja){
        this.setImie(imie);
        this.setNazwisko(nazwisko);
        this.setEmail(email);
        this.Pensja = Double.valueOf(pensja);
    };

    public Pracownik(String imie, String nazwisko, String email, String pensja, String adres, String numerKontaBankowego){
        this.setImie(imie);
        this.setNazwisko(nazwisko);
        this.setEmail(email);
        this.Pensja = Double.valueOf(pensja);
        this.setAdresZamieszkania(adres);
        this.setNumerKontaBankowego(numerKontaBankowego);
    };




    public static double getPensjaMinimalna() {
        return PensjaMinimalna;
    }

    public static void setPensjaMinimalna(double pensjaMinimalna) {
        PensjaMinimalna = pensjaMinimalna;
    }

    public double getPensja() {
        return Pensja;
    }

    public void setPensja(double pensja) {
        Pensja = pensja;
    }

    public Date getDataZatrudnienia() {
        return DataZatrudnienia;
    }

    public void setDataZatrudnienia(Date dataZatrudnienia) {
        DataZatrudnienia = dataZatrudnienia;
    }

    public String getAdresZamieszkania() {
        return AdresZamieszkania;
    }

    public void setAdresZamieszkania(String adresZamieszkania) {
        AdresZamieszkania = adresZamieszkania;
    }

    public String getNumerKontaBankowego() {
        return NumerKontaBankowego;
    }

    public void setNumerKontaBankowego(String numerKontaBankowego) {
        NumerKontaBankowego = numerKontaBankowego;
    }
}
