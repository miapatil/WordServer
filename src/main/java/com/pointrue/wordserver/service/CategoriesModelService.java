package com.pointrue.wordserver.service;

import com.pointrue.wordserver.dto.CategoriesDTO;
import com.pointrue.wordserver.dto.WordsDTO;
import com.pointrue.wordserver.dto.utils.CategoriesDTOEntityTransfer;
import com.pointrue.wordserver.dto.utils.WordsDTOEntityTransfer;
import com.pointrue.wordserver.model.WordsCategoryModel;
import com.pointrue.wordserver.model.WordsModel;
import com.pointrue.wordserver.repository.WordsCategoryRepository;
import com.pointrue.wordserver.repository.WordsModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesModelService {
    @Autowired
    WordsCategoryRepository wordsCategoryRepository;

    public List<CategoriesDTO> getAllCategories() {
        CategoriesDTOEntityTransfer categoriesDTOEntityTransfer = new CategoriesDTOEntityTransfer();
        List<WordsCategoryModel> catList = wordsCategoryRepository.findAll();
        return categoriesDTOEntityTransfer.categoriesDTOListConvert(catList);
    }
}
