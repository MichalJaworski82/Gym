package com.mj.project.mjmavenproj1.controller;

import com.mj.project.mjmavenproj1.dao.PracownikDao;
import com.mj.project.mjmavenproj1.dao.TrenerDao;
import com.mj.project.mjmavenproj1.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TrenerController {

	@Autowired
	private TrenerDao trenerDao;


	@PostMapping("/zapiszTrenera")
	public String zapiszTrenera(@ModelAttribute("trener") Trener trener) {
			trenerDao.dodajTrenera(trener);
		return "redirect:/gymCPTrenerzyList";
	}


	@PostMapping("/updateTrener")
	public String updateTrener(@ModelAttribute("trener") Trener trener) {
		Trener tempTrener = trenerDao.getTrenerByEmail(trener.getEmail());
		trenerDao.updateTrener(tempTrener, trener.getImie(), trener.getNazwisko(), String.valueOf(trener.getPensja()), trener.getHaslo(), trener.getAdresZamieszkania(), trener.getNumerKontaBankowego());
		return "redirect:/gymCPTrenerzyList";
	}

	@PostMapping("/updateTrenerProfile")
	public String updateTrenerProfile(@ModelAttribute("trener") Trener trener) {
		Trener tempTrener = trenerDao.getTrenerByEmail(trener.getEmail());
		trenerDao.updateTrener(tempTrener, trener.getImie(), trener.getNazwisko(), String.valueOf(trener.getPensja()), trener.getHaslo(), trener.getAdresZamieszkania(), trener.getNumerKontaBankowego());
		return "redirect:/gymindex";
	}


	@GetMapping("/usunTrenera")
	public String usunTrenera(@RequestParam("trenerEmail") String theEmail) {
		Trener trener = trenerDao.getTrenerByEmail(theEmail);
		trenerDao.usunTrenera(trener);
		return "redirect:/gymCPTrenerzyList";
	}


	@GetMapping("/dodajSpecDoTrenera")
	public String dodajSpecDoTrenera(@RequestParam("trenerEmail") String theEmail, @RequestParam("specNazwa") String specNazwa ) {
		Trener trener = trenerDao.getTrenerByEmail(theEmail);
		Specjalizacja spec = trenerDao.getSpecByNazwa(specNazwa);

		if (!trener.getListaSpecjalizacji().contains(spec)){
			trenerDao.dodajSpecDoTrenera(trener, spec);
		}
		return "redirect:/pokazTrenerFormUpdate?trenerEmail="+theEmail;
	}



	@GetMapping("/usunSpecZTrenera")
	public String usunSpecZTrenera(@RequestParam("trenerEmail") String theEmail, @RequestParam("specNazwa") String specNazwa) {
		Trener trener = trenerDao.getTrenerByEmail(theEmail);
		Specjalizacja spec = trenerDao.getSpecByNazwa(specNazwa);
		trenerDao.usunSpecZTrenera(trener,spec);

		return "redirect:/pokazTrenerFormUpdate?trenerEmail="+theEmail;

	}

/////MY PROFILE

	@GetMapping("/usunSpecZTreneraMyProfile")
	public String usunSpecZTreneraMyProfile(@RequestParam("trenerEmail") String theEmail, @RequestParam("specNazwa") String specNazwa) {
		Trener trener = trenerDao.getTrenerByEmail(theEmail);
		Specjalizacja spec = trenerDao.getSpecByNazwa(specNazwa);
		trenerDao.usunSpecZTrenera(trener,spec);

		return "redirect:/gymMyProfileTrener";
	}

	@GetMapping("/dodajSpecDoTreneraMyProfile")
	public String dodajSpecDoTreneraMyProfile(@RequestParam("trenerEmail") String theEmail, @RequestParam("specNazwa") String specNazwa ) {
		Trener trener = trenerDao.getTrenerByEmail(theEmail);
		Specjalizacja spec = trenerDao.getSpecByNazwa(specNazwa);

		if (!trener.getListaSpecjalizacji().contains(spec)){
			trenerDao.dodajSpecDoTrenera(trener, spec);
		}
		return "redirect:/gymMyProfileTrener";
	}


}
