<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Course</title>
</head>
<body>
<fieldset>
<legend>AddCourse</legend>

<form:form action="course" method="post" modelAttribute="course">

  <label>Course Name:</label><form:input path="coursename"/>
  <br>
    <label>Duration:</label><form:input path="duration"/>
    <br>
  <label>Fee:</label><form:input path="Fee"/>
  <br>
 <input type="submit" value="Add Course">
</form:form>
</fieldset>
</body>
</html>