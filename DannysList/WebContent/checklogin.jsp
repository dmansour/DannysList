<!-- checklogin.jsp -->
<html>
<head>
<title>Login Check</title>
</head>
<body>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if(!password.equals("123")) {
        %> Error: incorrect password <%
    } else if(username.length() == 0) {
        %> Error: no username <%
    } else {
        session.setAttribute("username", username);
     %> <jsp:forward page="index.jsp" /> <%
    }

%>


</body>
</html>