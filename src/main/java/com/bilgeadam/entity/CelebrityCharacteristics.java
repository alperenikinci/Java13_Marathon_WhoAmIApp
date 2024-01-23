package com.bilgeadam.entity;

import com.bilgeadam.utility.enums.EGender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class CelebrityCharacteristics extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private EGender gender;
    private String height;
    private String weight;
    private String nationality;
    private LocalDate dateOfBirth;
    private String occupation;
    private String netWorth;

    @OneToOne
    private Celebrity celebrity;

    @Override
    public String toString() {
        return
                "gender=" + gender +
                "\nheight='" + height + '\'' +
                "\nweight='" + weight + '\'' +
                "\nnationality='" + nationality + '\'' +
                "\ndateOfBirth=" + dateOfBirth +
                "\noccupation='" + occupation + '\'' +
                "\nnetWorth='" + netWorth + '\'' +
                '}';
    }
}
