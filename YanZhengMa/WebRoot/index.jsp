<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
    
    <title>登陆验证码</title></head>

  
  <body>
  <div background="blue">
  <form action="loginCheck.jsp" method="post">
   <table border=1>
   <tr >登陆</tr>
   <tr>
   <td>用户名:<input type="text" name="username"/></td>
    </tr>
    <tr>
   <td>密码:<input type="password" name="password"/></td>
    </tr>
     <tr>
   <td>验证码:<input type="text" name="certCode"/>
   			<img  src="ShowPic">
   </td>
    </tr>
     <tr>
   <td><input type="submit" value="提交"/></td>
    </tr>
   </table>
  
  
  </form></div>
  <%out.print("hello word!"); %>
   </body>
</html>
