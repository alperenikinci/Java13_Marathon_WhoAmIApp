package com.bilgeadam.service;

import com.bilgeadam.entity.Celebrity;
import com.bilgeadam.repository.CelebrityRepository;
import com.bilgeadam.repository.CompetitionRepository;

import java.util.List;

public class CelebrityService {

    CelebrityRepository celebrityRepository;

    public CelebrityService(){
        this.celebrityRepository = new CelebrityRepository();
    }

    public List<Celebrity> findAll() {
        return celebrityRepository.findAll();
    }
}
