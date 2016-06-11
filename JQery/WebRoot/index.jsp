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
		<title>My JSP 'index.jsp' starting page</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
		<script type="text/javascript">
		$(document).ready(function() {
		//  $("#btn").click(function(){
			//$("p").hide();
			//    $("p").toggle("slow");
			//$("p").hide("fast");
			//	$("p").slideDown("slow");
			//	$("p").slideToggle();
			//	$("p").fadeIn();
			//		  });
			//	$("p").click(function (){
			//	$(this).hide();
			//	});	
			//	var inv=$("input").val();
			//alert(inv);

			//	$("#btn").click(function() {
			//		$.get("findNameServelt", function(date) {
			//			$("#test").html(date);
			//		}, "text");
			//	});
	//		$.ajax( {
	//			url : "findNameServelt",
	//			//dataType : "text",
	//			//  dataType:"json",
	//			success : function(data) {
	//				//	alert(data);
	//				var obj = jQuery.parseJSON(data);
	//				$("#name").val(obj.name);
	//				$("#age").val(obj.age);
	//				
	//			}
	//		});
		$("#name").mouseleave(function(){
				var name=$("#name").val();
				$.ajax({
					url:"checkNameServlet",
					type:"post",
					data:"name="+name,
					dataType: "text",
					success:function(data){
						$("#tishi").text(data);

					}
					});
			});
	
		});
</script>
<style type="text/css">
	#mydiv{
		width: 100px;
		height:100px;
		background-color: red;
	}

</style>
	</head>

	<body>
		<div id="mydiv">草泥马</div>
		<p>
			hello
		</p>
		<p>
			world
		</p>
		<button id="btn" type="button">
			点击隐藏
		</button>
		
		<form action="registorServlet" method="post">
			<input type="text" name="name" id="name" required 
				placeholder="请输入用户名" />  
			<input type="text" name="age" id="age" placeholder="请输入年龄"/>
			<input type="password" name="password" required placeholder="请输入密码" />
			<input type="e-mail" name="e-mail" placeholder="请输入邮箱" />
			<input type="submit" value="注册">
		</form>
				<p id="tishi"></p>
	</body>
</html>
