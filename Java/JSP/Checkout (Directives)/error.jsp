<% page language="java"
contentType="text/html;charset=UTF-8"
isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error-Checkout</title>
<link rel="stylesheet"href="style.css">
</head>
</body>

<div class="container error-box">
<h2>Checkout Failed</h2>
<p><b>Error:<b><%=exception.getMessage()%></p>
<p>Please correct your inputs and try again</p>
<a href="checkout.jsp" class="btn"> Go Back to Checkout</a>
</div>
</body>
<html>

