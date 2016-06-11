<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'left.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">


	</head>

	<body>
		<div>
			图书管理
			<br>
			<a href="<%=request.getContextPath()%>/pages/bookList.jsp"
				target="mainframe">查看图书</a>
		</div>
		<div>
			用户管理
			<br>
			<a href="<%=request.getContextPath()%>/pages/userList.jsp"
				target="mainframe">查看用户</a>
		</div>
		<div>
			借书管理
			<br>
			<a href="<%=request.getContextPath()%>/pages/borrowList.jsp"
				target="mainframe">查看借书记录</a>
		</div>
	</body>
</html>
