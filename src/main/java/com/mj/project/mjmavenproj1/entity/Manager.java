package com.mj.project.mjmavenproj1.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("3")
public class Manager extends Pracownik {
    private String DodatkoweDaneOsobowe;

    public Manager() {
        super();
    }

    public String getDodatkoweDaneOsobowe() {
        return DodatkoweDaneOsobowe;
    }

    public void setDodatkoweDaneOsobowe(String dodatkoweDaneOsobowe) {
        DodatkoweDaneOsobowe = dodatkoweDaneOsobowe;
    }
}
