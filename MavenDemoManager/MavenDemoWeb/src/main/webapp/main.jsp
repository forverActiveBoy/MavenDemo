<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  	<script type="text/javascript" src="/js/jquery.min.js"></script>
  	<script type="text/javascript" src="/js/jquery.easyui.min.js"></script>
  	<script type="text/javascript" src="/js/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="/js/datagrid-detailview.js"></script>
   	<link type="text/css" rel="stylesheet" href="/css/css.css">
	<link type="text/css" rel="stylesheet" href="/css/easyui.css">
 	<link type="text/css" rel="stylesheet" href="/css/icon.css">

<script type="text/javascript">
    $(function(){
        // 1. 通过ajax 加载后台数据
        $.ajax({
            url:"/sysResources/findMeau.do",
            success:function(data){
                // data  一级菜单   二级菜单
                //  一级菜单 ----  title
                // 二级菜单  ---    content
                $.each(data, function (index, value) {
                    var content = "";
                    $.each(value.children, function (ind, val) {
                        content += "<a class='easyui-linkbutton' onClick=\"addTabs('" + val.resUrl + "')\"data-options=\"plain:true,iconCls:'icon-munich-statistics'\" style='padding-left:10px;width:98%;margin:1 auto;text-align:left;'>" + val.text + "</a>";
                    })
                    // 将加载后的数据,填充至 手风琴中
                    $("#ad").accordion("add", {
                        title: value.text,
                        content: content
                    });
                })
            }
        })
    });
    function addTabs(node){
        console.log(node);
        if(node!=null){
            $("#myIframe").prop("src","/agent.jsp");
        }
    }
</script>
  </head>
  <body class="easyui-layout">

 	<div data-options="region:'north'" style="height:130px;">

 	 <table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="57" background="/admin/imgs/global/main_03.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="378" height="57" background="/admin/imgs/global/main_01.gif">&nbsp;</td>
        <td>&nbsp;</td>
        <td width="281" valign="bottom"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="33" height="27"><img src="/admin/imgs/global/main_05.gif" width="33" height="27" /></td>
            <td width="248" background="/admin/imgs/global/main_06.gif"><table width="225" border="0" align="center" cellpadding="0" cellspacing="0">
              <tr>
                <td height="17"><div align="right"><a href="javascript:(0)" target="rightFrame"><img id="globalpass" src="/admin/imgs/global/pass.gif" width="69" height="17" /></a></div></td>
                <td><div align="right"><a href="javascript:(0)" target="rightFrame"><img id="globaluser" src="/admin/imgs/global/user.gif" width="69" height="17" /></a></div></td>
                <td><div align="right"><a href="/user/logout.do"><img id="globalquit" src="/admin/imgs/global/quit.gif" alt=" " width="69" height="17" /></a></div></td>
              </tr>
            </table></td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="40" background="/admin/imgs/global/main_10.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="194" height="40" background="/admin/imgs/global/main_07.gif">&nbsp;</td>
        <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="21"><img src="/admin/imgs/global/main_13.gif" width="19" height="14" /></td>
            <td width="35" class="STYLE7"><div align="center"><a href="main.html" target="rightFrame">首页</a></div></td>
            <td width="21" class="STYLE7"><img src="/admin/imgs/global/main_15.gif" width="19" height="14" /></td>
            <td width="35" class="STYLE7"><div align="center"><a href="javascript:history.go(-1);">后退</a></div></td>
            <td width="21" class="STYLE7"><img src="/admin/imgs/global/main_17.gif" width="19" height="14" /></td>
            <td width="35" class="STYLE7"><div align="center"><a href="javascript:history.go(1);">前进</a></div></td>
            <td width="21" class="STYLE7"><img src="/admin/imgs/global/main_19.gif" width="19" height="14" /></td>
            <td width="35" class="STYLE7"><div align="center"><a href="javascript:window.parent.location.reload();">刷新</a></div></td>
            <td width="21" class="STYLE7"><img src="/admin/imgs/global/main_21.gif" width="19" height="14" /></td>
            <td width="35" class="STYLE7"><div align="center"><a href="" target="_parent">帮助</a></div></td>
            <td>&nbsp;</td>
          </tr>
        </table></td>
        <td width="248" background="/admin/imgs/global/main_11.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="16%"><span class="STYLE5"></span></td>
            <td width="75%"><div align="center"></div></td>
            <td width="9%">&nbsp;</td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="30" background="/admin/imgs/global/main_31.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="8" height="30"><img src="/admin/imgs/global/main_28.gif" width="8" height="30" /></td>
        <td width="147" background="/admin/imgs/global/main_29.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="24%">&nbsp;</td>
            <td width="43%" height="20" valign="bottom" class="STYLE1">管理菜单</td>
            <td width="33%">&nbsp;</td>
          </tr>
        </table></td>
        <td width="39"><img src="/admin/imgs/global/main_30.gif" width="39" height="30" /></td>
        <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="20" valign="bottom"><span class="STYLE1">当前登录用户：
            	<a id="nickname"><shiro:principal></shiro:principal></a>
				<a id="jurisdiction"></a>
			</span></td>
            <td valign="bottom" class="STYLE1"><div align="right"></div></td>
          </tr>
        </table></td>
        <td width="17"><img src="/admin/imgs/global/main_32.gif" width="17" height="30" /></td>
      </tr>
    </table></td>
  </tr>
</table>
 	</div>


   <%-- 手风琴展示-------satart--------%>
        <div data-options="region:'west',title:'菜单详情'" style="width:130px;">
             <div id="ad" class="easyui-accordion" data-options="fit:true"></div>
        </div>
    <%-- 手风琴展示-------end--------%>


    <%--数据展示区-------start--------%>
        <div id="center" data-options="region:'center',title:'数据展示'" >
            <iframe id="myIframe" height="100%" width="100%" src="/cmfz_main.jsp"></iframe>
        </div>
    <%-- 手风琴展示-------satart--------%>


  </body>
</html>
