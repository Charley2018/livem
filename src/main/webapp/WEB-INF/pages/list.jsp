<%--
  Created by IntelliJ IDEA.
  User: Charles Chan
  Date: 2019/11/18
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h3>查询了所有账户信息</h3>

<c:forEach items="${list}" var="account">
  ${account.username}
</c:forEach>
</body>
</html>
