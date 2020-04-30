<%--
  Created by IntelliJ IDEA.
  User: mansoura
  Date: 30/04/2020
  Time: 13:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        <!-- first and last name-->
        <p>First name: <form:input path="firstName"/></p>
        <p>Last name: <form:input path="lastName"/></p>

        <!-- country of origin; dropdown list-->
        <p>
            Country:
            <form:select path="country" items="${countryOptions}"/>
        </p>

        <!-- favorite coding language; radio button -->
        <p>
            Favorite Language:
            <form:radiobuttons path="favoriteCodingLanguage" items="${favoriteCodingLanguages}" />
        </p>

        <!-- operating system choises; check boxes -->
        <p>
            Operating System:
            <form:checkboxes path="operatingSystems" items="${operatingSystems}" />
        </p>

        <!-- submit form -->
        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
