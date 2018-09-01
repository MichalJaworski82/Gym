package com.mj.project.mjmavenproj1.controller;

import com.mj.project.mjmavenproj1.dao.PracownikDao;
import com.mj.project.mjmavenproj1.entity.Pracownik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PracownikController {


	@Autowired
	private PracownikDao pracownikDao;



	@PostMapping("/zapiszPracownika")
	public String zapiszUzytkownika(@ModelAttribute("pracownik") Pracownik pracownik) {
		//wyjatek zapobiegajacy wywaleniu sie apki przy wrzuceniu dublujacego sie PK email
		try {
			pracownikDao.dodajPracownika(pracownik);
		}catch (Exception e){System.out.println("Can't create employee. Email already taken");}
		return "redirect:/gymCPPracownicyList";
	}


	@PostMapping("/updatePracownik")
	public String updatePracownik(@ModelAttribute("pracownik") Pracownik pracownik) {
		Pracownik tempPrac = pracownikDao.getPracownikByEmail(pracownik.getEmail());
		pracownikDao.updatePracownik(tempPrac, pracownik.getImie(), pracownik.getNazwisko(), String.valueOf(pracownik.getPensja()), pracownik.getHaslo(), pracownik.getAdresZamieszkania(), pracownik.getNumerKontaBankowego());
		return "redirect:/gymCPPracownicyList";
	}



	@GetMapping("/usunPracownika")
	public String usunPracownika(@RequestParam("pracownikEmail") String theEmail) {
		Pracownik pracownik = pracownikDao.getPracownikByEmail(theEmail);
		pracownikDao.usunPracownika(pracownik);
		return "redirect:/gymCPPracownicyList";
	}

/////MYPROFILE

@PostMapping("/updatePracownikProfile")
public String updatePracownikProfile(@ModelAttribute("pracownik") Pracownik pracownik) {
	Pracownik tempPrac = pracownikDao.getPracownikByEmail(pracownik.getEmail());
	pracownikDao.updatePracownik(tempPrac, pracownik.getImie(), pracownik.getNazwisko(), String.valueOf(pracownik.getPensja()), pracownik.getHaslo(), pracownik.getAdresZamieszkania(), pracownik.getNumerKontaBankowego());
	return "redirect:/gymindex";
}



}
