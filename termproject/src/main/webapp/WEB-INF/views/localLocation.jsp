<%--
  Created by IntelliJ IDEA.
  User: HYERIM
  Date: 2016-12-04
  Time: 오전 1:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>검색 결과: ${searchWord}</h2>

${local.searchPublicToiletPOIService.listTotalCount}</br>

<c:forEach var="row" items="${local.searchPublicToiletPOIService.row}">
    ${row} <br/><br/>
</c:forEach>

</body>
</html>
