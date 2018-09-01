package com.mj.project.mjmavenproj1.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="odpowiedz")
public class Odpowiedz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int OdpowiedzId;

    private String OdpowiedzTresc;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="Id_pytanie")
    private Pytanie PytanieAnkieta;

    @ManyToMany(fetch= FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH})
    @JoinTable(name="odpowiedz_klient", joinColumns = @JoinColumn(name="odpowiedz_Id"),
            inverseJoinColumns = @JoinColumn(name="klient_id"))
    private List<Klient> ListaKlientow;

}
