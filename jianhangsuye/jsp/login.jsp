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

		<title>登陆---</title>

		<script type="text/javascript"
			src="js/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
		<link rel="stylesheet" type="text/css"
			href="js/jquery-easyui-1.2.6/themes/default/easyui.css" />
		<link rel="stylesheet" type="text/css"
			href="js/jquery-easyui-1.2.6/themes/icon.css" />
		<script type="text/javascript"
			src="js/jquery-easyui-1.2.6/jquery.easyui.min.js"></script>
		<script type="text/javascript"
			src="js/jquery-easyui-1.2.6/locale/easyui-lang-zh_CN.js"></script>

		<script type="text/javascript">
	$.extend($.fn.validatebox.defaults.rules, {
		password : {
			validator : function(value, param) {
				return value.length >= param[0];
			},
			message : '密码长度至少是6位的'
		}
	});
</script>


	</head>

	<body>
		<form id="ff" method="post" style="text-align: center;"
			action="loginAction">
			<div>
				<label for="name">
					用户名:
				</label>
				<input class="easyui-validatebox" type="text" name="name"
					required="true"></input>
			</div>
			<div>
				<label for="password">
					密 &nbsp码:
				</label>
				<input class="easyui-validatebox" type="password" name="password"
					required="true" validType="password[6]"></input>  
			</div>	
			<div>
			<input type="submit" value="登陆">	  
			<input type="reset" value="重置">	  
			</div>
		</form>
			<div style="text-align: center;">
			<font name="Error" >${Error }</font>
			</div>
	</body>
</html>
