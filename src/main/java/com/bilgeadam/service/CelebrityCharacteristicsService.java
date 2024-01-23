package com.bilgeadam.service;

import com.bilgeadam.repository.CelebrityCharacteristicsRepository;
import com.bilgeadam.repository.CelebrityRepository;

public class CelebrityCharacteristicsService {

    CelebrityCharacteristicsRepository celebrityCharacteristicsRepository;

    public CelebrityCharacteristicsService(){
        this.celebrityCharacteristicsRepository = new CelebrityCharacteristicsRepository();
    }


}
