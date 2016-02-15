// JavaScript Document
$(function(){
	
	//header菜单点击颜色的切换
	$(".gym_nav_li").find(".gym_venue_name").click(function(){
		// 判断点击的是否是 快捷入口
		if($(this).attr("id") == "index-a"){
			return ;
		}
		// 改变点击颜色
		$(this).addClass("gym_a_active").parent(".gym_nav_li").siblings().find(".gym_venue_name").removeClass("gym_a_active");
		//alert("在这里执行一个AJAX刷新菜单的操作！");
		// ajax load data
		
		var id = $(this).attr("id");
		var $url = "99_data/left/left.json";
		if(id == "m111"){
			$url = "99_data/left/left_system.json";
		} else if(id == "m110"){
			$url = "99_data/left/left_authority.json";
		}
		$.ajax({  
			url: $url,   
			dataType:'json',  
			type:'get',
			success: function(data){
				// 加载菜单
				loadMenu(data);
				
			},
			error:function(){}
		});

	});
	
	var m = getUrlParam('m');
	// 模块是否为空
	if(m != null && "" != m){
		$("#"+m).click();
	}
	// 根据URL参数点击
	var fm = getUrlParam('fm');
	var sm = getUrlParam('sm');
	// 一级菜单选项是否为空
	if(fm != null && "" != fm){
		setTimeout(function () {
			$("#"+fm).click();
		}, 300);
	}
	// 二级菜单选项是否为空
	if(sm != null && "" != sm){
		setTimeout(function () {
			$("#"+sm +" a").click();
		}, 300);
	}
	
	//header菜单滑入颜色的切换	
	$(".gym_nav_li").find(".gym_venue_name").hover(function(){
		$(this).addClass("gym_a_hover").parent(".gym_nav_li").siblings().find(".gym_venue_name").removeClass("gym_a_hover");
	},function(){
		$(this).removeClass("gym_a_hover");
	});	
		
});


//获取url中的参数
function getUrlParam(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
    var r = window.location.search.substr(1).match(reg);  //匹配目标参数
    if (r != null) return unescape(r[2]); return null; //返回参数值
}