package com.lyq.dao.user;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lyq.dao.DaoSupport;
import com.lyq.model.user.User;

@Repository("userDao")
@Transactional
public class UserDaoImpl extends DaoSupport<User> implements UserDao {

	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public User login(String username, String password) {
		if(username != null && password != null){//����û�������벻Ϊ��
			String where = "where username=? and password=?";//���ò�ѯ����
			Object[] queryParams = {username,password};//���ò����������
			List<User> list = find(-1, -1, where, queryParams).getList();//ִ�в�ѯ����
			if(list != null && list.size() > 0){//���list���ϲ�Ϊ��
				return list.get(0);//����List�еĵ�һ���洢����
			}
		}
		return null;//���ؿ�ֵ
	}

	@SuppressWarnings("unchecked")
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public boolean isUnique(String username) {
		List list = getTemplate().find("from User where username = ?", username);
		if(list != null && list.size() > 0){
			return false;
		}
		return true;
	}
	
	
}
