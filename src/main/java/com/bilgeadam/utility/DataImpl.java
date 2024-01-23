package com.bilgeadam.utility;

import com.bilgeadam.entity.Celebrity;
import com.bilgeadam.entity.CelebrityCharacteristics;
import com.bilgeadam.entity.Competitor;
import com.bilgeadam.repository.CelebrityCharacteristicsRepository;
import com.bilgeadam.repository.CelebrityRepository;
import com.bilgeadam.repository.CompetitionRepository;
import com.bilgeadam.repository.CompetitorRepository;
import com.bilgeadam.utility.enums.EGender;

import java.time.LocalDate;
import java.util.stream.Collector;

public class DataImpl {
    CelebrityRepository celebrityRepository;
    CompetitionRepository competitionRepository;
    CompetitorRepository competitorRepository;
    CelebrityCharacteristicsRepository celebrityCharacteristicsRepository;

    public DataImpl(){
        this.celebrityRepository = new CelebrityRepository();
        this.competitionRepository = new CompetitionRepository();
        this.competitorRepository = new CompetitorRepository();
        this.celebrityCharacteristicsRepository = new CelebrityCharacteristicsRepository();
    }

    public void createData(){
        createCelebrities();
        createCompetitors();
    }

    private void createCelebrities() {
        // Sample 1
        CelebrityCharacteristics characteristics1 = CelebrityCharacteristics.builder()
                .gender(EGender.MALE)
                .height("188")
                .weight("82")
                .nationality("USA")
                .dateOfBirth(LocalDate.of(1968, 9, 25))
                .occupation("Actor")
                .netWorth("400 Million $$")
                .build();
        Celebrity celebrity1 = Celebrity.builder()
                .name("Will")
                .surname("Smith")
                .photoUrl("Will_Smith_Photo_Url")
                .build();
        celebrity1.setCharacteristics(characteristics1);
        characteristics1.setCelebrity(celebrity1);
        celebrityRepository.save(celebrity1);
        celebrityCharacteristicsRepository.save(characteristics1);

// Sample 2
        CelebrityCharacteristics characteristics2 = CelebrityCharacteristics.builder()
                .gender(EGender.MALE)
                .height("191")
                .weight("107")
                .nationality("USA")
                .dateOfBirth(LocalDate.of(1942, 1, 17))
                .occupation("Professional Boxer")
                .netWorth("50 Million $$")
                .build();
        Celebrity celebrity2 = Celebrity.builder()
                .name("Muhammad")
                .surname("Ali")
                .photoUrl("Muhammad_Ali_Photo_Url")
                .build();
        celebrity2.setCharacteristics(characteristics2);
        characteristics2.setCelebrity(celebrity2);
        celebrityRepository.save(celebrity2);
        celebrityCharacteristicsRepository.save(characteristics2);

// Sample 3
        CelebrityCharacteristics characteristics3 = CelebrityCharacteristics.builder()
                .gender(EGender.MALE)
                .height("175")
                .weight("68")
                .nationality("Brazil")
                .dateOfBirth(LocalDate.of(1992, 2, 5))
                .occupation("Footballer")
                .netWorth("300 Million $$")
                .build();
        Celebrity celebrity3 = Celebrity.builder()
                .name("Neymar")
                .surname("Jr.")
                .photoUrl("Neymar_Photo_Url")
                .build();
        celebrity3.setCharacteristics(characteristics3);
        characteristics3.setCelebrity(celebrity3);
        celebrityRepository.save(celebrity3);
        celebrityCharacteristicsRepository.save(characteristics3);

// Sample 4
        CelebrityCharacteristics characteristics4 = CelebrityCharacteristics.builder()
                .gender(EGender.FEMALE)
                .height("175")
                .weight("63")
                .nationality("UK")
                .dateOfBirth(LocalDate.of(1988, 5, 5))
                .occupation("Musician")
                .netWorth("200 Million $$")
                .build();
        Celebrity celebrity4 = Celebrity.builder()
                .name("Adele")
                .surname("Adkins")
                .photoUrl("Adele_Photo_Url")
                .build();
        celebrity4.setCharacteristics(characteristics4);
        characteristics4.setCelebrity(celebrity4);
        celebrityRepository.save(celebrity4);
        celebrityCharacteristicsRepository.save(characteristics4);

// Sample 5
        CelebrityCharacteristics characteristics5 = CelebrityCharacteristics.builder()
                .gender(EGender.MALE)
                .height("170")
                .weight("72")
                .nationality("Argentina")
                .dateOfBirth(LocalDate.of(1987, 6, 24))
                .occupation("Footballer")
                .netWorth("500 Million $$")
                .build();
        Celebrity celebrity5 = Celebrity.builder()
                .name("Lionel")
                .surname("Messi")
                .photoUrl("Messi_Photo_Url")
                .build();
        celebrity5.setCharacteristics(characteristics5);
        characteristics5.setCelebrity(celebrity5);
        celebrityRepository.save(celebrity5);
        celebrityCharacteristicsRepository.save(characteristics5);

// Sample 6
        CelebrityCharacteristics characteristics6 = CelebrityCharacteristics.builder()
                .gender(EGender.FEMALE)
                .height("155")
                .weight("55")
                .nationality("USA")
                .dateOfBirth(LocalDate.of(1986, 3, 28))
                .occupation("Singer")
                .netWorth("180 Million $$")
                .build();
        Celebrity celebrity6 = Celebrity.builder()
                .name("Lady")
                .surname("Gaga")
                .photoUrl("Lady_Gaga_Photo_Url")
                .build();
        celebrity6.setCharacteristics(characteristics6);
        characteristics6.setCelebrity(celebrity6);
        celebrityRepository.save(celebrity6);
        celebrityCharacteristicsRepository.save(characteristics6);

// Sample 7
        CelebrityCharacteristics characteristics7 = CelebrityCharacteristics.builder()
                .gender(EGender.MALE)
                .height("188")
                .weight("80")
                .nationality("Canada")
                .dateOfBirth(LocalDate.of(1986, 10, 24))
                .occupation("Actor")
                .netWorth("200 Million $$")
                .build();
        Celebrity celebrity7 = Celebrity.builder()
                .name("Ryan")
                .surname("Reynolds")
                .photoUrl("Ryan_Reynolds_Photo_Url")
                .build();
        celebrity7.setCharacteristics(characteristics7);
        characteristics7.setCelebrity(celebrity7);
        celebrityRepository.save(celebrity7);
        celebrityCharacteristicsRepository.save(characteristics7);

// Sample 8
        CelebrityCharacteristics characteristics8 = CelebrityCharacteristics.builder()
                .gender(EGender.FEMALE)
                .height("180")
                .weight("58")
                .nationality("Australia")
                .dateOfBirth(LocalDate.of(1967, 6, 20))
                .occupation("Actress")
                .netWorth("250 Million $$")
                .build();
        Celebrity celebrity8 = Celebrity.builder()
                .name("Nicole")
                .surname("Kidman")
                .photoUrl("Nicole_Kidman_Photo_Url")
                .build();
        celebrity8.setCharacteristics(characteristics8);
        characteristics8.setCelebrity(celebrity8);
        celebrityRepository.save(celebrity8);
        celebrityCharacteristicsRepository.save(characteristics8);

// Sample 9
        CelebrityCharacteristics characteristics9 = CelebrityCharacteristics.builder()
                .gender(EGender.MALE)
                .height("182")
                .weight("85")
                .nationality("Canada")
                .dateOfBirth(LocalDate.of(1986, 10, 24))
                .occupation("Rapper")
                .netWorth("150 Million $$")
                .build();
        Celebrity celebrity9 = Celebrity.builder()
                .name("Drake")
                .surname("Graham")
                .photoUrl("Drake_Photo_Url")
                .build();
        celebrity9.setCharacteristics(characteristics9);
        characteristics9.setCelebrity(celebrity9);
        celebrityRepository.save(celebrity9);
        celebrityCharacteristicsRepository.save(characteristics9);

// Sample 10
        CelebrityCharacteristics characteristics10 = CelebrityCharacteristics.builder()
                .gender(EGender.MALE)
                .height("183")
                .weight("80")
                .nationality("UK")
                .dateOfBirth(LocalDate.of(1946, 3, 6))
                .occupation("Musician")
                .netWorth("180 Million $$")
                .build();
        Celebrity celebrity10 = Celebrity.builder()
                .name("David")
                .surname("Gilmour")
                .photoUrl("David_Gilmour_Photo_Url")
                .build();
        celebrity10.setCharacteristics(characteristics10);
        characteristics10.setCelebrity(celebrity10);
        celebrityRepository.save(celebrity10);
        celebrityCharacteristicsRepository.save(characteristics10);
    }
    private void createCompetitors(){
        for(int i = 0; i<5;i++) {
            Competitor competitor = new Competitor();
            competitor.setName("Competitor "+(i+1));
            competitor.setWins(0);
            competitorRepository.save(competitor);
        }



    }
}
