<%@ page import="java.sql.*, db.DBConnection" %>
<link rel="stylesheet" href="style.css">

<div class="header">STUDENT RECORDS</div>

<div class="navbar">
  <a href="dashboard.jsp">Dashboard</a>
  <a href="index.jsp">Add Result</a>
  <a href="analytics.jsp">Analytics</a>
</div>

<div class="container">
<div class="page-title">Student Details</div>

<table class="table">

<tr>
<th>ID</th>
<th>Name</th>
<th>M1</th>
<th>M2</th>
<th>M3</th>
<th>M4</th>
<th>Total</th>
<th>Grade</th>
</tr>

<%
Connection con = DBConnection.getConnection();
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("SELECT * FROM students");

while(rs.next()){
%>

<tr>
<td><%=rs.getInt("id")%></td>
<td><%=rs.getString("name")%></td>
<td><%=rs.getInt("m1")%></td>
<td><%=rs.getInt("m2")%></td>
<td><%=rs.getInt("m3")%></td>
<td><%=rs.getInt("m4")%></td>
<td><%=rs.getInt("total")%></td>
<td><%=rs.getString("grade")%></td>
</tr>

<%
}
con.close();
%>

</table>
</div>
