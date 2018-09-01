package com.mj.project.mjmavenproj1.entity;


import javax.persistence.*;

import org.joda.time.LocalDate;

import java.util.Date;
import java.util.List;


@Entity
@DiscriminatorValue("1")
public class Klient extends Uzytkownik {

    private static double ObecnaStawkaZaMiesiac;

    private String NumerKartyKredytowej;
    private String TypUmowy;

    private Date UmowaOd;
    private boolean WypelnionaAnkieta;

    @OneToMany(mappedBy="klientPersonal", cascade = {CascadeType.ALL})
    private List<GrafikTreningowPersonalnych> ListaTreningowPersonalnych;

    @ManyToMany(fetch= FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH})
    @JoinTable(name="ankieta_klient", joinColumns = @JoinColumn(name="klient_Id"),
            inverseJoinColumns = @JoinColumn(name="ankieta_id"))
    private List<Ankieta> ListaAnkiet;

    @ManyToMany(fetch= FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH})
    @JoinTable(name="odpowiedz_klient", joinColumns = @JoinColumn(name="klient_Id"),
            inverseJoinColumns = @JoinColumn(name="odpowiedz_id"))
    private List<Odpowiedz> ListaOdpowiedzi;


    public Klient() {
    }

    public static double getObecnaStawkaZaMiesiac() {
        return ObecnaStawkaZaMiesiac;
    }

    public static void setObecnaStawkaZaMiesiac(double obecnaStawkaZaMiesiac) {
        ObecnaStawkaZaMiesiac = obecnaStawkaZaMiesiac;
    }

    public String getNumerKartyKredytowej() {
        return NumerKartyKredytowej;
    }

    public void setNumerKartyKredytowej(String numerKartyKredytowej) {
        NumerKartyKredytowej = numerKartyKredytowej;
    }

    public String getTypUmowy() {
        return TypUmowy;
    }

    public void setTypUmowy(String typUmowy) {
        TypUmowy = typUmowy;
    }

    public Date getUmowaOd() {
        return UmowaOd;
    }

    public void setUmowaOd(Date umowaOd) {
        UmowaOd = umowaOd;
    }

    public boolean isWypelnionaAnkieta() {
        return WypelnionaAnkieta;
    }

    public void setWypelnionaAnkieta(boolean wypelnionaAnkieta) {
        WypelnionaAnkieta = wypelnionaAnkieta;
    }


    public List<GrafikTreningowPersonalnych> getListaTreningowPersonalnych() {
        return ListaTreningowPersonalnych;
    }

    public void setListaTreningowPersonalnych(List<GrafikTreningowPersonalnych> listaTreningowPersonalnych) {
        ListaTreningowPersonalnych = listaTreningowPersonalnych;
    }





}
