<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Spring 실습</title>
</head>
<body>

<h1>hihihihi</h1>


<form action="/seoul/restroom" method="GET">
    <input type="text" name="searchWord" placeholder="검색어"/>
    <input type="submit" value="검색">
</form>


</body>
</html>
