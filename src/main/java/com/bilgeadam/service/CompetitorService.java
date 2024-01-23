package com.bilgeadam.service;

import com.bilgeadam.entity.Competitor;
import com.bilgeadam.repository.CompetitorRepository;

import java.util.List;

public class CompetitorService {

    CompetitorRepository competitorRepository;

    public CompetitorService(){
        this.competitorRepository = new CompetitorRepository();
    }


    public List<Competitor> findAll() {
        return competitorRepository.findAll();
    }

    public Competitor updateWinner(Competitor winner) {
        return competitorRepository.update(winner);
    }
}
