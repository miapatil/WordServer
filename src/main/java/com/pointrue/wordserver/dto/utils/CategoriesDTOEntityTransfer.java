package com.pointrue.wordserver.dto.utils;

import com.pointrue.wordserver.dto.CategoriesDTO;
import com.pointrue.wordserver.model.WordsCategoryModel;

import java.util.List;
import java.util.stream.Collectors;

public class CategoriesDTOEntityTransfer {
    public CategoriesDTO categoryEntityToDTOConverter(WordsCategoryModel entity){
        CategoriesDTO categoriesDTO = new CategoriesDTO();
        categoriesDTO.setName(entity.getName());
        categoriesDTO.setId(entity.getId());
        categoriesDTO.setCreatedDate(entity.getCreatedDate());
        categoriesDTO.setImage(entity.getImage());
        return categoriesDTO;
    }

    public WordsCategoryModel categoryDTOToEntityConverter(CategoriesDTO categoriesDTO){
        WordsCategoryModel entity = new WordsCategoryModel();
        entity.setId(categoriesDTO.getId());
        entity.setName(categoriesDTO.getName());
        entity.setCreatedDate(categoriesDTO.getCreatedDate());
        entity.setImage(categoriesDTO.getImage());
        return entity;
    }

    public List<CategoriesDTO> categoriesDTOListConvert(List<WordsCategoryModel> entityList){
        return entityList.stream().map(catEntity -> categoryEntityToDTOConverter(catEntity)).collect(Collectors.toList());
    }

    public List<WordsCategoryModel> categoriesEntityListConvert(List<CategoriesDTO> categoriesDTOList){
        return categoriesDTOList.stream().map(categoriesDTO -> categoryDTOToEntityConverter(categoriesDTO)).collect(Collectors.toList());
    }
}
