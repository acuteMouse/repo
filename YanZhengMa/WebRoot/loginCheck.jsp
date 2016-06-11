<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="org.omg.CORBA.Request"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'loginCheck.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <% String certCode=request.getParameter("certCode");
       out.print(certCode);
       if(certCode.equals((String)session.getAttribute("certCode2"))){
      	 out.print("验证码输入正确");
      	 
       }
        else 
      	  out.print("验证码输入错误");
      
      
    
    
    %>
  </body>
</html>
