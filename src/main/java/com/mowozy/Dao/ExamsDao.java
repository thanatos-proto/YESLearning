package com.mowozy.Dao;

import com.mowozy.Entity.Exams;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by moonwolfzy on 2017-12-27.
 */
public interface ExamsDao extends JpaRepository<Exams,Integer> {
     Exams findByEId(Integer eid);
}
