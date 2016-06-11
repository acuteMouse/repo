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

		<title>book-----</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<script type="text/javascript"
			src="js/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
		<link rel="stylesheet" type="text/css"
			href="js/jquery-easyui-1.2.6/themes/default/easyui.css" />
		<link rel="stylesheet" type="text/css"
			href="js/jquery-easyui-1.2.6/themes/icon.css" />
		<link rel="stylesheet" type="text/css" href="css/common.css" />
		<script type="text/javascript"
			src="js/jquery-easyui-1.2.6/jquery.easyui.min.js"></script>
		<script type="text/javascript"
			src="js/jquery-easyui-1.2.6/locale/easyui-lang-zh_CN.js"></script>
		<script type="text/javascript">
	$(function() {
		//校验密码
		$.extend($.fn.validatebox.defaults.rules, {
			password : {
				validator : function(value, param) {
					return value.length >= param[0];
				},
				message : '密码长度至少是5位的'
			}
		});
		//加载数据表格 
		var flag = '';
		$('#dg').datagrid( {
			toolbar : [ {
				text : '添加图书',
				iconCls : 'icon-add',
				handler : function() {
					flag = 'add';
					$('#dd').dialog( {
						title : '添加图书'
					});
					$('#dd').dialog('open');
					$('#myform').find('input').val('');

				}
			}, '-', {
				text : '删除图书',
				iconCls : 'icon-remove',
				handler : function() {
					var arr = $('#dg').datagrid('getSelections');
					if (arr.length < 1) {
						$.messager.show( {
							title : '提示信息',
							msg : '请选择至少一行进行删除',
							timeout : 3000,
							showType : 'slide'
						});
					} else {
						$.messager.confirm('友情提示', '确定要删除吗？', function(r) {
							if (r) {
								var ids = '';
								for ( var i = 0; i < arr.length; i++) {
									ids += arr[i].id + ','; //ids是string类型的，后台接受也应该用一个String的数组
							}
							ids = ids.substring(0, ids.length - 1);
							$.post('deleteBook', {
								ids : ids
							}, function(result) {
								$('#dg').datagrid('reload');
								$('#dg').datagrid('unselectAll');
								$.messager.show( {
									title : '提示信息',
									msg : '操作成功',
									timeout : 3000,
									showType : 'slide'
								});

							});
						} else {
							return '';
						}
					}	);

					}

				}
			}, {
				text : '修改信息',
				iconCls : 'icon-save',
				handler : function() {
					flag = 'edit';
					var arr = $('#dg').datagrid('getSelections');
					if (arr.length != 1) {
						$.messager.show( {
							title : '提示信息',
							msg : '一次只能修改一个',
							timeout : 3000,
							showType : 'slide'
						});
					} else {
						$('#dd').dialog( {
							title : '修改信息'
						});
						$('#dd').dialog('open');
						$('#myform').find('input').val('');
						$('#myform').form('load', {
							id : arr[0].id,
							name : arr[0].name,
							author : arr[0].author,
							no : arr[0].no,
							count : arr[0].count,
							publish_company : arr[0].publish_company
						});

					}
				}
			} ],
			url : 'findAllBook',
			idField : 'id',
			frozenColumns : [ [ {
				field : 'checkbox',
				width : 50,
				checkbox : true
			} ] ],
			striped : true,
			columns : [ [ {
				field : 'id',
				title : 'ID',
				width : 100
			}, {
				field : 'name',
				title : '书名',
				width : 100
			},{
				field : 'author',
				title : '作者',
				width : 100
			} ,{
				field : 'no',
				title : '编号',
				width : 100
			},{
				field : 'publish_company',
				title : '出版社',
				width : 100
			},{
				field : 'count',
				title : '数量',
				width : 100
			} ] ],

			fitColumns : true
		});
		//保存按钮
		$('#btn1').click(
				function() {
					if ($('#myform').form('validate')) {
						$.ajax( {
							type : 'post',
							url : flag == 'add' ? 'addBook'
									: 'updateBook',
							data : $('#myform').serialize(),
							dataType : 'json',
							success : function() {
								$('#dd').dialog('close');
								$('#dg').datagrid('reload');
								$.messager.show( {
									title : '提示信息',
									msg : '操作成功',
									timeout : 3000,
									showType : 'slide'
								});
							},
							error : function(result) {
								$.messager.show( {
									title : result.status,
									msg : result.message,
									timeout : 3000,
									showType : 'slide'
								});
							}
						});
					} else {
						$.messager.show( {
							title : '提示信息',
							msg : '请确保输入的数据格式等正确',
							timeout : 3000,
							showType : 'slide'
						});

					}
				});
		//关闭按钮
		$('#btn2').click(function() {
			$('#dd').dialog('close');
		});
	});
</script>
	</head>

	<body>
		<table id="dg"></table>
		<div id="dd" class="easyui-dialog" title="添加管理员" modal=true
			style="width: 400px;"
			data-options="iconCls:'icon-save',resizable:true,modal:true"
			closed=true>
			<form id="myform" method="post" style="text-align: center;">
				<input type="hidden" value="" name="id">
				<div>
					<label for="name">
						书名:
					</label>
					<input class="easyui-validatebox" type="text" name="name"
						required="true"></input>
				</div>
				<div>
					<label for="author">
						作者:
					</label>
					<input class="easyui-validatebox" type="text" name="author"
						required="true"></input>
				</div>
				<div>
					<label for="publish_company">
						出版社:
					</label>
					<input class="easyui-validatebox" type="text" name="publish_company"
						required="true"></input>
				</div>
				
				<div>
					<label for="no">
						编 &nbsp;号:
					</label>
					<input class="easyui-validatebox" type="text" name="no"
						required="true" ></input>
				</div>
				<div>
					<label for="count">
						数量:
					</label>
					<input class="easyui-validatebox" type="text" name="count"
						required="true"></input>
				</div>
				<div>
					<a id="btn1" class="easyui-linkbutton">保存</a>
					<a id="btn2" class="easyui-linkbutton">关闭</a>
				</div>
			</form>
		</div>

	</body>
</html>
