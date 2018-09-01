package com.mj.project.mjmavenproj1.dao;

import com.mj.project.mjmavenproj1.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class UstawieniaDao {
  @PersistenceContext
  private EntityManager entityManager;


public void setPensjaMinimalna(double tempPensja ){
    Ustawienia u = (Ustawienia) entityManager.createQuery(
            "from Ustawienia where id>0")
            .getSingleResult();
    entityManager.remove(u);
    u.setPensjaMinimalna(tempPensja);
    entityManager.persist(u);
}

    public double getPensjaMinimalna() {
        Ustawienia u = (Ustawienia) entityManager.createQuery(
                "from Ustawienia where id>0")
                .getSingleResult();
        System.out.println(u.getPensjaMinimalna());
    return u.getPensjaMinimalna();
    }

    public void setObecnaStawkaZaMiesiac(double stawka) {
        Ustawienia u = (Ustawienia) entityManager.createQuery(
                "from Ustawienia where id>0")
                .getSingleResult();
        entityManager.remove(u);
        u.setObecnaStawkaZaMiesiac(stawka);
        entityManager.persist(u);

    }

    public double getObecnaStawkaZaMiesiac() {
        Ustawienia u = (Ustawienia) entityManager.createQuery(
                "from Ustawienia where id>0")
                .getSingleResult();
        System.out.println(u.getObecnaStawkaZaMiesiac());
        return u.getObecnaStawkaZaMiesiac();
    }


    public void zapiszTrening(GrafikTreningowPersonalnych g){
            entityManager.persist(g);
    }
}