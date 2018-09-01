package com.mj.project.mjmavenproj1.entity;

import javax.persistence.*;
import java.io.File;
import java.util.Date;
import java.util.List;


@Entity
@DiscriminatorValue("4")
public class Trener extends Pracownik{


    private Date DataUrodzenia;
    private double StawkaGodzinowa;
    private File Zdjecie;


    @ManyToMany(fetch= FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH})
    @JoinTable(name="trener_spec", joinColumns = @JoinColumn(name="uzytkownikId"),
            inverseJoinColumns = @JoinColumn(name="specjalizacja_id"))
    private List<Specjalizacja> ListaSpecjalizacji;

    @OneToMany(mappedBy="trenerPersonal", cascade = {CascadeType.ALL})
    private List<GrafikTreningowPersonalnych> ListaTreningowPersonalnych;


    @OneToMany(mappedBy="trenerLiveGrafik", cascade = {CascadeType.ALL})
    private List<GrafikZajecLive> ListaZajecLiveGrafik;


    public Trener() {
    }

    public Trener(String imie, String nazwisko, String email, String pensja, String adres, String numerKontaBankowego){
        this.setImie(imie);
        this.setNazwisko(nazwisko);
        this.setEmail(email);
        this.setPensja(Double.valueOf(pensja));
        this.setAdresZamieszkania(adres);
        this.setNumerKontaBankowego(numerKontaBankowego);
    };

    public List<Specjalizacja> getListaSpecjalizacji() {
        return ListaSpecjalizacji;
    }

    public void setListaSpecjalizacji(List<Specjalizacja> listaSpecjalizacji) {
        ListaSpecjalizacji = listaSpecjalizacji;
    }

    public Date getDataUrodzenia() {
        return DataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        DataUrodzenia = dataUrodzenia;
    }

    public double getStawkaGodzinowa() {
        return StawkaGodzinowa;
    }

    public void setStawkaGodzinowa(double stawkaGodzinowa) {
        StawkaGodzinowa = stawkaGodzinowa;
    }

    public File getZdjecie() {
        return Zdjecie;
    }

    public void setZdjecie(File zdjecie) {
        Zdjecie = zdjecie;
    }

    public List<GrafikTreningowPersonalnych> getListaTreningowPersonalnych() {
        return ListaTreningowPersonalnych;
    }

    public void setListaTreningowPersonalnych(List<GrafikTreningowPersonalnych> listaTreningowPersonalnych) {
        ListaTreningowPersonalnych = listaTreningowPersonalnych;
    }


}
