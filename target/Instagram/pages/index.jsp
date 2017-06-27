<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Aser
  Date: 20.03.2017
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World!</title>
</head>
<body>
    <p>Hello World!</p>
    <table border="1">
        <tr>
            <td>Name</td>
            <td>Actions</td>
        </tr>
        <c:forEach items="${persons}" var="p">
            <tr>
                <td><c:out value="${p.name}"/></td>
                <td><a href="/projects/edit/${p.id}">Edit</a>&nbsp;
                    <a href="/projects/delete/${p.id}">Delete</a></td>

            </tr>
        </c:forEach>
    </table>

</body>
</html>
