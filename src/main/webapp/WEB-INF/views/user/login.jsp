<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/28
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<title>登录 灵步网微薄-点滴生活，精彩每一天</title>
<link href="styles/global.css" type="text/css" rel="stylesheet" />
<link href="styles/login.css" type="text/css" rel="stylesheet" />
<script src="script/login.js" language="javascript"></script>
<script src="script/trim.js" language="javascript"></script>
</head>

<body>
<!--页面整体-->
<div id="container">
    <!-- top部分DIV -->
    <div id="top">
        <!-- top部分的LogoDIV -->
        <div id="topLogo">
            <!-- topLogo部分的icoDIV -->
            <div id="topLogoIco"> <a href="index.html"><img src="images/logo_ipad.png" width="72" height="72" alt="" /></a>
            </div>
            <!-- topLogo部分的icoDIV结束 -->

            <!-- topLogo部分的wordDIV -->
            <div id="topLogoWord"> <a href="index.html"><img src="images/LogoMaker.gif" width="128" height="60" alt="" /></a>
            </div>
            <!-- topLogo部分的wordDIV -->
        </div>
        <!-- top部分的LogoDIV结束 -->

        <!-- top部分的文字导航 -->
        <div id="topWordMenu">
            <ul>
                <li>已有灵步账号，<a href="login.html">请登录</a></li>
                <li><a href="SBGG.html">随便逛逛</a></li>
                <li><a href="#">手机</a></li>
                <li><a href="#">帮助</a></li>
            </ul>
        </div>
        <!-- top部分的文字导航结束 -->
    </div>
    <!-- top部分结束 -->
    <!-- 页面主体 -->
    <div id="banner">
        <!-- 页面左部 -->
        <div id="left">
            <!--页面左部表单设置-->
            <form id="LoginForm" action="/login" method="post" onsubmit="return checkForm()">
                <table width="565" border="0" cellspacing="0" cellpadding="0">
                    <tr class="lb">
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td class="le"></td>
                        <td class="ld">用户名</td>
                        <td class="if"><input name="name" type="text" class="la" id="userId" />
                            <c:if test="${requestScope.error == 1}">&nbsp;&nbsp;<b style="color: #FF0000">用户名或者密码有误</b></c:if> </td>
                        <td></td>
                    </tr>
                    <tr>
                        <td class="le"></td>
                        <td class="ld">密码</td>
                        <td class="if"><input name="password" type="password" class="la" id="passWord" /></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td class="le"></td>
                        <td class="ld"></td>
                        <td><input name="checkbox" type="checkbox" id="checkbox" checked="checked" />
                            下次自动登陆&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="#">忘记密码</a></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td class="le"></td>
                        <td class="ld"></td>
                        <td><a href="#">
                            <input name="button" type="submit" class="lc" id="button" value="登  录" />
                        </a></td>
                        <td></td>
                    </tr>
                </table>
            </form>
            <!--页面左部表单结束-->
        </div>
        <!-- 页面右部 -->
        <div id="right">
            <!--页面右部文字及按钮设置-->
            <div class="bs">
                还没有微博？
            </div>
            <div class="cs">
                赶快来注册一个吧
            </div>
            <div class="ds"><a href="register.html"><img src="images/anniu.gif" alt="立即注册" width="155" height="48" border="0" title="在这注册" /></a>
            </div>
        </div>
    </div>
    <!--页面右部文字及按钮设置结束-->
    <!-- footer部分 -->
    <div id="footer">
        <!-- footer网站链接部分 -->
        <div id="footerLink">
            <ul>
                <li><a href="#">灵步网介绍</a></li>
                <li><a href="#">广告服务</a></li>
                <li><a href="#">API</a></li>
                <li><a href="#">诚征英才</a></li>
                <li><a href="#">保护隐私权</a></li>
                <li><a href="#">免责条款</a></li>
                <li><a href="#">法律顾问</a></li>
                <li><a href="#">意见反馈</a></li>
            </ul>
        </div>
        <!-- footer网站链接部分结束 -->
        <!-- footer网站版权信息 -->
        <div id="footerCopy">
            Copyright&copy;2011-2012 灵步小组 版权所有
        </div>
        <!-- footer网站版权信息结束 -->
    </div>
    <!-- footer部分结束 -->
</div>
</body>
</html>
