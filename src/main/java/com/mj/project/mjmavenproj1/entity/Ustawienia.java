package com.mj.project.mjmavenproj1.entity;

import com.mj.project.mjmavenproj1.dao.UstawieniaDao;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.sql.DataSource;

@Entity
@Table(name="ustawienia")
public class Ustawienia {

    @Transient
    @Autowired
    private UstawieniaDao ustawieniaDao;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;


   private Double PensjaMinimalna;
   private Double ObecnaStawkaZaMiesiac;

  public Ustawienia(){}

    public Double getPensjaMinimalna() {
        return PensjaMinimalna;
    }

    public void setPensjaMinimalna(Double pensjaMinimalna) {
        PensjaMinimalna = pensjaMinimalna;
    }

    public Double getObecnaStawkaZaMiesiac() {
        return ObecnaStawkaZaMiesiac;
    }

    public void setObecnaStawkaZaMiesiac(Double obecnaStawkaZaMiesiac) {
        ObecnaStawkaZaMiesiac = obecnaStawkaZaMiesiac;
    }
}
