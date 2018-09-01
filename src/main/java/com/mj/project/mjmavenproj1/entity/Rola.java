package com.mj.project.mjmavenproj1.entity;

import javax.persistence.*;


@Entity
@Table(name="Rola")
public class Rola {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int RolaId;

    private String RolaNazwa;

    private String Email;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="Id_uzytkownika")
    private Uzytkownik uzytkownik;

    public String getRolaNazwa() {
        return RolaNazwa;
    }

    public void setRolaNazwa(String rolaNazwa) {
        RolaNazwa = rolaNazwa;
    }

    public Uzytkownik getUzytkownik() {
        return uzytkownik;
    }

    public void setUzytkownik(Uzytkownik uzytkownik) {
        this.uzytkownik = uzytkownik;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Rola(){}


}
