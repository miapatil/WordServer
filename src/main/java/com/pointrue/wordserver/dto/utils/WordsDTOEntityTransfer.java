package com.pointrue.wordserver.dto.utils;

import com.pointrue.wordserver.dto.WordsDTO;
import com.pointrue.wordserver.model.WordsModel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WordsDTOEntityTransfer {
    public WordsDTO wordsEntityToDTOConverter(WordsModel entity){
        WordsDTO wordsDTO = new WordsDTO();
        wordsDTO.setWord(entity.getWord());
        wordsDTO.setId(entity.getId());
        wordsDTO.setUsage(entity.getUsage());
        wordsDTO.setSynonym(entity.getSynonym());
        wordsDTO.setMeaning(entity.getMeaning());
        wordsDTO.setAntonym(entity.getAntonym());
        wordsDTO.setCatID(entity.getCatID());
        return wordsDTO;
    }

    public WordsModel wordsDTOtoEntityConverter(WordsDTO wordsDTO){
        WordsModel entity = new WordsModel();
        entity.setId(wordsDTO.getId());
        entity.setUsage(wordsDTO.getUsage());
        entity.setSynonym(wordsDTO.getSynonym());
        entity.setWord(wordsDTO.getWord());
        entity.setMeaning(wordsDTO.getMeaning());
        entity.setAntonym(wordsDTO.getAntonym());
        entity.setCatID(wordsDTO.getCatID());
        return entity;
    }

    public List<WordsDTO> wordsDTOListConvert(List<WordsModel> entityList){
        List<WordsDTO> wordsDTOList = new ArrayList<WordsDTO>();
        wordsDTOList = entityList.stream().map(wordsEntity -> wordsEntityToDTOConverter(wordsEntity)).collect(Collectors.toList());
        return wordsDTOList;
    }

    public List<WordsModel> wordsEntityListConvert(List<WordsDTO> wordsDTOList){
        List<WordsModel> wordsEntityList = new ArrayList<WordsModel>();
        wordsEntityList = wordsDTOList.stream().map(wordsDTO -> wordsDTOtoEntityConverter(wordsDTO)).collect(Collectors.toList());
        return wordsEntityList;
    }
}
