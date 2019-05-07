<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="flowershop.pojo.UserInfo,java.util.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%UserInfo currentuser=(UserInfo)session.getAttribute("currentuser");%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>确认购买 </title>

    <!-- bootstrap -->
    <link rel="stylesheet" href="assets/vendors/bootstrap-3.3.7/css/bootstrap.min.css">

    <link rel="stylesheet" href="assets/vendors/font-awesome-4.7.0/css/font-awesome.min.css">
    <!-- other -->
    <link rel="stylesheet" href="assets/css/common.css">
    <link rel="stylesheet" href="assets/css/detail.css">
    <link rel="stylesheet" href="assets/css/confirmShop.css">
    <link rel="stylesheet" href="assets/css/cityLayout.css">
    <link rel="stylesheet" href="assets/css/openwindow.css">
    <script src="assets/vendors/citys/jquery-1.9.1.min.js"></script>
    <script src="assets/js/cityselect.js"></script>
    <script type="text/javascript">
	$(function() {
		init_city_select($("#sel1, #sel2"));		
	});
    </script>
</head>

<body>

    <!-- 头部导航 -->
    <div class="header-nav">
        <div class="header-container">
            <!-- 左部条目 -->
            <div class="l-info">
                <ul class="clearfix">
                    <li class="collect">
                        <a href="">
                            <i class="fa fa-star" aria-hidden="true"></i>
                            收藏浪漫花房
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/blogin.action">进入后台</a>                   
                    </li>
                    <c:if test="${sessionScope.currentuser!=null}">
                       <div class="loginArea">
                        <li>
                            欢迎
                            <span id="nickname"><%=currentuser.getNickName() %></span>
                        </li>
                    </div>
                    </c:if>
                    
                    <li>
                        <a href="${pageContext.request.contextPath}/index.action">首页</a>
                    </li>
                </ul>
            </div>
            <!-- 右部条目 -->
            <div class="r-info">
                <ul class="clearfix">
                    <li>
                        <a href="">联系客服</a>
                    </li>
                    <!-- 登录后展示 -->
                    <c:if test="${sessionScope.currentuser!=null}">
                        <div class="loginArea clearfix" id="mineP">                        
                        <li>
                            <a href="${pageContext.request.contextPath}/cart.action?NickName=<%=currentuser.getNickName()%>" id="cart">购物车</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/myBuy.action" id="mineBuy">我的购买</a>
                        </li>                       
                      </div>
                    </c:if>
                    
                    <!-- 登录后展示 end -->
                    <!-- 登录前展示 -->
                    <c:if test="${sessionScope.currentuser==null}">
                       <div class="registerArea clearfix">
                        <li>
                            <a href="${pageContext.request.contextPath}/redirect.action?flag=register">注册</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/redirect.action?flag=login">登录</a>
                        </li>
                      </div>
                    </c:if>                   
                    <!-- 登录前展示 end -->
                </ul>
            </div>
        </div>
    </div>

    <!-- 搜索区域 -->
    <div class="search-area">
        <!-- logo -->
        <div class="logo-container">
            <img src="assets/img/logo.jpg" alt="logo">
        </div>
        
    </div>
    
    <!-- 弹出窗口end -->
    <div class="mui-mbar-tabs">
       <div class="quick_links_wrap"> 
          <div class="quick_link_mian">
             <c:if test="${sessionScope.currentuser==null}">
                <div class="quick_links_panel">
                 <div class="quick_links">
                    <li class="user">
                       <a href="${pageContext.request.contextPath}/redirect.action?flag=login">
                          <img class="imguser" alt="..." src="uploads/avatar.jpg"  class="imguser">                          
                       </a>
                       <div class="no-login">您还未登录哦，点击登录</div>
                    </li>
                  </div>
                </div>
             </c:if>
             <c:if test="${sessionScope.currentuser!=null}">
                <div class="quick_links_panel">
                 <div class="quick_links">
                    <li class="user">
                       <a href="${pageContext.request.contextPath}/redirect.action?flag=user">
                          <c:if test="${sessionScope.currentuser.getPicture()==null}">
                           <img src="uploads/avatar.jpg" alt="avatar"  class="imguser"/>
                          </c:if>
                          <c:if test="${sessionScope.currentuser.getPicture()!=null}">
                             <img src="/Image/User/<%=currentuser.getPicture()%>" alt="avatar"  class="imguser">
                          </c:if>
                          <c:if test="${sessionScope.currentuser.getSex()=='男'}">
                             <i class="fa fa-mars"></i>
                          </c:if>
                          <c:if test="${sessionScope.currentuser.getSex()=='女'}">
                             <i class="fa fa-venus"></i>
                          </c:if>
                       </a>                       
                    </li>
                    <li class="shopcart">
                       <a class="ico_cart" href="${pageContext.request.contextPath}/cart.action?NickName=<%=currentuser.getNickName()%>">
                          <i class="fa fa-shopping-cart fa-lg"></i>
                          <div class="span">购物车</div>
                          <span class="cart_num" id="cart_num">0</span>
                       </a>
                    </li>
                    <li class="mybuy"> 
                       <a class="paper-plane" href="${pageContext.request.contextPath}/myBuy.action">
                          <i class="fa fa-tasks fa-lg"></i>
                          <div class="span">我的订单</div>
                       </a>               
                    </li>
                    <li class="myheart"> 
                       <a class="fa-heart-o" href="${pageContext.request.contextPath}/hearted.action?nickname=<%=currentuser.getNickName()%>">
                          <i class="fa fa-heart fa-lg"></i>
                          <div class="span">收藏</div>
                       </a>
                    </li>
                    <li class="mycomment">                      
                       <a class="fa-commenting" href="${pageContext.request.contextPath}/mycomment.action?nickname=<%=currentuser.getNickName()%>">
                          <i class="fa fa-commenting-o fa-lg"></i>
                          <div class="span">我的评论</div>
                       </a>
                    </li>           
                 </div>
              </div>
             </c:if>            
          </div>
       </div>
    </div>
    <!-- 主体区域 -->
    <form action="${pageContext.request.contextPath}/addorder.action?nickname=<%=currentuser.getNickName()%>" method="post">
        <div class="container">
        <!-- info -->
        <div class="info">
            <div class="get">
                <div class="title">收货人信息</div>
                <div class="inner">
                    <div class="get-name-c">
                        <i class="fa fa-user"></i>
                        <span>收货人姓名</span>
                        <input type="text" name="consigneename" id="get-name" placeholder="请输入收货人姓名" value="">
                    </div>
                    <div class="get-tel-c">
                        <i class="fa fa-phone"></i>
                        <span>收货人联系方式</span>
                        <input type="text" name="consigneetel" id="get-tel" placeholder="请输入收货人联系方式" value="">
                    </div>
                    <div id="selectCity" class="citys">
                        <i class="fa fa-map-marker"></i>
                        <span>收货人地址</span>                      
                        <p>
                           <input name="address" id="sel1"  type="text"  class="city_input" readonly="readonly" value="" placeholder="请选择地址">
                        </p>
                        
                        <p id="place">请输入详细地址</p>
                        <input type="text" name="minuteaddress" id="get-d-add" placeholder="请输入详细地址" value="">
                    </div>
                </div>
            </div>
        </div>

        <!-- item -->
        <div class="item">
            <div class="info-item">
                <table>
                    <tbody>
                        <tr id="title">
                            <td class="header-item">商品</td>
                            <td class="header-price">单价</td>
                            <td class="header-count">数量</td>
                        </tr>
                        <!-- 从购物车购买 -->
                        <c:if test="${cartlist.size()>0}">
                            <c:forEach items="${cartlist}" var="list">
                        <tr>
                            <td class="header-item">
                              <img src="${list.fimage}" alt="" id="fimage">
                              <span id="fname">
                               ${list.fname}
                              </span>
                            </td>
                            <td class="header-price item-price">
                               &yen;${list.salePrice}
                            </td>
                            <td class="header-count item-count">
                               ${list.quantity}
                            </td>
                         </tr>
                        </c:forEach>
                        </c:if>
                                               
                        <!-- 直接购买 -->
                        <c:if test="${flist.size()>0}">
                             <c:forEach items="${flist}" var="list">
                        <tr>
                            <td class="header-item">
                              <img src="${list.fimage}" alt="" id="fimage">
                              <span id="fname">
                               ${list.fname}
                              </span>
                            </td>
                            <td class="header-price item-price">
                               &yen;${list.salePrice}
                            </td>
                            <td class="header-count item-count">
                               ${list.quantity}
                            </td>
                         </tr>
                        </c:forEach>
                        </c:if>
                       
                    </tbody>
                </table>
            </div>
        </div>
        <div class="count">
            <p class="msg">${msg}</p>
            <p>
                实付款：
                <span class="mon" name="pay">&yen;${sumofmoney}</span>
            </p>
            <input type="submit" value="提交订单" id="okToBuy">
            <span class="info-text"></span>
        </div>
    </div>
    </form>
    

    <!-- 底部部分 -->
    <div class="footer">
        <hr>
        <div class="footer-container">
            <span class="footer-title">/ · 友情链接 · /</span>
            <div class="footer-link">
                <img src="assets/img/link_pic/link_pic_1.png" alt="link_pic">
                <span> / </span>
                <img src="assets/img/link_pic/link_pic_3.jpg" alt="link_pic">
                <span> / </span>
                <img src="assets/img/link_pic/link_pic_4.jpg" alt="link_pic">
                <span> / </span>
                <img src="assets/img/link_pic/link_pic_5.jpg" alt="link_pic">
            </div>
            <span>Copyright© &nbsp;&nbsp;&nbsp; 2017-2027 &nbsp;&nbsp;&nbsp;版权所有&nbsp;&nbsp;严禁复制</span>
        </div>
    </div>

    <script src="assets/vendors/jquery/jquery.min.js"></script>
    <script src="assets/vendors/citys/jquery.citys.js"></script>
    <script src="assets/js/header.js"></script>
    <!-- search -->
    <script src="assets/js/search.js"></script>
    <script src="assets/vendors/artTemplate/template-native.js"></script>
    <%-- <script id="template" type="text/html">
        <% for(i = 0; i < content.length; i++) {%>
            <tr>
                <td class="header-item">
                    <img src="../<%=content[i].FImage%>" alt="">
                    <span>
                        <%=content[i].FName%>
                    </span>
                </td>
                <td class="header-price item-price">
                    <%=content[i].SalePrice%>
                </td>
                <td class="header-count item-count">
                    <%=content[i].SaleQuantity%>
                </td>
            </tr>
            <% } %>
    </script> --%>

   <%--  <script id="template-once" type="text/html">
        <tr>
            <td class="header-item">
                <img src="../<%=content.OrderDetails[0].FImage%>" alt="">
                <span>
                    <%=content.OrderDetails[0].FName%>
                </span>
            </td>
            <td class="header-price item-price">
                <%=content.OrderDetails[0].SalePrice%>
            </td>
            <td class="header-count item-count">
                1
            </td>
        </tr>
    </script> --%>
</body>

</html>