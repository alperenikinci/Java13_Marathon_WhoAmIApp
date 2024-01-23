package com.bilgeadam.controller;

import com.bilgeadam.entity.Celebrity;
import com.bilgeadam.service.CelebrityService;

import java.util.List;

public class CelebrityController {

    CelebrityService celebrityService;

    public CelebrityController(){
        this.celebrityService= new CelebrityService();
    }

    public List<Celebrity> findAll() {
        return celebrityService.findAll();
    }
}
