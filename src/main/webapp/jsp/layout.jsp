<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>健身房</title>

		<!-- mobile settings -->
		<meta name="viewport" content="width=device-width, maximum-scale=1, minimum-scale=1.0, initial-scale=1, user-scalable=no" />

		<!-- CORE CSS -->
		<link href="${pageContext.request.contextPath}/assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/assets/css/wh.jsf.index.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/assets/css/wh.common.css" rel="stylesheet" type="text/css" />
		
</head>
<body>

	<!-- 头 -->
	<div class="header">
		<%@ include file="header.jsp"%>
	</div>
	
	<!-- 主体 -->
	<table class="main-container">
		<!-- 菜单 -->
		<tr>
			<td class="left-menu">
				<%@ include file="left.jsp"%>
			</td>
			<!-- 主体显示 -->
			<td class="main">
				<iframe name="mainFrame" id="mainFrame" frameborder="0" src="tab.jsp" style="margin:0 auto;width:100%;"></iframe>
			</td>
		</tr>
	</table>
	
	<!-- 脚 -->
	<div class="footer"></div>

	<!-- JAVASCRIPT FILES -->
	<script type="text/javascript">var plugin_path = 'assets/plugins/';</script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/plugins/jquery/jquery-2.1.4.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/wh.common.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/msgbox.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/wh.layout.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/tab/tab.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/tab/wh.jsf.tab.js"></script>
	<!--验证<script src="assets/plugins/form.validate/jquery.validation.min.js" type="text/javascript"></script>-->
</body>
</html>