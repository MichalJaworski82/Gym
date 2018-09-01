package com.mj.project.mjmavenproj1.controller;

import com.mj.project.mjmavenproj1.dao.KlientDao;
import com.mj.project.mjmavenproj1.dao.PracownikDao;
import com.mj.project.mjmavenproj1.dao.TrenerDao;
import com.mj.project.mjmavenproj1.entity.Klient;
import com.mj.project.mjmavenproj1.entity.Pracownik;
import com.mj.project.mjmavenproj1.entity.Trener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GymToolbarController {

	@Autowired
	TrenerDao trenerDao;

	@Autowired
	KlientDao klientDao;

	@Autowired
	PracownikDao pracownikDao;

	private String getEmailZalogowanegoUzytkownika(){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String zalogowanyUserEmail = authentication.getName();
		return zalogowanyUserEmail;
	}

	@GetMapping("/gymindex")
	    public String gym() {
		return "gymindex";
	    }
	  
	  @GetMapping("/gymgym")
	    public String gymgym() {
	        return "gymgym";
	    }

	  @GetMapping("/gymplanner")
	    public String gymplanner() {
	        return "gymplanner";
	    }
	  @GetMapping("/gymtrainers")
	    public String gymtrainers() {
	        return "gymtrainers";
	    }

	   @GetMapping("/gyminvalidlogin")
	    public String gyminvalidlogin() {
	        return "gyminvalidlogin";
	    }

	@GetMapping("/gympricing")
	public String gympricinng() {
		return "gympricing";
	}
	  

	  @GetMapping("/gymlogin")
	    public String gymlogin() {
	        return "gymlogin";
	    }

	@GetMapping("/gymcontrolpanel")
	public String gymcontrolpanel() {
		return "/CP/gymCPMain";
	}


	@GetMapping("/tp")
	public String tp() {
		return "trainerPlanner";
	}



	@GetMapping("/gymMyProfileTrener")
	public String gymMyProfileTrener(ModelMap theModel) {
		Trener trener= trenerDao.getTrenerByEmail(getEmailZalogowanegoUzytkownika());
		theModel.put("specList", trenerDao.getListaSpecjalizacji());
		theModel.put("trener",trener);
		return "/trenerProfile";
	}


	@GetMapping("/gymMyProfileKlient")
	public String gymMyProfileKlient( ModelMap theModel) {
		Klient klient= klientDao.getKlientByEmail(getEmailZalogowanegoUzytkownika());
		theModel.put("klient",klient);
		return "/klientProfile";
	}

	@GetMapping("/gymMyProfilePracownik")
	public String gymMyProfilePracownik( ModelMap theModel) {
		Pracownik pracownik = pracownikDao.getPracownikByEmail(getEmailZalogowanegoUzytkownika());
		theModel.put("pracownik",pracownik);
		return "pracownikProfile";
	}


}
