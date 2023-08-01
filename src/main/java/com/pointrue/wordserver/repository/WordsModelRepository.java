package com.pointrue.wordserver.repository;

import com.pointrue.wordserver.model.WordsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordsModelRepository extends JpaRepository<WordsModel, Long> {
}
