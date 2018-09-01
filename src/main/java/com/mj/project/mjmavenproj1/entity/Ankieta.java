package com.mj.project.mjmavenproj1.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="ankieta")
public class Ankieta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int AnkietaId;

    @OneToMany(mappedBy="AnkietaAktywna", cascade = {CascadeType.ALL})
    private List<Pytanie> ListaPytan;



    @ManyToMany(fetch= FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH})
    @JoinTable(name="ankieta_klient", joinColumns = @JoinColumn(name="ankieta_Id"),
            inverseJoinColumns = @JoinColumn(name="klient_id"))
    private List<Klient> ListaKlientow;

}
