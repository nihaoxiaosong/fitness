<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>系统日志</title>
<link href="${pageContext.request.contextPath}/assets/css/wh.common.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/assets/css/operate/operate.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/assets/css/page/page.css" rel="stylesheet" type="text/css" />
</head>
	<body>
		<div id="operate">
			<div class="operate_search">
				<!--仿select框-->
			     <div class="common_select pos-one" id="common_selected">
			          <div class="common_top_select">
			               <span class="common_select_type">请选择类型</span>
			               <span class="common_select_img"><img src="../assets/images/select.png"></span>
			          </div>
			          <ul class="common_select_ul">
			             <li class="common_select_li" data-option="">全部付款</li>
			             <li class="common_select_li" data-option="">未完成状态</li> 
			             <li class="common_select_li" data-option="">已完成状态</li> 
			             <li class="common_select_li" data-option="">已完成状态1</li>
			             <li class="common_select_li" data-option="">已完成状态2</li>
			             <li class="common_select_li" data-option="">已完成状态3</li> 
			          </ul>  
			     </div>
			    <!--仿select框end-->
			    <!--年月日input-->
			    <div class="common_time_box pos-three">
			         <div class="common_time_bg">
			              <div class="common_time_right">
			                  <a href="javascript:void(0)" class="common_timeqd_btn">确定</a>
			              </div>
			         </div>
			         <div class="common_time_main clearfix">
			              <div class="common_time_left">
			                   <input id="d4311" type="text" class="common_start_time" placeholder="yyyy/mm/dd hh:mm" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',maxDate:'#F{$dp.$D(\'d4312\')}'})"><span class="common_time_line">-</span><input id="d4312" type="text" class="common_end_time" placeholder="yyyy/mm/dd hh:mm" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',minDate:'#F{$dp.$D(\'d4311\')}'})">
			              </div>
			         </div>
			    </div>
				<!--input--搜索框-->
				<div class="common_search fd-clr pos-four">
					<input type="text" class="common_input_search" placeholder="职位关键字...">
					<span class="common_search_btn"></span>
				</div>
			</div>
			<div class="table_style">
			<table>
				<tr>
					<th>序号</th>
					<th>操作内容</th>
					<th>操作人</th>
					<th>操作时间</th>
				</tr>
				<tr>
					<td>1</td>
					<td>修改会员（JAMES）基本资料，修改会员（JAMES）MC分配，新建会员（JAMES）会籍会员，挂失钥匙牌，男A32</td>
					<td>张一抹</td>
					<td>2015/11/11 18:00</td>
				</tr>
				<tr>
					<td>1</td>
					<td>修改会员（JAMES）基本资料，修改会员（JAMES）MC分配，新建会员（JAMES）会籍会员，挂失钥匙牌，男A32</td>
					<td>张一抹</td>
					<td>2015/11/11 18:00</td>
				</tr>
				<tr>
					<td>1</td>
					<td>修改会员（JAMES）基本资料，修改会员（JAMES）MC分配，新建会员（JAMES）会籍会员，挂失钥匙牌，男A32</td>
					<td>张一抹</td>
					<td>2015/11/11 18:00</td>
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
	<script src="${pageContext.request.contextPath}/assets/js/My97DatePicker/WdatePicker.js" type="text/javascript"></script>
</html>