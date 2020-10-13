<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>

        <%
            java.util.Date now = new java.util.Date();
            String date = "Today is: " + now;
        %>

        <%= date %>

<p>
    <%
        out.println("String");
    %>
</p>

</p>
</body>
</html>
