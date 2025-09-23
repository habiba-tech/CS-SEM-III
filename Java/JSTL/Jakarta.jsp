<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>JSTL Jakarta Demo</title>
</head>
<body>

<h2><c:out value="Hello, Jakarta JSTL!" /></h2>

<c:set var="count" value="5" />

<c:if test="${count > 3}">
    <p>Count is greater than 3!</p>
</c:if>

<ul>
    <c:forEach var="i" begin="1" end="${count}">
        <li>Item ${i}</li>
    </c:forEach>
</ul>

</body>
</html>
