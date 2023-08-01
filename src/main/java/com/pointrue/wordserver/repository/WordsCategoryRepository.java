package com.pointrue.wordserver.repository;

import com.pointrue.wordserver.model.WordsCategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordsCategoryRepository extends JpaRepository<WordsCategoryModel, Long> {
}
