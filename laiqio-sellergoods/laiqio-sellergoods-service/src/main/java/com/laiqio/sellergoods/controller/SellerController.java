package com.laiqio.sellergoods.controller;

import com.laiqio.sellergoods.pojo.Seller;
import com.laiqio.sellergoods.service.SellerService;
import com.leyou.common.pojo.PageResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/seller")
public class SellerController {

	@Autowired
	private SellerService sellerService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Seller> findAll(){
		return sellerService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(Integer page, Integer rows){
		return sellerService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param seller
	 * @return
	 */
	@RequestMapping("/add")
	public ResponseEntity<Void>  add(@RequestBody Seller seller){
		//密码加密
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String encode = encoder.encode(seller.getPassword());
		seller.setPassword(encode);
		try {
			sellerService.add(seller);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	/**
	 * 修改
	 * @param seller
	 * @return
	 */
	@RequestMapping("/update")
	public ResponseEntity<Void> update(@RequestBody Seller seller){
		try {
			sellerService.update(seller);
			return  ResponseEntity.status(HttpStatus.ACCEPTED).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public Seller findOne(String id){
		return sellerService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public ResponseEntity<Void>  delete(String [] ids){
		try {
			sellerService.delete(ids);
			return ResponseEntity.status(HttpStatus.OK).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
		/**
	 * 查询+分页
	 * @param
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody Seller seller, int page, int rows  ){
		return sellerService.findPage(seller, page, rows);		
	}
	
}
