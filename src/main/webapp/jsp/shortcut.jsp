<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>快捷入口</title>
<link href="${pageContext.request.contextPath}/assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/assets/css/shortcuts/shortcuts.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/assets/css/left/reset.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<input type="hidden" id="contextPath" values="${pageContext.request.contextPath}" />
	<div class="short_bg">
		<div class="short_box_main">
			<!--top-->
			<div class="short_top_main">
				<div class="short_top_instruct">
					<span class="short_span_btn">快捷入口</span>
				</div>
				<div class="short_main_address">
					<ul class="short_main_ul fd-clr">
						<li class="short_main_li"><a href="###"
							class="short_main_a short_add_color"><span
								class="short_main_close"></span>
								<p>职位设置</p></a></li>
						<li class="short_main_li"><a href="###"
							class="short_main_a short_add_color"><span
								class="short_main_close"></span>
								<p>职位设置</p>
								<p>职位设置</p></a></li>
						<li class="short_main_li"><a href="###" class="short_main_a"
							data-toggle="modal" data-target="#short_address_add"></span><span
								class="short_main_add"></span></a></li>
						<li class="short_main_li"><a href="###" class="short_main_a"><span
								class="short_main_add"></span></a></li>
						<li class="short_main_li"><a href="###" class="short_main_a"><span
								class="short_main_add"></span></a></li>
						<li class="short_main_li"><a href="###" class="short_main_a"><span
								class="short_main_add"></span></a></li>
					</ul>
				</div>
			</div>
			<!--top--end-->
			<div class="short_top_main short_bottom_main">
				<div class="short_top_instruct">
					<span class="short_span_btn">最近访问</span>
				</div>
				<div class="short_main_address">
					<ul class="short_main_ul fd-clr">
						<li class="short_main_li"><a href="###"
							class="short_main_a short_add_color"><span
								class="short_main_close"></span>
								<p>课程管理</p></a></li>
						<li class="short_main_li"><a href="###"
							class="short_main_a short_add_color"><span
								class="short_main_close"></span>
								<p>职位设置</p>
								<p>职位设置</p></a></li>
						<li class="short_main_li"><a href="###" class="short_main_a"></span></a>
						</li>
						<li class="short_main_li"><a href="###" class="short_main_a"></span></a>
						</li>
						<li class="short_main_li"><a href="###" class="short_main_a"></span></a>
						</li>
						<li class="short_main_li"><a href="###" class="short_main_a"></span></a>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<!-- 弹框-->
	<div class="modal fade" id="short_address_add" tabindex="-1"
		role="dialog">
		<div class="modal-dialog modal-sm">
			<div class="modal-content short_content">
				<!--header modal -->
				<div class="modal-header short_add_header fd-clr">
					<span class="short_header_span">配置</span> <span
						class="short_header_close" data-dismiss="modal" aria-label="Close"></span>

				</div>
				<!--body modal -->
				<div class="modal-body">
					<div class="short_table_main">
						<table class="short_main_table">
							<tr>
								<th></th>
								<th>功能名称</th>
							</tr>
							<tr>
								<td><span class="short_img_check"></span></td>
								<td>出入场验证</td>
							</tr>
							<tr>
								<td><span class="short_img_check"></span></td>
								<td>出入场验证</td>
							</tr>
							<tr>
								<td><span class="short_img_check"></span></td>
								<td>出入场验证</td>
							</tr>
							<tr>
								<td><span class="short_img_check"></span></td>
								<td>出入场验证</td>
							</tr>
							<tr>
								<td><span class="short_img_check"></span></td>
								<td>出入场验证</td>
							</tr>
							<tr>
								<td><span class="short_img_check"></span></td>
								<td>出入场验证</td>
							</tr>
							<tr>
								<td><span class="short_img_check"></span></td>
								<td>出入场验证</td>
							</tr>
							<tr>
								<td><span class="short_img_check"></span></td>
								<td>出入场验证</td>
							</tr>
							<tr>
								<td><span class="short_img_check"></span></td>
								<td>出入场验证</td>
							</tr>
							<tr>
								<td><span class="short_img_check"></span></td>
								<td>出入场验证</td>
							</tr>
						</table>
					</div>
					<div class="short_btn_box">
						<input type="button" class="short_btn_enter" data-dismiss="modal"
							value="确定"> <input type="button" class="short_btn_cancel"
							data-dismiss="modal" value="取消">
					</div>
				</div>

			</div>
		</div>
	</div>
</body>
<script type="text/javascript">var plugin_path = '${pageContext.request.contextPath}/assets/plugins/';</script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/plugins/jquery/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/scripts.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/shortcuts/shortcuts.js"></script>
</html>