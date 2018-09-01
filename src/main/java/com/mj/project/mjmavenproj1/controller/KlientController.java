package com.mj.project.mjmavenproj1.controller;

import com.mj.project.mjmavenproj1.dao.KlientDao;
import com.mj.project.mjmavenproj1.dao.PracownikDao;
import com.mj.project.mjmavenproj1.entity.Klient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KlientController {

	@Autowired
	private KlientDao klientDao;


	@Autowired
	private PracownikDao pracownikDao;



	@PostMapping("/zapiszKlienta")
	public String zapiszKlienta(@ModelAttribute("klient") Klient klient) {
		//wyjatek zapobiegajacy wywaleniu sie apki przy wrzuceniu dublujacego sie PK email
		try {
			klientDao.dodajKlienta(klient);
		}catch (Exception e){System.out.println("Can't create employee. Email already taken");}
		return "redirect:/gymCPKlienciList";
	}


	@PostMapping("/updateKlient")
	public String updateKlient(@ModelAttribute("klient") Klient klient) {
		Klient tempKlient = klientDao.getKlientByEmail(klient.getEmail());
		klientDao.updateKlient(tempKlient, klient.getImie(), klient.getNazwisko(), klient.getHaslo(), klient.getNumerKartyKredytowej() );
		return "redirect:/gymCPKlienciList";
	}


	@GetMapping("/usunKlienta")
	public String usunKlienta(@RequestParam("klientEmail") String theEmail) {
		Klient klient = klientDao.getKlientByEmail(theEmail);
		klientDao.usunKlienta(klient);
		return "redirect:/gymCPKlienciList";
	}

///MY PROFILE
@PostMapping("/updateKlientProfile")
public String updateKlientProfile(@ModelAttribute("klient") Klient klient) {
	Klient tempKlient = klientDao.getKlientByEmail(klient.getEmail());
	klientDao.updateKlient(tempKlient, klient.getImie(), klient.getNazwisko(), klient.getHaslo(), klient.getNumerKartyKredytowej() );
	return "redirect:/gymindex";
}


}
