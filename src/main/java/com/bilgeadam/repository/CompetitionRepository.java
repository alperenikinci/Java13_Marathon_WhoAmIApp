package com.bilgeadam.repository;

import com.bilgeadam.entity.Competition;
import com.bilgeadam.entity.Competitor;

public class CompetitionRepository extends RepositoryManager<Competition,Long>{

    public CompetitionRepository(){
        super(new Competition());
    }
}
