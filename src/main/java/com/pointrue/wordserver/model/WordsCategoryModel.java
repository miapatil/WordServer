package com.pointrue.wordserver.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;


@Entity (name = "words_category")
@Getter
@Setter
@ToString
public class WordsCategoryModel {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Date createdDate;

    private String image;
}
