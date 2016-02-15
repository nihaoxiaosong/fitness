(function () {
	 $.MsgBox = { 
			 Alert: function (title, msg, callback) { 
			 	 var ts = title.split("::");
				 var iew = "info";
				 if(ts.length > 1){
					 if(ts[1] =="tip"){
						 iew = "tip";
					 } else if(ts[1] =="warning") {
						 iew = "warning";
					 }
				 }
				 GenerateHtml("alert",iew, ts[0], msg); 
				 btnOk(callback);
				 btnNo(); 
			 },
			 Confirm: function (title, msg, callback) { 
			     var ts = title.split("::");
				 var iew = "info";
				 if(ts.length > 1){
					 if(ts[1] == 'tip'){
						 iew = "tip";
					 } else if(ts[1] =="warning") {
						 iew = "warning";
					 }
				 }
				
				 GenerateHtml("confirm",iew, ts[0], msg); 
				 btnOk(callback); 
				 btnNo();
			 }
	 }
	 window['Alert'] = $.MsgBox['Alert'];
	 window['Confirm'] = $.MsgBox['Confirm'];
	 //生成Html   
	 var GenerateHtml = function (type, iew, title, msg) { 
	 	var img = "";
		if(type=="confirm"){
			img += '<img src="';
			if(iew =="tip"){
				img += 'http://a.myydsj.iydsj.com/fitness/assets/images/msgbox/tip.png">';
			} else if(iew =="warning"){
				img += 'http://a.myydsj.iydsj.com/fitness/assets/images/msgbox/warning.png">';
			} else {
				img += 'http://a.myydsj.iydsj.com/fitness/assets/images/msgbox/info.png">';
			}
		}
		if(type=="alert"){
			img += '<img src="';
			if(iew =="tip"){
				img += 'http://a.myydsj.iydsj.com/fitness/assets/images/msgbox/tip.png">';
			} else if(iew =="warning"){
				img += 'http://a.myydsj.iydsj.com/fitness/assets/images/msgbox/warning.png">';
			} else {
				img += 'http://a.myydsj.iydsj.com/fitness/assets/images/msgbox/info.png">';
			}
		}
	 
	 
		 var _html = ""; 
		 _html += '<div id="mb_box"></div><div id="mb_con"><span id="mb_tit">' + title + '</span>';
		 _html += '<a id="mb_ico"><img src="http://a.myydsj.iydsj.com/fitness/assets/images/msgbox/close.png" /></a><div id="mb_msg"><span id="img">'+img+'</span><p id="mgs_box">'+ msg +'</div></p><div id="mb_btnbox">'; 
		 if (type == "alert") { 
			 _html += '<input id="mb_btn_ok" type="button" value="确定" />';
		 }
		 if (type == "confirm") { 
			 _html += '<input id="mb_btn_ok" type="button" value="确定" />';
			 _html += '<input id="mb_btn_no" type="button" value="取消" />'; 
		 }
		 _html += '</div></div>'; 
		 //必须先将_html添加到body，再设置Css样式    
		 $("body").append(_html); GenerateCss(); 
	 }
	//生成Css 
	 var GenerateCss = function () { 
		 $("#mb_box").css({ width: '100%', height: '100%', zIndex: '99999', position: 'fixed', 
			 filter: 'Alpha(opacity=60)', backgroundColor: 'black', top: '0', left: '0', opacity: '0.6'
		 });
		 $("#mb_con").css({ zIndex: '999999', width: '400px', position: 'fixed',
			 backgroundColor: 'White', borderRadius: '2px'
		 });
		 $("#mb_tit").css({ display: 'block', fontSize: '14px', color: '#333', padding: '7px 15px',
			 backgroundColor: '#e6e6e6', borderRadius: '2px 2px 0 0',  fontWeight: 'bold'
		 });
		 $("#mb_msg").css({ padding: '5px', lineHeight: '20px',  fontSize: '13px',paddingTop:"32px",margin:"0 auto",margin:"0 auto",width:'320px',textAlign:'center'
		 });
		 $("#mb_ico").css({ display: 'block', position: 'absolute', right: '10px', top: '0px',fontSize: '20px',
                           width: '18px', height: '18px', textAlign: 'center',  cursor: 'pointer',  fontFamily: '微软雅黑',color:'#999'
		 });
		 $("#mgs_box").css({display:"inline-block",maxWidth:'270px',wordBreak:'break-all',marginLeft:'10px',textAlign:'left',marginTop:'0',marginBottom:'0'});
		 $("#img").css({marginTop:'0',display:'inline-block',width:'32px',height:'30'});
		 $("#img").find('img').css({float:'left',marginTop:'9px'});
		 $("#mb_btnbox").css({ margin: '25px 0 40px 0', textAlign: 'center' }); 
		 $("#mb_btn_ok,#mb_btn_no").css({ width: '75px', height: '25px', color: 'white', border: 'none' });
		 $("#mb_btn_ok").css({ backgroundColor: '#1fbad6',width: '100px',height: '35px',borderRadius: '3px',cursor: 'pointer',fontFamily: '微软雅黑',fontSize:'14px' }); 
		 $("#mb_btn_no").css({ backgroundColor: '#fff', marginLeft: '20px',border: '1px solid #e6e6e6', color: '#999', width:'98px', height: '35px',borderRadius: '3px',cursor: 'pointer',fontSize:'14px',fontFamily: '微软雅黑'}); 
		//右上角关闭按钮hover样式 
		 $("#mb_ico").find("img").hover(function () { 
			 $(this).attr({src: 'http://a.myydsj.iydsj.com/fitness/assets/images/msgbox/close_hover.png' }); 
		 },function () {
			 $(this).attr({src: 'http://a.myydsj.iydsj.com/fitness/assets/images/msgbox/close.png' });  
		 });

		 
		 //取消按钮滑入效果
		 $("#mb_btn_no").hover(function(){
			  $(this).css({ backgroundColor: '#fff', color: '#333' });
		},function(){
			  $(this).css({backgroundColor: '#fff', color: '#999'})
			});
		//确定按钮滑入效果
		 $("#mb_btn_ok").hover(function(){
			  $(this).css({ backgroundColor: '#4cc8de' });
		},function(){
			  $(this).css({backgroundColor: '#1fbad6'})
			});	
		 var _widht = document.documentElement.clientWidth; //屏幕宽 
		 var _height = document.documentElement.clientHeight; //屏幕高 
		 var boxWidth = $("#mb_con").width(); 
		 var boxHeight = $("#mb_con").height(); 
		//让提示框居中   
		$("#mb_con").css({ top: (_height - boxHeight) / 2 + "px", left: (_widht - boxWidth) / 2 + "px" });
		//$("#mb_con").css({ top: "30%", left: "30%" });
	 }
	//确定按钮事件  
	 var btnOk = function(callback) {
		$("#mb_btn_ok").click(function() {
			$("#mb_box,#mb_con").remove();
			if (typeof (callback) == 'function') {
				callback();
			}
		});
	} 
	// 取消按钮事件
	 var btnNo = function() {
		$("#mb_btn_no,#mb_ico").click(function() {
			$("#mb_box,#mb_con").remove();
		});
	}
	
})();
