<link rel="stylesheet" href="style.css">

<div class="header">COLLEGE RESULT PORTAL</div>

<div class="navbar">
  <a href="dashboard.jsp">Dashboard</a>
  <a href="view.jsp">View Records</a>
  <a href="analytics.jsp">Analytics</a>
</div>

<div class="container">
<div class="page-title">Add Student Marks</div>

<form action="addStudent" method="post">

<label>Student Name</label>
<input name="name" required>

<label>Subject 1</label>
<input name="m1" type="number" required>

<label>Subject 2</label>
<input name="m2" type="number" required>

<label>Subject 3</label>
<input name="m3" type="number" required>

<label>Subject 4</label>
<input name="m4" type="number" required>

<button type="submit">Save Result</button>
</form>
</div>
