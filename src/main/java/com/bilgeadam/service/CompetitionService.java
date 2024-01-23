package com.bilgeadam.service;

import com.bilgeadam.repository.CelebrityRepository;
import com.bilgeadam.repository.CompetitionRepository;
import com.bilgeadam.repository.CompetitorRepository;

public class CompetitionService {

    CompetitionRepository competitorRepository;

    public CompetitionService(){
        this.competitorRepository = new CompetitionRepository();
    }


}
