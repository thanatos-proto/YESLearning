package com.mowozy.Service;

import com.mowozy.Dao.TransDao;
import com.mowozy.Entity.Trans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransService {
	
	@Autowired
	private TransDao transDao;

	public int insert(Trans trans) {
		transDao.save(trans);
		return 1;
	}

	public int delete(Trans trans) {
		transDao.delete(trans);
		return 1;
	}

	public int update(Trans trans) {
		transDao.save(trans);
		return 1;
	}

	public List<Trans> getAll(Trans trans) {
		return transDao.findAll();
	}

	public List<Trans> getTransByGid(Trans trans) {
		return transDao.findByTId(trans.gettId());
	}



}
