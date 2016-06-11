<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="zh-cn" lang="zh-cn">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
		<title>隔热条,PVC隔热条,PA66隔热条</title>
		<script src="js/swfobject_modified.js" type="text/javascript"></script>
		<script src="js/lanrenzhijia.js" type="text/javascript"></script>
		<link href="css/3-styles.css" rel="stylesheet" type="text/css" />
		<link href="css/2-layout.css" rel="stylesheet" type="text/css" />
		<link href="css/Index.css" rel="stylesheet" type="text/css" />
		<link href="css/0-import.css" rel="stylesheet" type="text/css" />
		<link href="css/lanrenzhijia.css" rel="stylesheet" type="text/css" />
		<meta name="keywords" content="隔热条,PVC隔热条,PA66隔热条" />
		<meta name="description" content="隔热条,PVC隔热条,PA66隔热条" />


	</head>
	<body>
		<div id="container">
			<div id="header">
				<h1>
					<img href="index.jsp" alt="建行塑业有限公司" src="Image/logo-1.png">
				</h1>

			</div>
			<div id="globalNavi">
				<ul>
					<li>
						<a href="selectNews.action">首页</a>
					</li>
					<li>
						<a href="company.jsp">关于我们</a>
					</li>
					<li>
						<a href="MyJsp1.jsp">新闻动态</a>
					</li>

					<li>
						<a href="productlist.html">产品一览</a>
					</li>

					<li>
						<a href="contactUs.html">联系我们</a>
					</li>
				</ul>
				<p class="navtime">
					欢迎您！
					<script src="js/time.js" type="text/javascript"></script>
				</p>
			</div>
			<!-- 轮播 -->
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
			<!-- 轮播结束 -->
			<div id="main">
				<div id="sideBar" style="width: 15%">
					<div class="linkbox">
						<div class="linktitle">
							<p>
								联系我们
							</p>
						</div>
						<div class=" linkList">
							<a> <img alt="服务热线" src="Image/phone.jpg" /> </a>
							<ul>

								<li>
									河北任丘市建行塑业公司
								</li>
								<li>
									联系人：张经理
								</li>
								<li>
									手 &nbsp; 机：13730575494
								</li>
								<li>
									电 &nbsp; 话：0317-3392058
								</li>
								<li>
									地 &nbsp; 址：河北任丘市青塔乡田各庄工业区
								</li>

							</ul>
						</div>
					</div>
				</div>
				<div id="newsDiv">
					<p>
						当前位置:
						<a href="index.jsp">首页</a>>>新闻动态
					</p>
					<ul>
						<s:iterator value="list" status="st">
							<li id="newsList">


								<a href="selectNewsByTitle?title=${title }"><s:property
										value="title" /> </a> ...........................
								<s:property value="writeDate" />




							</li>
						</s:iterator>
					</ul>
					<br>
					<br>
					<br>
					<br>
					<br>
					<br>
					<p>
						共${fn:length(list)} 条新闻
					</p>
				</div>
			</div>
			<!--container end-->
			<div id="footer">

				<div class="footerNav">
					<h6 align="center">
						版权 &copy;2015：任丘市建行塑业公司 &nbsp;
					</h6>
				</div>


			</div>
		</div>
	</body>
</html>
