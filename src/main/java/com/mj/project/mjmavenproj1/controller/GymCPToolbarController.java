package com.mj.project.mjmavenproj1.controller;

import com.mj.project.mjmavenproj1.dao.*;
import com.mj.project.mjmavenproj1.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;


import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class GymCPToolbarController {


	@Autowired
	private PracownikDao pracownikDao;


	@Autowired
	private KlientDao klientDao;

	@Autowired
	private TrenerDao trenerDao;


	  @GetMapping("/gymCPMain")
	    public String gymCPMain() {
	        return "/CP/gymCPMain";
	    }



@GetMapping("/gymCPPracownicyList")
public String gymCPUzytkownicyList(ModelMap theModel) {
	List<Pracownik> pracownicy = pracownikDao.getListaPracownikow();

	theModel.put("myPracownicy", pracownicy);
	return "/CP/gymCPPracownicyList";
}


	@GetMapping("/gymCPKlienciList")
	public String gymCPKlienciList(ModelMap theModel) {
		List<Klient> klienci = klientDao.getListaKlientow();

		theModel.put("myKlienci", klienci);

		return "/CP/gymCPKlienciList";
	}

	@GetMapping("/gymCPTrenerzyList")
	public String gymCPTrenerzyList(ModelMap theModel) {
		List<Trener> trenerzy = trenerDao.getListaTrenerow();

		theModel.put("myTrenerzy", trenerzy);

		return "/CP/gymCPTrenerzyList";
	}


	@GetMapping("/pokazDodajPracownikaForm")
	public String pokazDodajPracownikaForm(ModelMap theModel) {
		Pracownik pracownik = new Pracownik();
		theModel.put("pracownik", pracownik);
		return "/CP/gymCPPracownikForm";
	}


	@GetMapping("/pokazDodajKlientaForm")
	public String pokazDodajKlientaForm(ModelMap theModel) {
		Klient klient = new Klient();
		theModel.put("klient", klient);
		return "/CP/gymCPKlientForm";
	}

	@GetMapping("/pokazDodajTreneraForm")
	public String pokazDodajTreneraForm(ModelMap theModel) {
		Trener trener = new Trener();
		theModel.put("trener", trener);
		return "/CP/gymCPTrenerForm";
	}


	@GetMapping("/pokazTrenerFormUpdate")
	public String pokazTrenerFormUpdate(@RequestParam("trenerEmail") String theEmail, ModelMap theModel) {
		Trener trener= trenerDao.getTrenerByEmail(theEmail);
		theModel.put("specList", trenerDao.getListaSpecjalizacji());
		theModel.put("trener",trener);
		return "/CP/gymCPTrenerFormUpdate";
	}


	@GetMapping("/pokazPracownikFormUpdate")
	public String pokazPracownikFormUpdate(@RequestParam("pracownikEmail") String theEmail, ModelMap theModel) {
		Pracownik pracownik = pracownikDao.getPracownikByEmail(theEmail);
		theModel.put("pracownik",pracownik);
		return "/CP/gymCPPracownikFormUpdate";
	}


	@GetMapping("/pokazKlientFormUpdate")
	public String pokazKlientFormUpdate(@RequestParam("klientEmail") String theEmail, ModelMap theModel) {
		Klient klient= klientDao.getKlientByEmail(theEmail);
		theModel.put("klient",klient);
		return "/CP/gymCPKlientFormUpdate";
	}



}
