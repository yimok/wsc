<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit</title>
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

<c:forEach var="row" items="${restRoom}">
    ${row.FNAME}, ${row.XWGS84} , ${row.YWGS84} <br/><br/>
</c:forEach>



<!--
    "P_IDX",
    "P_PARK",
    "P_LIST_CONTENT",
    "P_ADDR",
    "P_ZONE",
    "P_DIVISION",
    "P_IMG",
    "P_ADMINTEL",
    "LONGITUDE",
    "LATITUDE",
    "G_LONGITUDE",
    "G_LATITUDE"
-->
<c:forEach var="row" items="${park}">
    ${row.PPARK}, ${row.LONGITUDE} , ${row.LATITUDE} <br/><br/>
</c:forEach>



</body>
</html>