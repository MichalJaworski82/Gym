package com.mj.project.mjmavenproj1.dao;

import com.mj.project.mjmavenproj1.entity.GrafikTreningowPersonalnych;
import com.mj.project.mjmavenproj1.entity.Trener;
import com.mj.project.mjmavenproj1.entity.Uzytkownik;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class GrafikTreningowPersonalnychDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void stworzGrafikDlaTrenera(Trener trener) {
        List<String> DniTygodnia = new ArrayList<String>();
        DniTygodnia.add("Poniedzialek");
        DniTygodnia.add("Wtorek");
        DniTygodnia.add("Sroda");
        DniTygodnia.add("Czwartek");
        DniTygodnia.add("Piatek");

        for (String dzien : DniTygodnia) {
            entityManager.persist(new GrafikTreningowPersonalnych(dzien, "8:00-9:00 ", trener));
            entityManager.persist(new GrafikTreningowPersonalnych(dzien, "9:00-10:00 ", trener));
            entityManager.persist(new GrafikTreningowPersonalnych(dzien, "10:00-11:00 ", trener));
            entityManager.persist(new GrafikTreningowPersonalnych(dzien, "11:00-12:00 ", trener));
            entityManager.persist(new GrafikTreningowPersonalnych(dzien, "12:00-13:00 ", trener));
            entityManager.persist(new GrafikTreningowPersonalnych(dzien, "13:00-14:00 ", trener));
            entityManager.persist(new GrafikTreningowPersonalnych(dzien, "14:00-15:00 ", trener));
            entityManager.persist(new GrafikTreningowPersonalnych(dzien, "15:00-16:00 ", trener));
            entityManager.persist(new GrafikTreningowPersonalnych(dzien, "16:00-17:00 ", trener));
            entityManager.persist(new GrafikTreningowPersonalnych(dzien, "17:00-18:00 ", trener));
            entityManager.persist(new GrafikTreningowPersonalnych(dzien, "18:00-19:00 ", trener));
            entityManager.persist(new GrafikTreningowPersonalnych(dzien, "19:00-20:00 ", trener));
            entityManager.persist(new GrafikTreningowPersonalnych(dzien, "20:00-21:00 ", trener));
        }
    }

    public GrafikTreningowPersonalnych getGrafik(int idTrenera, String godzina, String dzienTygodnia) {
        return (GrafikTreningowPersonalnych) entityManager.createQuery(
                "from GrafikTreningowPersonalnych where dzienTygodnia = :dzienTygodnia " +
                        "and godzina= :godzina and Id_trenera = :idTrenera")
                .setParameter("dzienTygodnia", dzienTygodnia)
                .setParameter("godzina", godzina)
                .setParameter("idTrenera", idTrenera)
                .getSingleResult();
    }

    public List<GrafikTreningowPersonalnych> getGrafikByTrainerId(int idTrenera) {
        return entityManager.createQuery(
                "from GrafikTreningowPersonalnych where Id_trenera = :idTrenera")
                .setParameter("idTrenera", idTrenera)
                .getResultList();
    }


}
