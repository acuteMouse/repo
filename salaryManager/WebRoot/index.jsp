<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML >
<html>
	<head>
		<base href="<%=basePath%>">
		<title>My JSP 'index.jsp' starting page</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
		<script type="text/javascript">
	 function getInfo(){
		$.ajax( {
				url : "user/login.do",
				type : "post",
				dataType :"json",
				success : function(data) {
					var user=data.user;
					$("#name").val(user.userName);
					$("#phone").val(user.phone);
					$("#birthday").val(user.birthday);
				}
			});
	}
	function getAll(){
		$.post(
			"user/getInfo.do",
			function(data){
				var users=data.users;
			//	alert(users[0].phone);
				for(var i=0;i<users.length;i++){
					$("#userInfo").append("<tr><td>姓名 "+users[i].userName+
												"</td><td>生日 "+users[i].birthday+"</td></tr>");	
					}
				},
			"json"
			);
		}
</script>
		<style type="text/css">
#userInfo {block：hidden;
	border: 1;
}
</style>
	</head>
	<body>
		测试springMVC返回json单个
		</br>
		<input type="button" id="btn1" value="获取信息" onclick="getInfo()" />
		</br>
		姓名：
		<input type="text" id="name" />
		</br>
		手机号码：
		<input type="text" id="phone" />
		</br>
		出生日期：
		<input type="text" id="birthday" />
		</br>
		测试springMVC返回json列表
		</br>
		<input type="button" id="btn1" value="获取信息" onclick="getAll()" />
		<div id="div1">
			<table id="userInfo">
			</table>
		</div>
		</br>
	</body>
</html>
