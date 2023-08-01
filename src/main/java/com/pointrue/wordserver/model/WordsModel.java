package com.pointrue.wordserver.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class WordsModel {
    @Id
    @GeneratedValue
    private Long id;

    private String word;

    private String meaning;

    private String synonym;

    private String antonym;

    private String usage;

    private Long catID;
}
