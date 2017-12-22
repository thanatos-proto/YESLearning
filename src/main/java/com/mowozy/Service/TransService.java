package com.mowozy.Service;

import com.chen.mapper.CartMapper;
import com.chen.pojo.Cart;
import com.mowozy.Dao.TransDao;
import com.mowozy.Entity.Trans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransService {
	
	@Autowired
	private TransDao transDao;

	public int insert(Trans cart) {
		transDao.save(cart);
		return
	}

	public int delete(Trans cart) {
		transDao.delete(cart);

	}

	public int update(Trans cart) {
		transDao.save(cart);
	}

	public List<Trans> getAll(Trans cart) {
		return transDao.findAll();
	}

	public List<Trans> getCartByGid(Trans cart) {
		return transDao.findByTId(cart.gettId());
	}



}
