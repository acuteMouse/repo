<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <h1>本站有以下好图片</h1>
    <c:forEach items="${map}" var="me">
    	<c:url value="/servlet/DownloadServlet" var="url">
    		<c:param name="filename" value="${me.key}"></c:param>
    	</c:url>
    	${me.value}&nbsp;&nbsp;<a href="${url}">下载</a><br/>
    </c:forEach>
  </body>
</html>
