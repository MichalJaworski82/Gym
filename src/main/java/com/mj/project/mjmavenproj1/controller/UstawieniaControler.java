package com.mj.project.mjmavenproj1.controller;

import com.mj.project.mjmavenproj1.dao.UstawieniaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class UstawieniaControler {

    @Autowired
    private UstawieniaDao ustawieniaDao;


    @GetMapping("/zmienPensje")
    public String zmienPensjeMinimalna(double tempPensja){

        ustawieniaDao.setPensjaMinimalna(tempPensja);
        System.out.println("Pensja mininalna zmieniona");
        return null;
    }


    @GetMapping("/wyswietlPensjeMinimalna")
    public String wyswietlPensje(){
        System.out.println(ustawieniaDao.getPensjaMinimalna() + "  <--------");
        	return Double.toString(ustawieniaDao.getPensjaMinimalna());
    }


    @GetMapping("/zmienObecnaStawkaZaMiesiac")
    public String zmienObecnaStawkaZaMiesiac(double stawka){

        ustawieniaDao.setObecnaStawkaZaMiesiac(stawka);
        System.out.println("Pensja mininalna zmieniona");
        return null;
    }


    @GetMapping("/wyswietlObecnaStawkeZaMiesiac")
    public String wyswietlObecnaStawkaZaMiesiac(){
        System.out.println(ustawieniaDao.getObecnaStawkaZaMiesiac() + "  <--------");
        return Double.toString(ustawieniaDao.getObecnaStawkaZaMiesiac());
    }



}
