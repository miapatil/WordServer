package com.pointrue.wordserver.service;

import com.pointrue.wordserver.dto.WordsDTO;
import com.pointrue.wordserver.dto.utils.WordsDTOEntityTransfer;
import com.pointrue.wordserver.model.WordsModel;
import com.pointrue.wordserver.repository.WordsModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class WordsModelService {
    @Autowired
    WordsModelRepository wordsModelRepository;

    public List<WordsDTO> getAllWords() {
        WordsDTOEntityTransfer wordsDTOEntityTransfer = new WordsDTOEntityTransfer();
        List<WordsModel> wordList = wordsModelRepository.findAll();
        List<WordsDTO> wordsDTOList = wordsDTOEntityTransfer.wordsDTOListConvert(wordList);
        return wordsDTOList;
    }

    public List<WordsDTO> getWordsByCat(Long catId){
        System.out.println("?????????");
        List<WordsDTO> allWords = getAllWords();
        List<WordsDTO> catWords = new ArrayList<WordsDTO>();

        for (int i = 0; i < allWords.size(); i++){
            if (allWords.get(i).getCatID() == catId){
                catWords.add(allWords.get(i));
            }
        }

        System.out.println("?????????" +  catWords.toString());
        return catWords;

        //wordsDTOList = entityList.stream().map(wordsEntity -> wordsEntityToDTOConverter(wordsEntity)).collect(Collectors.toList());
//        WordsDTOEntityTransfer wordsDTOEntityTransfer = new WordsDTOEntityTransfer();
//        List<WordsModel> wordByCatList = wordsModelRepository.findById(catId);
//        if (!(wordByCatList.isEmpty())){
//            List<WordsDTO> wordsDTOList = wordsDTOEntityTransfer.wordsDTOListConvert(wordByCatList);
//        }

    }

}
