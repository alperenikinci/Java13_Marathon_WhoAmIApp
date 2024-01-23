package com.bilgeadam.controller;

import com.bilgeadam.service.CelebrityService;
import com.bilgeadam.service.CompetitionService;

public class CompetitionController {

    CompetitionService competitionService;

    public CompetitionController(){
        this.competitionService= new CompetitionService();
    }
}
