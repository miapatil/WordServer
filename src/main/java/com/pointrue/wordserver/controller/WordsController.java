package com.pointrue.wordserver.controller;

import com.pointrue.wordserver.dto.CategoriesDTO;
import com.pointrue.wordserver.dto.WordsDTO;
import com.pointrue.wordserver.model.WordsCategoryModel;
import com.pointrue.wordserver.service.CategoriesModelService;
import com.pointrue.wordserver.service.WordsModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WordsController {

    @Autowired
    WordsModelService wordsModelService;
    @Autowired
    CategoriesModelService categoriesModelService;

    @GetMapping("/words")
    @ResponseBody
    public List<WordsDTO> getWordsList(){
        return wordsModelService.getAllWords();

    }

//    @GetMapping("/words/{category}")
////    @ResponseBody
//    public List<WordsDTO> getWordsListId(@RequestParam(name = "category") String id){
//        System.out.println(id);
//        return wordsModelService.getAllWords();
//
//    }

    @GetMapping("/words/{category}")
    @ResponseBody
    public List<WordsDTO> getWordsByCat(@PathVariable Long category){
        System.out.println("????????? ====" + category);
        return wordsModelService.getWordsByCat(category);
    }



    @GetMapping("/categories")
    @ResponseBody
    public List<CategoriesDTO> getCategoriesList(){
        return categoriesModelService.getAllCategories();
    }
}
