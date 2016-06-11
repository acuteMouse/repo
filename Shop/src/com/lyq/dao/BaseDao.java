package com.lyq.dao;

import java.io.Serializable;
import java.util.Map;

import com.lyq.model.PageModel;

public interface BaseDao<T> {
	// 提供数据操纵的借口
	public void save(Object obj);//增加
	public void saveOrUpdate(Object obj);// ????
	public void update(Object obj);// 更新数据
	public void delete(Serializable ... ids);//通过ID删除数据
	public T get(Serializable entityId);// 通过ID查询
	public T load(Serializable entityId);//加载?
	public Object uniqueResult(String hql, Object[] queryParams);//ʹ
	//��ҳ����
	public long getCount();//��ȡ����Ϣ��
	public PageModel<T> find(int pageNo, int maxResult);//��ͨ��ҳ����
	public PageModel<T> find(int pageNo, int maxResult,String where, Object[] queryParams);//������Ϣ��ҳ����
	public PageModel<T> find(int pageNo, int maxResult,Map<String, String> orderby);//��ָ�����������ҳ����
	public PageModel<T> find(String where, Object[] queryParams,
			Map<String, String> orderby, int pageNo, int maxResult);//��ָ��������ҳ������ķ�ҳ����
}
