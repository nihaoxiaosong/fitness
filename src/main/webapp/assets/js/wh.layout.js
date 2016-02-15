
// 页面初始化
$(function(){

});

// layour布局高度控制
window.onload = window.onresize = function(){
	var docWidth = document.documentElement.clientWidth;
    var docHeight = document.documentElement.clientHeight;

    var main = $(".main-container .main");
	var left = $(".main-container .left-menu");
	var mainF = $("#mainFrame");
	var page = $(window.frames["mainFrame"].document).find("#page");
	var tabIndex = $(window.frames["mainFrame"].document).find(".index-info");

	// 最外层iframe的高度
	var minH = parseInt(docHeight) - 75;
	if(minH < 555){
		minH = 555;
	}
	// 内层iframe的包含者的高度
	var minHP = parseInt(docHeight) - 115;
	// 菜单高度
	left.css({
        'height': minH
    });
	mainF.css({
		'height': minH
	});
	tabIndex.css({
		'height': minH
	});
	page.css({
        'height': minHP
    });

}
