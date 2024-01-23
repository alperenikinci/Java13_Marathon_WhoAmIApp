package com.bilgeadam.repository;

import com.bilgeadam.entity.Celebrity;
import com.bilgeadam.entity.Competition;

public class CelebrityRepository extends RepositoryManager<Celebrity,Long>{

    public CelebrityRepository(){
        super(new Celebrity());
    }
}
