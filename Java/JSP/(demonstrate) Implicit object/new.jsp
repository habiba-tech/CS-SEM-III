<%@page language="java" contentType="text/html;charset=UTF-8" isELIgnored="false"%>
<%@page isErrorPage="true"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title> JSP Implicit Objects Demo</title>
    <link rel="stylesheet" href="new.css"
</head>
<body>
    <div class="container">
    <h2> JSP Implicit Objects Demo </h2>
    <!--Accessing request parameters -->
    <p>Your name: <span>${param.name} </span> </p>

    <!--Accessing session -->
    <%
    session.setAttribute("userRole","Admin");
    %>
    <p> Session User Role: <span>${sessionScope.userRole} </span> </p>

    <!--Accessing application context -->
    <%
    application.setAttribute("appName","Student Management System");
    %>

    <p> Application Name: <span> ${applicationScope.appName}</span> </p>

    <!--Using out object -->
    <%
    out.println("<p><span> This line is printed using 'out' implicit object </span></p>");
    %>

    <!--pageContent for accessing attributes -->
    <p> Server Info: <span> ${pageContent.servletContext.serverInfo} </span> </p>
    </div>
    </body>
    </html>
