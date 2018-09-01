package com.mj.project.mjmavenproj1.entity;

import javax.persistence.*;

@Entity
@Table(name="GrafikZajecLive")
public class GrafikZajecLive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdGrafikZajecLive;

    private String DzienTygodnia;
    private String Godzina;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="Id_zajeciaLive")
    private ZajeciaLive zajeciaLiveGrafik;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="Id_terener")
    private Trener trenerLiveGrafik;


}
