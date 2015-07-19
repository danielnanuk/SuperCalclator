<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
<meta charset="UTF-8">
<title>Super Calculator</title>
</head>

<body>

<h1>Super Calculator</h1>

<form:form method="POST" action="" modelAttribute="calculateForm">
  <form:input path="firstNumber" />
  <button type="submit">calculate</button>
  <p>This is the result: <div id="result">${result}</div></p>
</form:form>

</body>
</html>
