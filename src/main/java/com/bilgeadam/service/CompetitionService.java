package com.bilgeadam.service;

import com.bilgeadam.entity.Competition;
import com.bilgeadam.repository.CelebrityRepository;
import com.bilgeadam.repository.CompetitionRepository;
import com.bilgeadam.repository.CompetitorRepository;

public class CompetitionService {

    CompetitionRepository competitionRepository;

    public CompetitionService(){
        this.competitionRepository = new CompetitionRepository();
    }


    public Competition save(Competition competition) {
        return competitionRepository.save(competition);
    }
}
