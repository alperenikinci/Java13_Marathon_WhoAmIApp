package com.bilgeadam.repository;

import com.bilgeadam.entity.Competitor;

public class CompetitorRepository extends RepositoryManager<Competitor,Long>{

    public CompetitorRepository(){
        super(new Competitor());
    }
}
