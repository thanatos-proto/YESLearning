package com.mowozy.Dao;

import com.mowozy.Entity.Trans;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransDao extends JpaRepository<Trans,Integer> {
	

	List<Trans> findByTId(Integer tid);
	//通过交易号查找


}
