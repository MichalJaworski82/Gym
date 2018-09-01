package com.mj.project.mjmavenproj1.entity;

import javax.persistence.*;

@Entity
@Table(name="GrafikTreningowPersonalnych")
public class GrafikTreningowPersonalnych {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdGrafikTreningowPersonalnych;

    private String DzienTygodnia;
    private String Godzina;


    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="Id_trenera")
    private Trener trenerPersonal;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="Id_klienta")
    private Klient klientPersonal;

    public GrafikTreningowPersonalnych() {
    }

    public String getDzienTygodnia() {
        return DzienTygodnia;
    }

    public void setDzienTygodnia(String dzienTygodnia) {
        DzienTygodnia = dzienTygodnia;
    }

    public String getGodzina() {
        return Godzina;
    }

    public void setGodzina(String godzina) {
        Godzina = godzina;
    }

    public Trener getTrenerPersonal() {
        return trenerPersonal;
    }

    public void setTrenerPersonal(Trener trenerPersonal) {
        this.trenerPersonal = trenerPersonal;
    }

    public Klient getKlientPersonal() {
        return klientPersonal;
    }

    public void setKlientPersonal(Klient klientPersonal) {
        this.klientPersonal = klientPersonal;
    }

    public GrafikTreningowPersonalnych(String dzienTygodnia, String godzina, Trener trenerPersonal) {
        DzienTygodnia = dzienTygodnia;
        Godzina = godzina;
        this.trenerPersonal = trenerPersonal;
    }
}
