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

		<title>My JSP 'ShowShopCar.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		<script type="text/javascript">
	function changeNumnber(inputObj, bookId, oldNumber) {
		var newNumber = inputObj.value;
		var sure = window.confirm("确定要把数量该为" + newNumber + "么？");
		if (sure) {
			window.location.href="${pageContext.request.contextPath}/servlet/ChangeNumberServlet?bookId="+bookId+"&newNumber="+newNumber;
			
		} else {
			inputObj.value=oldNumber;
		}
	}
	 function deleteItem(bookId){
		 var sure = window.confirm("确定要删除该商品吗？");
			if (sure) {
				window.location.href="${pageContext.request.contextPath}/servlet/DeleteShopCarItem?bookId="+bookId;
				
			}
		 }
	 function deleteAll()
	 {
		 var sure = window.confirm("确定要删除所有东西吗？");
			if (sure) {
				window.location.href="${pageContext.request.contextPath}/servlet/DeleteAllServlet";
				
			}


		 }
	 
</script>
	</head>

	<body style="text-align: center;">
		<br>
		您购买的商品如下：
		<c:if test="${empty sessionScope.ShopCar.items}">
		您没有购买任何物品
		</c:if>
		<c:if test="${!empty sessionScope.ShopCar.items}">
			<table border="1" width="90%">
				<tr>
					<th>
						序号
					</th>
					<th>
						书名
					</th>
					<th>
						单价
					</th>
					<th>
						数量
					</th>
					<th>
						小计
					</th>
					<th>
						操作
					</th>
				</tr>
				<c:forEach items="${sessionScope.ShopCar.items}" var="me"
					varStatus="vs">
					<tr>
						<th>
							${ vs.count}
						</th>
						<th>
							${me.value.book.name }
						</th>
						<th>
							${me.value.book.price }
						</th>
						<th>
							<input type="text" name="number" value="${me.value.number }"
								onchange="changeNumnber(this,${me.key },${me.value.number })" />
						</th>
						<th>
							${me.value.price }
						</th>
						<th>
							<a href="javascript:deleteItem(${me.key })">删除</a>
						</th>
					</tr>
				</c:forEach>
				<tr>
					<td>
						<a href="javascript:deleteAll()">[清空购物车]</a>
					</td>
					<td></td>
					<td></td>
					<td>
						总计
					</td>
					<td>
						${sessionScope.ShopCar.price }
					</td>
					<td></td>
				</tr>
			</table>
		</c:if>
		<a href="${pageContext.request.contextPath}">继续</a> ${message }
	</body>
</html>
