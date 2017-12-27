package com.mowozy.Controller;

import com.mowozy.Entity.Trans;
import com.mowozy.Entity.Users;
import com.mowozy.Service.TransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
@RequestMapping("/Trans")
public class TransController {
	
	@Autowired
	private TransService transService;
	
	/**
	 * 查询用户列表
	 * @return
	 */



	@RequestMapping("/list")
	public String list(Trans trans, HttpServletRequest request, Users users){
		List<Trans> list2 = transService.getAll(trans);
		double total = 0;
		for (Trans trans2 : list2) {
			total += trans2.gettPrice();
		}
		request.getSession().setAttribute("total", total);
		request.getSession().setAttribute("list2", list2);
		return "Trans";
	}
	
	/**
	 * 添加
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
//	@RequestMapping("/add")
////	public String add(Trans trans,HttpServletRequest request) throws UnsupportedEncodingException{
////
////		String userName = (String) request.getSession().getAttribute("username");
////
//////		trans.settId(gid);
//////		trans.settImage(img);
//////		trans.settName(name);
//////		trans.setUserName(userName);
//////		trans.setPrice(Double.parseDouble(price));
////		if(num != null && userName != null){
////			Trans.setNum(Integer.parseInt(num));
////		}else {
////			request.setAttribute("error", "请登录后再添加购物车");
////			return "redirect:/good/det?id="+gid;
////		}
////		List<Trans> list = TransService.getTransByGid(Trans);
////		if (list == null || list.size() < 1) {
////			int result1 = TransService.insert(Trans);
////			if (result1 >= 1) {
////				request.setAttribute("success", "添加购物车成功");
////				return "redirect:/Trans/list";
////			}
////		} else {
////			for (Trans Trans2 : list) {
////				int num1 = Trans2.getNum() + Trans.getNum();
////				Trans.setNum(num1);
////				int result = TransService.update(Trans);
////				if (result >= 1) {
////					request.setAttribute("success", "添加购物车成功");
////					return "redirect:/Trans/list";
////				}
////			}
////		}
////		return "redirect:/Trans/list";
////	}
	
	
	/**
	 * 根据用户名删除
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
//	@RequestMapping("/del")
//	public String del(HttpServletRequest request) throws UnsupportedEncodingException{
//
//		String userName = (String) request.getSession().getAttribute("username");
//		String gid = request.getParameter("gid");
//		String type = request.getParameter("type");
////		type = new String(type.getBytes("ISO-8859-1"), "UTF-8");
//		Trans Trans = new Trans();
////
//		int result = TransServiceImpl.delete(Trans);
////		Trans.setGid(gid);
////		Trans.setType(type);
////		Trans.setUserName(userName);
//		if (result != 0) {
//			request.setAttribute("success", "删除成功");
//			return "redirect:/Trans/list";
//		} else {
//			request.setAttribute("error", "删除失败");
//			return "redirect:/Trans/list";
//		}
//	}
}
