 var tab;	
$( function() {
	 tab = new TabView( {
		containerId :'tab_menu',
		pageid :'page',
		cid :'tab1',
		position :"top"
	});
	/*tab.add( {
		id :'tab1_index1',
		title :"主页",
		url :"main.html",
		isClosed :false
	});*/
	/**tab.add( {
		id :'tab1_index1',
		title :"主页",
		url :"/per/undoTask!gettwo",
		isClosed :false
	});
	**/
	
	// 提示信息
	$(".index-info").show();
	$(".tab-header").hide();
	
	// 双击关闭
	dbc();
});

function tabAddHandler(mid,mtitle,murl){
	tab.update({
		id :mid,
		title :mtitle,
		url :murl,
		isClosed :true
	});
	tab.add({
		id :mid,
		title :mtitle,
		url :murl,
		isClosed :true
	});

	tab.activate(mid);
	dbc();
}

function dbc(){
	$(".tab_item").bind("dblclick",function(){
		if("tab1_index1" != $(this).attr("id")){
			// 取消选中状态
			$("#"+$(this).attr("id"),parent.document).removeClass("select");
			// 触发关闭操作
			$(this).find(".tab_close").click();
			// 检测是否全部关闭
			if($(".tab_item").length <= 0){
				$(".index-info").show();
				$(".tab-header").hide();
			}
		}
	});
}

function countCheck(id){
	var result = true;
	$(".tab_item").each(function(){
		if($(this).attr("id") == id) result = false;
	});
	if(!result){return true;}
	var count = $(".tab_item").length;
	if(count > 5){
		return false;
	}
	return true;
}

/**function cmainFrameT(){
	var hmainT = document.getElementById("page");
	var bheightT = document.documentElement.clientHeight;
	hmainT .style.width = '100%';
	hmainT .style.height = (bheightT  - 51) + 'px';
}
cmainFrameT();
window.onresize=function(){  
	cmainFrameT();
};*/