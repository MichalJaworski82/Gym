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
public class PracownikDao {
  @PersistenceContext
  private EntityManager entityManager;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public void dodajPracownika(Pracownik pracownik) {
        String haslo = pracownik.getHaslo();
        String hashedPassword = bCryptPasswordEncoder.encode(haslo);
        pracownik.setHaslo(hashedPassword);

        Rola auth = new Rola();
        auth.setRolaNazwa("ROLE_USER");
        pracownik.add(auth);

        Rola auth2 = new Rola();
        auth2.setRolaNazwa("ROLE_PRACOWNIK");
        pracownik.add(auth2);

        entityManager.persist(pracownik);
        return;
    }

    public List<Pracownik> getListaPracownikow() {
        return entityManager.createQuery("from Uzytkownik where rola_disc = 2 order by Email").getResultList();
    }

    public void usunPracownika(Pracownik pracownik) {
        entityManager.remove(pracownik);
    }

    public Pracownik getPracownikByEmail(String email) {
        return (Pracownik) entityManager.createQuery(
                "from Uzytkownik where email = :email")
                .setParameter("email", email)
                .getSingleResult();
    }

    public void updatePracownik(Pracownik pracownik, String name, String surname, String pensja, String haslo, String adres, String numerKontaBankowego) {
        Pracownik tempPrac = pracownik;
        tempPrac.setImie(name);
        tempPrac.setNazwisko(surname);
        tempPrac.setPensja(Double.valueOf(pensja));
        tempPrac.setAdresZamieszkania(adres);
        tempPrac.setNumerKontaBankowego(numerKontaBankowego);

        if (!pracownik.getHaslo().equals(haslo)) {
            String hashedPassword = bCryptPasswordEncoder.encode(haslo);
            tempPrac.setHaslo(hashedPassword);
        }
        entityManager.remove(pracownik);
        entityManager.persist(tempPrac);

        return;
    }


    public void updatePracownik(Pracownik pracownik) {
        entityManager.merge(pracownik);
        return;
    }



}