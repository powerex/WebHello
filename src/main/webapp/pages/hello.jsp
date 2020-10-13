<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        @import "../style/main.css" screen;
    </style>
</head>
<body>
<%
    String name = request.getParameter("name");
    out.println("<h2> Hello, " + name + "</h2>");
    out.println("<p><a href=\"/list\">Go back to list</a></p>");
%>
</body>
</html>

<%-- IntellijIdea --%>
<%-- TomCat --%>
<%-- JDK --%>
kievoit