<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'app.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache
	">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<!-- 引入easy-ui标签---------------start---- -->
	<link rel="stylesheet" type="text/css" href="/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="/themes/default/easyui.css">
	<script type="text/javascript" src="/js/jquery.min.js"></script>
	<script type="text/javascript" src="/js/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="/js/easyui-lang-zh_CN.js"></script>
	<!-- 引入easy-ui标签---------------end---- -->
	<script type="text/javascript">
		$(function(){
		    $.ajax({
				url:"/sysResources/findSelectById.do",
				success:function(data){
					for(var i = 0;i < data.length;i++){
                        $('#myAccordion').accordion('add', {
                            title: data[i].resName,
                            selected: false
                        });
					}
				}
			});
			/* 给手风琴设置样式----------start------- */
					$("#myAccordion").accordion({
						fit:true,
/*                        onSelect:function(){
                            $.ajax({
                                url:"/sysResources/findSelectById.do",
                                success:function(data){
                                    $('#myAccordion').append("");
                                    for(var i = 0;i < data.length;i++){
                                        $('#myAccordion').append("<div>'+'data[i].resName'+'</div>");
                                    }
                                }
                            });
                        },*/
					});
			/* 给手风琴设置样式----------end------- */

			/* 	添加选项卡样式-------------start------	 */
					$("#tt").tabs({
						fit:true
					});
			/* 	添加选项卡样式-------------end------	 */
		});
		//在tabs中添加一个选项卡
		function addTab(title,url){
			//alert(title+"***"+url);
			//在tabs中添加一个选项卡
			//如果要添加的选项卡已经存在,选中;否则添加一个新的选项卡
			//根据标题判断选项卡存在还是不存在
			var isExists =  $("#tt").tabs("exists",title);
			if(isExists){
				//选项卡已经存在
				//选中这个选项卡
				$("#tt").tabs("select",title);
			}else{
				//选项卡不存在
				//添加一个选项卡
				$("#tt").tabs("add",{
					title: title,
					selected: true,
					closable:true,
					content:"<iframe src='"+url+"' style='width: 100%;height: 100%'></iframe>"
					/* href:url */
				});
				//在选项卡中显示内内容,通过content属性完成
				//通过iframe标签完成
			}
		}
	</script>
  </head>
  <!-- 	设置布局--------------start------------ -->
		  <body class="easyui-layout">
					    <div data-options="region:'west',title:'智慧油站管理平台',split:true" style="width:250px;">
							<!--  左边的手风琴-------start----- -->
								<div id="myAccordion" class="easyui-accordion" style="width:300px;height:200px;"></div>
							<!--  左边的手风琴-------end----- -->
					    </div>
			   <!--  中间的主体部分-------------start---- -->
			    <div data-options="region:'center',title:'欢迎来到智慧油站管理系统'" style="padding:5px;background:#eee;"></div>
			    <!--  中间的主体部分-------------end--- -->
		  </body>  
  <!-- 	设置布局--------------end------------ -->
</html>
