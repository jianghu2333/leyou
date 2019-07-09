package com.laiqio.sellergoods.service;

import com.laiqio.sellergoods.pojo.Seller;
import com.leyou.common.pojo.PageResult;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface SellerService {

	/**
	 * 返回全部列表
	 * @return
	 */
	 List<Seller> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	 PageResult findPage(Integer pageNum, Integer pageSize);
	
	
	/**
	 * 增加
	*/
	 void add(Seller seller);
	
	
	/**
	 * 修改
	 */
	 void update(Seller seller);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	 Seller findOne(String id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	 void delete(String[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	 PageResult findPage(Seller seller, int pageNum, int pageSize);

	/**
	 * 更改状态
	 * @param sellerId
	 * @param status
	 */
	 void updateStatus(String sellerId, String status);
}
