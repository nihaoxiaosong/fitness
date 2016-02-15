<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<title>header</title>
	<!-- mobile settings -->
	<meta name="viewport" content="width=device-width, maximum-scale=1, minimum-scale=1.0, initial-scale=1, user-scalable=no" />
	<!-- CORE CSS -->
	<link href="${pageContext.request.contextPath}/assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/assets/css/header/header.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/assets/css/wh.common.css" rel="stylesheet" type="text/css" />
	
</head>

<body>
  <div class="gym_header">
       <ul class="gym_nav clearfix">
       
       <c:forEach items="${sessionScope.moduleList}" var="module" varStatus="status">
       	<c:if test="${module.level==0}">
       		<c:choose>
	       		<c:when test="${module.moduleCode!=012}">
		       		<li class="gym_nav_li">
		       			<a id="m${module.moduleCode}" href="layout.jsp?m=m${module.moduleCode}" class="gym_venue_name text-center">
			               <p class="gym_header_img"><img src="${pageContext.request.contextPath}${module.moduleIcon}" /></p>
			               <p class="gym_header_size13">${module.moduleName}</p>
			         	</a>
		         	</li>
	       		</c:when>
	       		<c:otherwise>
		       		<li class="gym_nav_li">
			       		<a id="index-a" href="layout.jsp?m=m" class="gym_venue_name text-center">
			               <p class="gym_header_img"><img src="${pageContext.request.contextPath}${module.moduleIcon}" /></p>
			               <p class="gym_header_size13">${module.moduleName}</p>
			         	</a>
		         	</li>
		         </c:otherwise>
       		</c:choose>
       	</c:if>
       </c:forEach>
       
          <%-- <li class="gym_nav_li">
             <a id="m101" href="javascript:void(0)" class="gym_venue_name text-center">
                  <p class="gym_header_img"><img src="${pageContext.request.contextPath}/assets/images/header/gym1.png" /></p>
                  <p class="gym_header_size13">场馆信息</p>
             </a>
          </li>
          <li class="gym_nav_li">
             <a id="m102" href="javascript:void(0)" class="gym_venue_name text-center">
                  <p class="gym_header_img"><img src="${pageContext.request.contextPath}/assets/images/header/gym2.png" /></p>
                  <p class="gym_header_size13">会员管理</p>
             </a>
          </li>
          <li class="gym_nav_li">
             <a id="m103" href="javascript:void(0)" class="gym_venue_name text-center">
                  <p class="gym_header_img"><img src="${pageContext.request.contextPath}/assets/images/header/gym3.png" /></p>
                  <p class="gym_header_size13">商品管理</p>
             </a>
          </li>
          <li class="gym_nav_li">
             <a id="m104" href="javascript:void(0)" class="gym_venue_name text-center">
                  <p class="gym_header_img"><img src="${pageContext.request.contextPath}/assets/images/header/gym4.png" /></p>
                  <p class="gym_header_size13">合同管理</p>
             </a>
          </li>
          <li class="gym_nav_li">
             <a id="m105" href="javascript:void(0)" class="gym_venue_name text-center">
                  <p class="gym_header_img"><img src="${pageContext.request.contextPath}/assets/images/header/gym5.png" /></p>
                  <p class="gym_header_size13">课程管理</p>
             </a>
         </li>
         <li class="gym_nav_li">
             <a id="m106" href="javascript:void(0)" class="gym_venue_name text-center">
                  <p class="gym_header_img"><img src="${pageContext.request.contextPath}/assets/images/header/gym6.png" /></p>
                  <p class="gym_header_size13">租柜管理</p>
             </a>
         </li>
         <li class="gym_nav_li">
             <a id="m107" href="javascript:void(0)" class="gym_venue_name text-center">
                  <p class="gym_header_img"><img src="${pageContext.request.contextPath}/assets/images/header/gym7.png" /></p>
                  <p class="gym_header_size13">营销管理</p>
             </a>
          </li>
          <li class="gym_nav_li">
             <a id="m108" href="javascript:void(0)" class="gym_venue_name text-center">
                  <p class="gym_header_img"><img src="${pageContext.request.contextPath}/assets/images/header/gym8.png" /></p>
                  <p class="gym_header_size13">统计分析</p>
             </a>
          </li>
          <li class="gym_nav_li">
             <a id="m109" href="javascript:void(0)" class="gym_venue_name text-center">
                  <p class="gym_header_img"><img src="${pageContext.request.contextPath}/assets/images/header/gym9.png" /></p>
                  <p class="gym_header_size13">员工管理</p>
             </a>
          </li>
          <li class="gym_nav_li">
             <a id="m110" href="javascript:void(0)" class="gym_venue_name text-center">
                  <p class="gym_header_img"><img src="${pageContext.request.contextPath}/assets/images/header/gym10.png" /></p>
                  <p class="gym_header_size13">权限管理</p>
             </a>
          </li>
          <li class="gym_nav_li">
             <a id="m111" href="javascript:void(0)" class="gym_venue_name text-center">
                  <p class="gym_header_img"><img src="${pageContext.request.contextPath}/assets/images/header/gym11.png" /></p>
                  <p class="gym_header_size13">系统日志</p>
             </a>
          </li>
          <li class="gym_nav_li">
             <a href="javascript:void(0)" id="index-a" class="gym_venue_name text-center">
                  <p class="gym_header_img"><img src="${pageContext.request.contextPath}/assets/images/header/gym12.png" /></p>
                  <p class="gym_header_size13">快捷入口</p>
             </a>
          </li>  --%>
       </ul>
  </div>
</body>
    <script type="text/javascript">var plugin_path = 'assets/plugins/';</script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/plugins/jquery/jquery-2.1.4.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/header/header.js"></script>
</html>
