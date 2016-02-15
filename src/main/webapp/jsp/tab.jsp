<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- mobile settings -->
	<meta name="viewport" content="width=device-width, maximum-scale=1, minimum-scale=1.0, initial-scale=1, user-scalable=no" />

	<!-- CORE CSS -->
	<link href="${pageContext.request.contextPath}/assets/css/tab/style.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/assets/css/tab/form.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/assets/css/wh.common.css" rel="stylesheet" type="text/css" />
</head>
<body style="margin: 5px 0px 0px; overflow-y: hidden;">
	<div class="index-info">
		这里是一坨没有用处的信息
	</div>
	<table class="tab-header" cellpadding="0" cellspacing="0" onselectstart="return false" style="-moz-user-select:none;">
		<tr>
			<td class="tab-td"><div id="tab_menu"></div></td>
			<td class="tab-msg"><img src="${pageContext.request.contextPath}/assets/images/info.png"/><span>提示：双击关闭功能标签</span></td>
	</table>
	
	<div id="page" style="width:100%;min-height:515px;"></div>
	

	<!-- JAVASCRIPT FILES -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/plugins/jquery/jquery-2.1.4.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/tab/tab.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/tab/wh.jsf.tab.js"></script>
</body>
</html>