package com.mj.project.mjmavenproj1.dao;

import com.mj.project.mjmavenproj1.entity.Klient;
import com.mj.project.mjmavenproj1.entity.Pracownik;
import com.mj.project.mjmavenproj1.entity.Rola;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class KlientDao {
  @PersistenceContext
  private EntityManager entityManager;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public void dodajKlienta(Klient klient) {
        String haslo = klient.getHaslo();
        String hashedPassword = bCryptPasswordEncoder.encode(haslo);
        klient.setHaslo(hashedPassword);

        Rola auth = new Rola();
        auth.setRolaNazwa("ROLE_USER");
        klient.add(auth);

        Rola auth2 = new Rola();
        auth2.setRolaNazwa("ROLE_KLIENT");
        klient.add(auth2);

        entityManager.persist(klient);
        return;
    }

    public List<Klient> getListaKlientow() {
        return entityManager.createQuery("from Uzytkownik where rola_disc = 1 order by Email").getResultList();
    }

    public void usunKlienta(Klient klient) {
        entityManager.remove(klient);
    }


    public Klient getKlientByEmail(String email) {
        return (Klient) entityManager.createQuery(
                "from Uzytkownik where email = :email")
                .setParameter("email", email)
                .getSingleResult();
    }


    public void updateKlient(Klient klient, String name, String surname, String haslo, String numerKartyKredytowej) {
        Klient tempKlient = klient;
        tempKlient.setImie(name);
        tempKlient.setNazwisko(surname);
        tempKlient.setNumerKartyKredytowej(numerKartyKredytowej);

        if (!klient.getHaslo().equals(haslo)) {
            String hashedPassword = bCryptPasswordEncoder.encode(haslo);
            tempKlient.setHaslo(hashedPassword);
        }
        entityManager.remove(klient);
        entityManager.persist(tempKlient);

        return;
    }



/*
    public void updatePracownik(Pracownik pracownik) {
        entityManager.merge(pracownik);
        return;
    }
*/


} //