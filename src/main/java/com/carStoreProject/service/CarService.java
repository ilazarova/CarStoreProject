/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carStoreProject.service;

import com.carStoreProject.entity.Cars;
import com.carStoreProject.repository.CarRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    
    @Autowired
    private CarRepository cRepo;
    public void save(Cars c){
        cRepo.save(c);
    } 
    public List<Cars> getAllCars(){
        return cRepo.findAll();
    }
    
}
