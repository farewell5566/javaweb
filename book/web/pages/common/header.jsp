<%--
  Created by IntelliJ IDEA.
  User: Mloong
  Date: 2020/11/17
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<% String path = request.getScheme()
        + "://"
        + request.getServerName()
        + ":"
        +request.getServerPort()
/*        +"/"*/
        + request.getContextPath()
        +"/"; %>

<base href="<%=path%>">
<link type="text/css" rel="stylesheet" href="static/css/style.css" >
<script type="text/javascript" src="static/javascript/jquery-1.7.2.js"></script>
<%--<%= path%>--%>
