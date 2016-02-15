<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, maximum-scale=1, minimum-scale=1.0, initial-scale=1, user-scalable=no" />
	<title>快捷入口</title>
	<link href="${pageContext.request.contextPath}/assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/assets/css/wh.jsf.index.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/assets/css/wh.common.css" rel="stylesheet" type="text/css" />
</head>

<body>

	<!-- 头 -->
	<div class="header">
		<%@ include file="headerIndex.jsp"%>
	</div>
	
	<!-- 主体 -->
	<div class="content-body">
		<%@ include file="shortcut.jsp"%>
		<%-- <p>快捷入口</p>
		<a href="${pageContext.request.contextPath}/jsp/layout.jsp?m=m101&fm=fm1&sm=sm14">短信批示</a>
		<a href="${pageContext.request.contextPath}/jsp/layout.jsp?m=m101&fm=fm2&sm=sm6">合同管理（租柜管理）</a>
		<p>最近访问</p>
		<a href="${pageContext.request.contextPath}/jsp/layout.jsp?m=m102">课程管理</a> --%>
	</div>
	
	<!-- 脚 -->
	<div class="footer"></div>

	<!-- JAVASCRIPT FILES -->
	<script type="text/javascript">var plugin_path = '${pageContext.request.contextPath}/assets/plugins/';</script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/plugins/jquery/jquery-2.1.4.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/msgbox.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/wh.index.js"></script>
	<!--验证<script src="assets/plugins/form.validate/jquery.validation.min.js" type="text/javascript"></script>-->
</body>
</html>