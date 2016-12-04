<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Toilet</title>
</head>
<body>
<h2>다음 책 검색 결과: 질의어 - ${searchWord}</h2>


<!--
    "POI_ID",
    "FNAME",
    "ANAME",
    "CNAME",
    "CENTER_X1",
    "CENTER_Y1",
    "X_WGS84",
    "Y_WGS84",
    "INSERTDATE",
    "UPDATEDATE"
-->
<!-- items 리스트를 이용해 foreach 를 이용하 정보를 가져옴 -->

${restRoom.searchPublicToiletPOIService.listTotalCount}</br>




<c:forEach var="row" items="${restRoom.searchPublicToiletPOIService.row}">
    ${row} <br/><br/>
</c:forEach>


</body>
</html>