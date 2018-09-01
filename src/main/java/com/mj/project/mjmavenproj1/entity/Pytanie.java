package com.mj.project.mjmavenproj1.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="pytanie")
public class Pytanie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int PytanieId;

    private String PytanieTresc;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="Id_ankieta")
    private Ankieta AnkietaAktywna;


    @OneToMany(mappedBy="PytanieAnkieta", cascade = {CascadeType.ALL})
    private List<Odpowiedz> ListaOdpowiedzi;


}
