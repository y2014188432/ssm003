<%--
  Created by IntelliJ IDEA.
  User: Y2014188432
  Date: 2021/1/15
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${list}" var="user">
    ${user.id}----${user.password}----${user.username}<br/>
</c:forEach>
</body>
</html>
