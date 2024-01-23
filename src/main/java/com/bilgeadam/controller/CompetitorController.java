package com.bilgeadam.controller;

import com.bilgeadam.entity.Competitor;
import com.bilgeadam.service.CelebrityService;
import com.bilgeadam.service.CompetitorService;

import java.util.List;

public class CompetitorController {

    CompetitorService competitorService;
    public CompetitorController(){
        this.competitorService= new CompetitorService();
    }

    public List<Competitor> findAll() {
        return competitorService.findAll();
    }
}
