<!-- logout.jsp -->
<html>
<head>
<title>Logout Page</title>
</head>
<body>
    <%
        session.removeAttribute("username");
    %>

    You have successfully logged out

</body>
</html>