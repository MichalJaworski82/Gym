package com.mj.project.mjmavenproj1.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="specjalizacja")
public class Specjalizacja {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int IdSpecjalizacja;


    private String Nazwa;
    private String Opis;

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    public String getOpis() {
        return Opis;
    }

    public void setOpis(String opis) {
        Opis = opis;
    }

    public List<Trener> getListaTrenerow() {
        return ListaTrenerow;
    }

    public void setListaTrenerow(List<Trener> listaTrenerow) {
        ListaTrenerow = listaTrenerow;
    }

    @ManyToMany(fetch=FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH})
    @JoinTable(name="trener_spec", joinColumns = @JoinColumn(name="specjalizacja_id"),
    inverseJoinColumns = @JoinColumn(name="uzytkownikId"))
    private List<Trener> ListaTrenerow;



    public Specjalizacja() {
    }


    public void dodajTrenera(Trener trener){
        if (ListaTrenerow==null){
            ListaTrenerow = new ArrayList<>();
        }
        ListaTrenerow.add(trener);
    }

}
