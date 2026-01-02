<link rel="stylesheet" href="style.css">

<%
session.invalidate();
response.sendRedirect("login.jsp");
%>
