// JavaScript Document
$(function(){
	
	 //1 仿select下拉框
	 
	 // 向下箭头
	$(".common_select_img").click(function(event){
		   event.stopPropagation();
		   $(this).parent().next(".common_select_ul").slideToggle();
	});
	// 获取li里面的值
    $(".common_select li").bind("mousedown",function(){
		  var $text=$(this).text();
		  $(this).parent().prev(".common_top_select").find(".common_select_type").text($text).css("color","#999");
		  $(this).parent(".common_select_ul").slideUp();
	});

	//向下箭头hover效果
	$(".common_select_img").find("img").hover(function(){
		$(this).attr("src","http://a.myydsj.iydsj.com/fitness/assets/images/select_hover.png");
	},function(){
		$(this).attr("src","http://a.myydsj.iydsj.com/fitness/assets/images/select.png");
		});
		
	//点击其他地方ul消失
	$(document).bind("click",function(e){ 
        var target = $(e.target); 
         if(target.closest(".common_select_ul").length == 0){ 
              $(".common_select_ul").slideUp(); 
          } 
    });	
	
	//2 搜索框效果
	
	//搜索按钮hover
	$(".common_search_btn").hover(
	
	     function(){
		     $(this).css("backgroundImage","url(http://a.myydsj.iydsj.com/fitness/assets/images/common_search_hover.png)");
	     },
	     function(){
		    $(this).css("backgroundImage","url(http://a.myydsj.iydsj.com/fitness/assets/images/common_search.png)");
	     }
	);
	
	 //搜索按钮点击
	$(".common_search_btn").click(function(){
		alert('你可以在这里写关键字搜索逻辑');
	});
	
    //input获得焦点，文字改变颜色
   $(".common_input_search").focus(function(){
		$(this).css("color","#333");
	});
    //input失去焦点，文字改变颜
	$(".common_input_search").blur(function(){
		$(this).css("color","#999");
	});	
	//3 年月日
	$(".common_time_main").mouseenter(function(){
		$(this).prev(".common_time_bg").show();
	});
	$(".common_time_box").mouseleave(function(){
		$(this).find(".common_time_bg").hide();	
	});
	//确定按钮变色
	$(".common_timeqd_btn").hover(
	    function(){
			$(this).css("background-color","#4cc8de");
		},
		function(){
		  	$(this).css("background-color","#1fbad6");
		}
	);
   $(".common_time_left").find("input").blur(function(){
	   $(this).css("color","#999");
	});
   //时间搜索确定按钮
   $(".common_timeqd_btn").click(function(){
	   alert('你可以用这个来写时间搜索逻辑');
	});
});