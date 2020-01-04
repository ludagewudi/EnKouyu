<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-12-26
  Time: 0:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${a}" var="w" varStatus="d">
    <p>
        ${w.id}
        A：${w.a.asentence}A翻译:${w.a.tran}
        B:${w.b.bsentence}B翻译:${w.b.tran}
        标题:${w.title.name}
        类型:${w.title.topicid.topicname}
    </p>
</c:forEach>
</body>
</html>
