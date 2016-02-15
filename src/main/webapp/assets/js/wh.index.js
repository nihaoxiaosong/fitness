// JavaScript Document
$(function(){
	
	// 默认--快捷方式--选中
	$("#index-a").addClass("gym_a_active").parent(".gym_nav_li").siblings().find(".gym_venue_name").removeClass("gym_a_active");

	// 点击 快捷标签页后的 操作
	$(".content-body a").bind("click", function(){
		
	});
	
});

// layour布局高度控制
window.onload = window.onresize = function(){
	var docWidth = document.documentElement.clientWidth;
    var docHeight = document.documentElement.clientHeight;

	var mainF = $(".short_bg");

	// 最外层iframe的高度
	var minH = parseInt(docHeight) - 75;
	if(minH < 590){
		minH = 590;
	}

	mainF.css({
        'height': minH
    });


}