<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
				<div id="conts">
					<div class="info ">
						<div class="infoL">
							<div>
								<p>
									关于我们
								</p>
								<a href="company.jsp"><img alt="more" src="Image/more.gif"> </a>
							</div>
							<div class="infornn">
						
								<p>
								本公司位于河北沧州市,沧州地处河北省东南部，东临渤海，北依京津，南接山东，
								京杭大运河贯穿市区，因东临渤海而得名，意为沧海之州。距首都北京240公里，
								距天津120公里，距省会石家庄221公里。沧州地处环渤海中心地带，是环渤海经济
								圈和京津冀都市圈的重要组成部分。境内有京沪（北京——上海）铁路、
								京沪高速铁路（北京——上海）、京九（北京——九龙）等铁路干线。京沪线、津汕线、大广线、
								沿海线、沧廊线、石黄线、保沧线及正在建设的邯港线8条高速公路。
								21世纪将是经济飞速发展的时代,"把握际遇,迎接挑战,促进双赢"!
								欢迎广大客服前来咨询!
								</p>
							</div>
						</div>
						
						<div class="infoR">
							<div class="title">
								<p>
									新闻中心
								</p>
								<a href="news.jsp"><img alt="more"
										src="Image/more.gif"> </a>
							</div>
							<div class="newsInfor newsindex" style="height: 236px;">
								<!-- ajax 查询新闻 -->
								<ul>
										<s:iterator value="list" status="st">
									<li>
											<tr>
												<td>
											<a href="selectNewsByTitle?title=${title }"><s:property value="title" />  
											 </td>
									&nbsp;
									&nbsp;
									&nbsp;
									
											<td >
											 <s:property value="writeDate" /> 
											</a>		
												</td>
												
											</tr>
									</li>
										</s:iterator>
								</ul>
							</div>
						</div>
					</div>
				
						
					<div class="clear">
					</div>
					<div class="productInfo">
						<div class="title">
							<p>
								产品展示
							</p>
							<a href="productlist.html"><img alt="more"
									src="Image/more.gif"> </a>
						</div>
						<div class="product indexpro">
							<div id="colee_left"
								style="overflow: hidden; width: 733px; margin: 0 auto;">
								<table cellpadding="0" cellspacing="0" border="0">
									<tr>
										<td id="colee_left1" valign="top" align="center">
											<table cellpadding="2" cellspacing="0" border="0">
												<tr align="center">

													<td>
														<div class="li">
															<a class="img"> <img alt="" src="Image/1.jpg" /> </a>
														</div>
													</td>

													<td>
														<div class="li">
															<a class="img"> <img src="Image/2.jpg" /> </a>
														</div>
													</td>

													<td>
														<div class="li">
															<a class="img"> <img src="Image/3.jpg" /> </a>
														</div>
													</td>

													<td>
														<div class="li">
															<a class="img" href=""><img src="Image/4.jpg" /> </a>
														</div>
													</td>

													<td>
														<div class="li">
															<a class="img"> <img src="Image/5.jpg" /> </a>
														</div>
													</td>

													<td>
														<div class="li">
															<a class="img"> <img src="Image/7.jpg" /> </a>

														</div>
													</td>

												</tr>
											</table>
											<td id="colee_left2" valign="top"></td>
									</tr>
								</table>
							</div>
						</div>

						<!--下面是向左滚动代码-->

						<script type="text/javascript">
	//使用div时，请保证colee_left2与colee_left1是在同一行上

	var speed = 30
	//速度数值越大速度越慢
	var colee_left2 = document.getElementById("colee_left2");
	var colee_left1 = document.getElementById("colee_left1");
	var colee_left = document.getElementById("colee_left");
	colee_left2.innerHTML = colee_left1.innerHTML
	function Marquee3() {
		if (colee_left2.offsetWidth - colee_left.scrollLeft <= 0)//offsetWidth 是对象的可见宽度
			colee_left.scrollLeft -= colee_left1.offsetWidth//scrollWidth 是对象的实际内容的宽，不包边线宽度
		else {
			colee_left.scrollLeft++
		}
	}
	var MyMar3 = setInterval(Marquee3, speed)
	colee_left.onmouseover = function() {
		clearInterval(MyMar3)
	}
	colee_left.onmouseout = function() {
		MyMar3 = setInterval(Marquee3, speed)
	}
</script>
						<!--向左滚动代码结束-->
					</div>
				</div>
			<div id="sideBar">
				<div>
				</div>
					<div class="linkbox">
						<div class="linktitle">
							<p>
								联系我们
							</p>
						</div>
						<div class=" linkList">
							<a href="contactUs.html"> <img alt="服务热线"
									src="Image/phone.jpg" /> </a>
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
