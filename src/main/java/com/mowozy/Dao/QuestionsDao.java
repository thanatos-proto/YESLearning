package com.mowozy.Dao;

import com.mowozy.Entity.Questions;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by moonwolfzy on 2017-12-27.
 */
public interface QuestionsDao extends JpaRepository<Questions,Integer> {
    Questions findByQId(Integer qid);

}
