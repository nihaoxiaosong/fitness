// JavaScript Document
$(function(){
	var contextPath = $("#contextPath").val();
	
	//关闭按钮hover效果
	$(".short_main_li").hover(
	    function(){
		    $(this).find(".short_main_close").show();
	    },
		function(){
			$(this).find(".short_main_close").hide();
			}
	 );
	 
	//关闭按钮功能
    $(".short_main_close").click(function(){
	   $(this).parent().parent().remove();	
	});
	
	//加号滑入效果
	$(".short_main_add").hover(
	    function(){
			$(this).css("backgroundImage","url("+contextPath+"/assets/images/shortcuts/short_add_hover.png)");
		},
		function(){
			$(this).css("backgroundImage","url("+contextPath+"/assets/images/shortcuts/short_add.png)");
		}
	 );
	//仿chebox效果 
	$(".short_img_check").click(function(){
		if($(this).hasClass("short_img_check1")){
			 $(this).removeClass("short_img_check1");
		}else{
		$(this).addClass("short_img_check1").parent().parent().siblings("tr").find(".short_img_check").removeClass("short_img_check1");	
		}
	});
	//右上角关闭按钮hover
	$(".short_header_close").hover(
	   function(){
		   $(this).css("background-image","url("+contextPath+"/assets/images/shortcuts/short_closed_hover.png)");
		   },
	   function(){
		   $(this).css("background-image","url("+contextPath+"/assets/images/shortcuts/short_closed.png)");
		   }	   
	);
});