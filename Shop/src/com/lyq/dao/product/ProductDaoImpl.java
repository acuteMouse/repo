package com.lyq.dao.product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lyq.dao.DaoSupport;
import com.lyq.model.PageModel;
import com.lyq.model.product.ProductInfo;
@Repository("productDao")
@Transactional
public class ProductDaoImpl extends DaoSupport<ProductInfo> implements ProductDao {

	/**
	 * ��ѯ�������ǰ10����Ʒ
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public List<ProductInfo> findClickcount() {
		Map<String, String> orderby = new HashMap<String, String>();
		orderby.put("clickcount", "desc");
		PageModel<ProductInfo> pageModel = find(1, 10, orderby);
		return pageModel.getList();
	}
	/**
	 * ��ѯ�Ƽ���Ʒ��ǰ10�������ϼ�ʱ�併������
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public List<ProductInfo> findCommend() {
		String where = "where commend=?";
		Object[] parames = {true};
		Map<String, String> orderby = new HashMap<String, String>();
		orderby.put("createTime", "desc");
		PageModel<ProductInfo> pageModel = find(where,parames ,orderby,1,10);
		return pageModel.getList();
	}
	/**
	 * ��ѯ������õ�ǰ10����Ʒ
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public List<ProductInfo> findSellCount() {
		Map<String, String> orderby = new HashMap<String, String>();
		orderby.put("sellCount", "desc");
		PageModel<ProductInfo> pageModel = find(1, 10, orderby);
		return pageModel.getList();
	}
}
