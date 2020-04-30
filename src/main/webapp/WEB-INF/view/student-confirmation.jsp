<%--
  Created by IntelliJ IDEA.
  User: mansoura
  Date: 30/04/2020
  Time: 13:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>
    <p>Student info:</p>
    <p>
        ${student.firstName} ${student.lastName} from ${student.country}
    </p>

    <p>Favorite Coding Language:</p>
    <p>
        ${student.favoriteCodingLanguage}
    </p>

    <p>Preferred Operating System:</p>
    <p>
        <ul>
            <c:forEach var="os" items="${student.operatingSystems}">
                <li>${os}</li>
            </c:forEach>
        </ul>
    </p>
</body>
</html>
