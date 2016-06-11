<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

		<title>My JSP 'bookList.jsp' starting page</title>

	</head>

	<body style="text-align: center;">
		<br>
		<h1>
			本店有下列好书
		</h1>
		<table border="1" width="80%">
			<tr>
				<td>
					序号
				</td>
				<td>
					ISBN
				</td>
				<td>
					书名
				</td>
				<td>
					作者
				</td>
				<td>
					价格
				</td>
				<td>
					描述
				</td>
				<td>
					购买
				</td>
			</tr>
			<c:forEach items="${books}" var="me" varStatus="vs">
				<tr>
					<td>
						${vs.count}
					</td>
					<td>
						${me.value.isbn}
					</td>
					<td>
						${me.value.name}
					</td>
					<td>
						${me.value.author}
					</td>
					<td>
						${me.value.price}
					</td>
					<td>
						${me.value.description}
					</td>
					<td>
						<a
							href="${pageContext.request.contextPath}/servlet/BuyBookServlet?id=${me.key}">点击购买</a>
					</td>
				</tr>

			</c:forEach>
		</table>
		<a href="${pageContext.request.contextPath}/servlet/ShowShopCarServlet">查看购物车</a>
	</body>
</html>
