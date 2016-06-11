package com.lyq.action.interceptor;

import java.util.Map;

import com.lyq.action.BaseAction;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
/**
 * 普通客户登陆拦截器
 * 
 *
 */
public class CustomerLoginInteceptor extends AbstractInterceptor{
	private static final long serialVersionUID = 1L;
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext context = invocation.getInvocationContext();// ��ȡActionContext
		Map<String, Object> session = context.getSession();// 获取用户session
		if(session.get("customer") != null){// �ж��û��Ƿ��¼ 
			return invocation.invoke();// ����ִ�з���
		}
		return BaseAction.CUSTOMER_LOGIN;// ���ص�¼
	}
}
