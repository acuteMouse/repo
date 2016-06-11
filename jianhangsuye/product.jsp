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

		<title>建行塑业---产品介绍</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="隔热条，PA66隔热条，填充母料">
		<meta http-equiv="description" content="This is my page">
		<script src="js/jquery.movebg.js"></script>
		<script src="js/jquery-1.4.2.min.js" type="text/javascript"></script>
		<script type="text/javascript" src="js/lanrenzhijia.js"></script>
		<link href="css/lanrenzhijia.css" type="text/css" rel="stylesheet" />

		<style>
body {
	background-color: #8DB6CD;
}

.container {
	width: 960px;
	padding-top: 0px;
	margin: 0 auto;
	background-color: #56aaff;
}

* {
	margin: 0;
	padding: 0;
	list-style: none;
	text-decoration: none;
}

.wraper {
	width: 960px;
	padding-top: 0px;
	margin: 0 auto
}

#load {
	width: 960px;
	padding-top: 0px;
	margin: 0 auto
}

.nav {
	position: relative;
	width: 100%;
	height: 40px;
	background: blue;
	overflow: hidden
}

.nav-item {
	position: relative;
	float: left;
	width: 120px;
	height: 40px;
	line-height: 40px;
	text-align: center;
	font-size: 14px;
	z-index: 1
}

.nav-item a {
	display: block;
	height: 40px;
	color: #fff;
}

.nav-item a:hover {
	color: #fff
}

.move-bg {
	display: none;
	position: absolute;
	left: 0;
	top: 0;
	width: 120px;
	height: 40px;
	background: #4169E1;
	z-index: 0
}

.left {
	width: 24%;
	height: 480px;
	float: left;
	background-color: #fff;
}

.right {
	float: left;
	width: 76%;
	height: 480px;
	background-color: #fff;
}

#news {
	border: 2px solid #436EEE;
	height: 250px;
}

#lianxifangshi {
	border: 2px solid #436EEE;
	height: 200px;
}
</style>
	</head>

	<body>
		<div class="container">
			<div id="load">
				<img alt="" src="Image/logo4.png">
			</div>
			<div class="wraper">
				<div class="nav">
					<ul>
						<li class="nav-item">
							<a href='index.jsp'>首页</a>
						</li>
						<li class="nav-item">
							<a href='company.jsp'>公司介绍</a>
						</li>
						<li class="nav-item">
							<a href='product.jsp'>产品介绍</a>
						</li>
						<li class="nav-item">
							<a href='connection.jsp'>联系方式</a>
						</li>


					</ul>
					<!--移动的滑动-->
					<div class="move-bg"></div>
					<!--移动的滑动 end-->
				</div>
			</div>

			<div id="box_lanrenzhijia">
				<div class="list">
					<ul>
						<li>
							<img src="Image/lunbo11.jpg" width="850" height="170" />
						</li>
						<li>
							<img src="Image/lunbo12.jpg" width="850" height="170" />
						</li>
						<li>
							<img src="Image/lunbo9.jpg" width="850" height="170" />
						</li>
						<li>
							<img src="Image/lunbo10.jpg" width="850" height="170" />
						</li>

					</ul>
				</div>
			</div>

			<div id="content">
				<div class="left">
					<div id="news">
						<img alt="行业动态" src="Image/news.jpg">
						<ul>
							<li>
								<a href="http://www.lvcai.com.cn/News/Details/206752"><p>
										铝合金门窗的隔热条性能指标
									</p> </a>
							</li>
							<li>
								<a href="http://news.jc001.cn/detail/403442.html"><p>
										门窗节能的两大重要因素：密封胶和隔热条
									</p> </a>
							</li>
							<li>
								<a href="http://news.jc001.cn/11/0816/629229.html"><p>
										门窗隔热条市场现状分析
									</p> </a>
							</li>
							<li>
								<a href="http://www.jiancai.com/info/detail/55-393655.html"><p>
										门窗节能：先要重视隔热条和密封胶
									</p> </a>
							</li>
							<li>
								<a href="http://news.dichan.sina.com.cn/2014/04/30/1093869.html"><p>
										2014广州铝门窗幕墙展:铝型材、隔热条企业专访
									</p> </a>
							</li>
						</ul>
					</div>

					<div id="lianxifangshi">
						<img alt="联系方式" src="Image/lianxi.jpg">
						<p style="font-size: 14px; color: #4169E1">
							建行塑业有限公司
						</p>
						<p align="left" style="color: #4169E1">
							<br>
							联系人: 张经理
							<br>
							电话&nbsp&nbsp：0317-3392058
							<br>
							传真&nbsp&nbsp：0317-3392058
							<br>
							手机&nbsp&nbsp：13730575494
							<br>
						</p>
					</div>
				</div>
				<div class="right">
						<img alt="产品介绍" src="Image/canpin.jpg">
				</div>

				<div id="end" align="center">
					<span style="font-family: arial;">版权所有 &copy;任丘市建行塑业有限公司 </span>
					<br>
					<span style="font-family: arial;">友情链接 <a
						href="http://www.baidu.com">百度</a> <a href="http://www.sohu.com">搜狐</a>

					</span>
				</div>
			</div>
	</body>
</html>
