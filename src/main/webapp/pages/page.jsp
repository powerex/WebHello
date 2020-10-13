<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        @import "../style/main.css" screen;
    </style>
</head>
<body>
<h2>Page in pages</h2>
<%@page import="logic.BusinessLogic" %>
<%
    BusinessLogic bl = new BusinessLogic();
    out.println("<div><b>" + bl.getInfo() + "</b></div>");
%>

<%

    for (int i = 0; i < 10; i++) {
        out.println("<p>Number from loop: " + i + "</p>");
    }

%>


</body>
</html>
