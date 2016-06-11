<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8" %>
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

		<title>My JSP 'index.jsp' starting page</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">

	</head>

	<body>
		<div align="center">
			<form action="LoginServlet" method="post">
				<table>
					<tr>
						<td>
							用户名：
						</td>

						<td>
							<input type="text" name="name">
						</td>
					</tr>
					<tr>
						<td>
							密&nbsp;&nbsp; 码:
						</td>
						<td>
							<input type="text" name="password">
						</td>
					</tr>

					<tr>
						<td>
							<input type="submit" value="登陆">
						</td>
						<td>
							<input type="reset" value="重置">
						</td>
					</tr>
				</table>
		</div>
		</form>
	</body>
</html>
