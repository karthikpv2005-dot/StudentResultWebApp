<%@ page import="java.sql.*, db.DBConnection" %>
<link rel="stylesheet" href="style.css">
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>

<div class="header">RESULT ANALYTICS</div>

<div class="navbar">
  <a href="dashboard.jsp">Dashboard</a>
  <a href="index.jsp">Add Result</a>
  <a href="view.jsp">View Records</a>
</div>

<div class="container">
<div class="page-title">Pass vs Fail Summary</div>

<canvas id="pf" height="150"></canvas>
</div>

<%
Connection con = DBConnection.getConnection();
Statement st = con.createStatement();

ResultSet pass = st.executeQuery("SELECT COUNT(*) FROM students WHERE grade <> 'Fail'");
pass.next();
int passCount = pass.getInt(1);

ResultSet fail = st.executeQuery("SELECT COUNT(*) FROM students WHERE grade = 'Fail'");
fail.next();
int failCount = fail.getInt(1);

con.close();
%>

<script>
new Chart(document.getElementById("pf"),{
 type:"pie",
 data:{
   labels:["Pass","Fail"],
   datasets:[{
     data:[<%=passCount%>,<%=failCount%>]
   }]
 }
});
</script>
