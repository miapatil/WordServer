package com.pointrue.wordserver.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class CategoriesDTO {
    private long id;

    private String name;

    private Date createdDate;

    private String image;
}
