/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carStoreProject.controller;

import com.carStoreProject.entity.Cars;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class CarController {
    
     @Autowired
    private CarService service;
    
    @GetMapping("/")
    public String home (){
    return "home";
}
    @GetMapping("/car_register")
    public String carRegister (){
        return "carRegister";
    }
    @GetMapping("/available_cars")
    public ModelAndView getAllCars(){
        List<Cars>list=service.getAllCars();
        ModelAndView m= new ModelAndView();
        m.setViewName("carList");
        m.addObject("car", list);
        return new ModelAndView("carList", "car",list);
    }
    
    @PostMapping("/save")
    public String addCar(@ModelAttribute Cars c){
        service.save(c);
        return "redirect:/available_cars";
    }
    @GetMapping ("/my_cars")
    public String getMyCars(){
        return "MyCars";
    }
}

    
    

