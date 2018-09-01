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
public class TrenerDao {
  @PersistenceContext
  private EntityManager entityManager;

  @Autowired
  GrafikTreningowPersonalnychDao grafikTreningowPersonalnychDao;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public void dodajTrenera(Trener trener) {
        String haslo = trener.getHaslo();
        String hashedPassword = bCryptPasswordEncoder.encode(haslo);
        trener.setHaslo(hashedPassword);

        Rola auth = new Rola();
        auth.setRolaNazwa("ROLE_USER");
        trener.add(auth);

        Rola auth2 = new Rola();
        auth2.setRolaNazwa("ROLE_TRENER");
        trener.add(auth2);

        entityManager.persist(trener);

        grafikTreningowPersonalnychDao.stworzGrafikDlaTrenera(trener);
        return;
    }

    public List<Trener> getListaTrenerow() {
        return entityManager.createQuery("from Uzytkownik where rola_disc = 4 order by Email").getResultList();
    }

    public void usunTrenera(Trener trener) {
        entityManager.remove(trener);
    }

    public Trener getTrenerByEmail(String email) {
        return (Trener) entityManager.createQuery(
                "from Uzytkownik where email = :email")
                .setParameter("email", email)
                .getSingleResult();
    }

    public Specjalizacja getSpecByNazwa(String nazwa) {
        return (Specjalizacja) entityManager.createQuery(
                "from Specjalizacja where Nazwa = :nazwa")
                .setParameter("nazwa", nazwa)
                .getSingleResult();
    }

    public void dodajSpecDoTrenera(Trener trener, Specjalizacja spec){
        trener.getListaSpecjalizacji().add(spec);
    }

    public void usunSpecZTrenera(Trener trener, Specjalizacja spec){
        trener.getListaSpecjalizacji().remove(spec);
    }

    public List<Specjalizacja> getListaSpecjalizacji() {
        return entityManager.createQuery("from Specjalizacja").getResultList();
    }



    public void updateTrener(Trener trener, String imie, String nazwisko, String pensja, String haslo, String adres, String numerKontaBankowego) {
        Trener tempTrener = trener;
        tempTrener.setImie(imie);
        tempTrener.setNazwisko(nazwisko);
        tempTrener.setPensja(Double.valueOf(pensja));
        tempTrener.setAdresZamieszkania(adres);
        tempTrener.setNumerKontaBankowego(numerKontaBankowego);

        if (!trener.getHaslo().equals(haslo)) {
            String hashedPassword = bCryptPasswordEncoder.encode(haslo);
            tempTrener.setHaslo(hashedPassword);
        }
        entityManager.remove(trener);
        entityManager.persist(tempTrener);

        return;
    }






}