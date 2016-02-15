<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>角色管理</title>
<link href="${pageContext.request.contextPath}/assets/css/wh.common.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/assets/css/authority/authority.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/assets/css/page/page.css" rel="stylesheet" type="text/css" />
</head>
	<body>
		<div id="authority">
			<div class="authority_search">
				<!--input--搜索框-->
				<div class="common_search fd-clr pos-one">
					<input type="text" class="common_input_search" placeholder="职位关键字...">
					<span class="common_search_btn"></span>
				</div>
				<div class="authority_add">
					<input type="button" name="" id="" value="新增" class="wh-btn button_cancle"/>
				</div>
			</div>
			<div class="table_style">
			<table>
				<tr>
					<th>序号</th>
					<th>职位名称</th>
					<th>状态</th>
					<th>操作</th>
				</tr>
				<tr>
					<td>1</td>
					<td>前台、大堂经理</td>
					<td><a href="#" class="authority_start">启用</a></td>
					<td><input type="button" name="" id="" value="权限配置" class="authority_but" /></td>
				</tr>
				<tr>
					<td>2</td>
					<td>顶级私教</td>
					<td><a href="#" class="authority_not">不启用</a></td>
					<td><input type="button" name="" id="" value="权限配置" class="authority_but" /><input type="button" name="" id="" value="删除" class="authority_but_dele" /></td>
				</tr>
				<tr>
					<td>3</td>
					<td>私教助理教练</td>
					<td><a href="#" class="authority_not">不启用</a></td>
					<td><input type="button" name="" id="" value="权限配置" class="authority_but" /><input type="button" name="" id="" value="删除" class="authority_but_dele" /></td>
				</tr>
			</table>
		</div>
		</div>
		<div id="page">
			<div class="page">
				<span>共<em>150</em>名</span>
				<span class="prev_tol"></span>
				<span class="prev"></span>
				<span class="next"></span>
				<span class="next_tol"></span>
				<span><em>3</em>/<i>23</i></span>
				<span>
					<!--input--搜索框-->
					<div class="common_search fd-clr pos-two">
						<input type="text" class="common_input_search" placeholder="">
					</div>
					<input type="button" name="" id="" value="" class="page_search"/>
				</span>
			</div>
		</div>
	</body>
	<script src="${pageContext.request.contextPath}/assets/plugins/jquery/jquery-2.1.4.min.js" type="text/ecmascript"></script>
	<script src="${pageContext.request.contextPath}/assets/js/screen&search.js" type="text/ecmascript"></script>
</html>