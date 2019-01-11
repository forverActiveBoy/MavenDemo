<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
  <html>
    <head>
      <title></title>
      <meta http-equiv="pragma" content="no-cache">
      <meta http-equiv="cache-control" content="no-cache">
      <meta http-equiv="expires" content="0">
      <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
      <meta http-equiv="description" content="This is my page">

        <link rel="stylesheet" type="text/css" href="/admin/css/global/style.css" />
        <link rel="stylesheet" type="text/css" href="/themes/icon.css">
        <link rel="stylesheet" type="text/css" href="/themes/default/easyui.css">
        <script type="text/javascript" src="/js/jquery.min.js"></script>
        <script type="text/javascript" src="/js/jquery.easyui.min.js"></script>
        <script type="text/javascript" src="/js/easyui-lang-zh_CN.js"></script>
        <script type="text/javascript">
            function form_submit(){
                $("#login").form("submit", {
                    url:"/sysAdmin/login.do",
                    success: function(data){
                        console.log(data);
                        if(data.isLogin){
                          /* window.location.href="/main.jsp";*/
                            $.messager.alert("提示框","登录失败","info");
                        }else{
                           /*$.messager.alert("提示框","登录失败","info");*/
                          window.location.href="/main.jsp";
                        }
                    }
                });
            }
        </script>
    </head>

    <body>
      <div id="top"> </div>
      <form id="login" name="login" >
        <div id="center">
          <div id="center_left"></div>
          <div id="center_middle">
            <div class="user">
              <label>用户名：<input type="text" name="username" id="email"/></label>
            </div>
            <div class="user">
              <label>密　码：<input type="password" name="password" id="pwd"/></label>
            </div>
          </div>
          <div id="center_middle_right"></div>
          <div id="center_submit">
            <div class="button"> <img src="/admin/imgs/global/dl.gif" width="57" height="20" onclick="form_submit()" > </div>
            <div class="button"> <img src="/admin/imgs/global/cz.gif" width="57" height="20"> </div>
          </div>
        </div>
      </form>
    </body>
  </html>
