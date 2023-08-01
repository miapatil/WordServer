package com.pointrue.wordserver.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WordsDTO {
    private long id;

    private String word;

    private String meaning;

    private String synonym;

    private String antonym;

    private String usage;

    private long catID;
}
