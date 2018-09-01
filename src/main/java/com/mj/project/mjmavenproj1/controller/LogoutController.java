package com.mj.project.mjmavenproj1.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mj.project.mjmavenproj1.dao.GrafikTreningowPersonalnychDao;
import com.mj.project.mjmavenproj1.dao.KlientDao;
import com.mj.project.mjmavenproj1.dao.TrenerDao;
import com.mj.project.mjmavenproj1.dao.UstawieniaDao;
import com.mj.project.mjmavenproj1.entity.GrafikTreningowPersonalnych;
import com.mj.project.mjmavenproj1.entity.Klient;
import com.mj.project.mjmavenproj1.entity.Trener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class LogoutController {
	@Autowired
	private KlientDao klientDao;

	@Autowired
	private TrenerDao trenerDao;

	@Autowired
	private UstawieniaDao ustawieniaDao;
	@Autowired
	private GrafikTreningowPersonalnychDao grafikDao;

	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response) {
	Authentication authentication =	SecurityContextHolder.getContext().getAuthentication();
	
	if	(authentication!=null) {
		new SecurityContextLogoutHandler().logout(request, response, authentication);
	}
		return "redirect:/gymindex";
	}

	@GetMapping("/ctpw")
	public String ctpw() {
		GrafikTreningowPersonalnych g = new GrafikTreningowPersonalnych();
		Trener t = trenerDao.getTrenerByEmail("23");
		Klient k = klientDao.getKlientByEmail("ek");

		g.setDzienTygodnia("Poniedzialek");
		g.setGodzina("9:00");
		g.setTrenerPersonal(t);
		g.setKlientPersonal(k);
		ustawieniaDao.zapiszTrening(g);
		return null;
	}

	@GetMapping("/test")
	public String test(){
List<GrafikTreningowPersonalnych> lista = grafikDao.getGrafikByTrainerId(37);
		for (GrafikTreningowPersonalnych g:lista){
			System.out.println(g);
		}
		return null;
	}

	@GetMapping("/test2")
	public String test2(){
		GrafikTreningowPersonalnych g = grafikDao.getGrafik(37, "10:00-11:00","Poniedzialek");
		System.out.println(g.getTrenerPersonal().getImie() + " " + g.getTrenerPersonal().getNazwisko());
		return null;
	}
}
