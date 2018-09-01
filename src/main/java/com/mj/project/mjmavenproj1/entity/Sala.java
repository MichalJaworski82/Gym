package com.mj.project.mjmavenproj1.entity;

import javax.persistence.*;
import java.io.File;
import java.util.List;

@Entity
@Table(name="Sala")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int SalaId;

    private String Nazwa;
    private String Opis;
    private Double Metraz;
    private File Zdjecie;

    @OneToMany(mappedBy="salaNaZajeciaLive", cascade = {CascadeType.ALL})
    private List<ZajeciaLive> ListaZajecLive;

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

    public Double getMetraz() {
        return Metraz;
    }

    public void setMetraz(Double metraz) {
        Metraz = metraz;
    }

    public File getZdjecie() {
        return Zdjecie;
    }

    public void setZdjecie(File zdjecie) {
        Zdjecie = zdjecie;
    }

    public List<ZajeciaLive> getListaZajecLive() {
        return ListaZajecLive;
    }

    public void setListaZajecLive(List<ZajeciaLive> listaZajecLive) {
        ListaZajecLive = listaZajecLive;
    }
}
