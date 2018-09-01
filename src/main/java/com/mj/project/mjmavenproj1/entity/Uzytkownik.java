package com.mj.project.mjmavenproj1.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="rola_disc", discriminatorType = DiscriminatorType.INTEGER)
@Table(name="uzytkownik")
public abstract class Uzytkownik {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UzytkownikId;


    private String Imie;
    private String Nazwisko;
    private String Haslo;

    private int enabled;

    @Column(name = "Email", unique = true)
    private String Email;


   // @OneToMany(mappedBy="uzytkownik", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @OneToMany(mappedBy="uzytkownik", cascade = {CascadeType.ALL})
    private List<Rola> Role;



    public List<Rola> getRole() {
        return Role;
    }

    public void setRole(List<Rola> role) {
        Role = role;
    }

    public Uzytkownik(){
        enabled =1;
    }


    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public String getHaslo() {
        return Haslo;
    }

    public void setHaslo(String haslo) {
        Haslo = haslo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public int getUzytkownikId() {
        return UzytkownikId;
    }

    public void add(Rola rola) {
        if (Role ==null) {
            Role = new ArrayList<>();
        }
        Role.add(rola);
        rola.setUzytkownik(this);
        rola.setEmail(this.getEmail());
    }
}
