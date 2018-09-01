package com.mj.project.mjmavenproj1.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="ZajeciaLive")
public class ZajeciaLive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ZajeciaLiveId;

    private String Nazwa;
    private String Opis;
    private int CzasTrwania;


    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="Id_sala")
    private Sala salaNaZajeciaLive;

    @OneToMany(mappedBy="zajeciaLiveGrafik", cascade = {CascadeType.ALL})
    private List<GrafikZajecLive> ListaZajecLiveGrafik;

}
