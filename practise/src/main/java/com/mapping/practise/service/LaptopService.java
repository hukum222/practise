package com.mapping.practise.service;


import com.mapping.practise.dao.ILaptopRepository;
import com.mapping.practise.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    private ILaptopRepository laptopRepo;

    //create
    public Laptop addLaptop(Laptop newLaptop) {
        return laptopRepo.save(newLaptop);
    }
    //get by id
    public Laptop getLaptopById(int id) {
        return laptopRepo.findById(id).get();
    }

    //get all
    public List<Laptop> getAllLaptop(){
        return laptopRepo.findAll();
    }

    //delete
    public void deleteLaptopById(int id) {
        laptopRepo.deleteById(id);
    }

    //update by id

    public void updateLaptopById(int id, Laptop newLaptop) {
        Laptop lap = laptopRepo.findById(id).get();
        lap.setLaptopBrand(newLaptop.getLaptopBrand());
        lap.setLaptopId(newLaptop.getLaptopId());
        lap.setLaptopName(newLaptop.getLaptopName());
        lap.setStudent(newLaptop.getStudent());
        lap.setLaptopPrice(newLaptop.getLaptopPrice());
        laptopRepo.save(lap);

    }

}

