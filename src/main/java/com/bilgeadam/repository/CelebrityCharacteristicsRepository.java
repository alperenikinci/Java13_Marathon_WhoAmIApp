package com.bilgeadam.repository;

import com.bilgeadam.entity.CelebrityCharacteristics;
import com.bilgeadam.entity.Competition;

public class CelebrityCharacteristicsRepository extends RepositoryManager<CelebrityCharacteristics,Long>{

    public CelebrityCharacteristicsRepository(){
        super(new CelebrityCharacteristics());
    }
}
