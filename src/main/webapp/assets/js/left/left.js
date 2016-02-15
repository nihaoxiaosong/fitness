//菜单隐藏展开
function titleTab(){
	$(".vcon").first().show();
	$(".vtitle").find('em').first().removeClass('v02').addClass('v01');
	var tabs_i=0;
	$('.vtitle').click(function(){
		var _self = $(this);
		var j = $('.vtitle').index(_self);
		if( tabs_i == j ) return false; tabs_i = j;
		$('.vtitle em').each(function(e){
			if(e==tabs_i){
				$('em',_self).removeClass('v02').addClass('v01');
			}else{
				$(this).removeClass('v01').addClass('v02');
			}
		});
		$('.vcon').slideUp().eq(tabs_i).slideDown();
		
		if($(this).next() != null ){
			$(this).next().next().addClass("vson_line");
		}
		
	});
}

//菜单状态切换
var fmid = "fhindex";
var mid = "fhindex";
function siMenu(id,fid,MENU_NAME,MENU_URL){
	$(window.frames["mainFrame"].document).find(".index-info").hide();
	$(window.frames["mainFrame"].document).find(".tab-header").show();
	if(!mainFrame.countCheck(id)){
		$.MsgBox.Alert("提示", "标签页同时最多只能打开6个！");
		return false;
	}
	/*if(id != mid){
		$("#"+mid).removeClass();
		mid = id;
	}
	if(fid != fmid){
		$("#"+fmid).removeClass();
		fmid = fid;
	}*/
	$(".vconlist li").removeClass("select");
	$("#"+id).addClass("select");
	mainFrame.tabAddHandler(id,MENU_NAME,MENU_URL);
	//if(MENU_URL != "druid/index.html"){
	//	jzts();
	//}
}

function loadMenu(obj){
	$(".jsf_left").html("");
	var firstB = "<div id='{id}' class='vtitle'><em class='v v02'>";
	var firstE = "</em></div>";
	 
	var secondB = "<div class='vcon'><ul class='vconlist clearfix'>";
	var secondE = "</ul></div>";
	
	$.each(obj, function (n, value) {
		var jsf_left_title = "";
	 	var jsf_left_list = secondB;

	    var nameTitle = value.nameTitle;
	    var id = value.id;
	    var list = value.list;
	    jsf_left_title = jsf_left_title + firstB.replace('{id}',("fm"+id)) + nameTitle +firstE;

	    $.each(list, function(n,value){
	       var listid= value.listid;
	       var listurl = value.url;
	       var target = value.target;
	       var listname = value.names;
	       //alert(listid);
	       jsf_left_list = jsf_left_list + "<li id=\"sm"+listid+"\"><a onclick='siMenu(\"sm"+listid+"\",\"fm" +id+"\",\""+listname+"\",\""+listurl+"\")' target=\""+target+"\">" + listname + "</a></li>";
	       
	    });
	    jsf_left_list += secondE;
	    
	    $(".jsf_left").append(jsf_left_title);
	    $(".jsf_left").append(jsf_left_list);
	});
	
	titleTab();

}