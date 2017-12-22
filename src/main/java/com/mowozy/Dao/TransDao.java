package com.mowozy.Dao;

import com.mowozy.Entity.Trans;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransDao extends JpaRepository<Trans,Integer> {
	
//	public int save(Cart cart);
//
//	public void delete(Cart cart);
//
//	public int update(Cart cart);
//
//	public List<Cart> getAll(Cart cart);
//
//	public List<Cart> getCartByGid(Cart cart);

	List<Trans> findByTId(Integer tid);


}
