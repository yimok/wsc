<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Spring 실습</title>
</head>
<body>



<form action="/seoul/park/info" method="GET">
   <input type="submit" value="ParkInfo">
</form>

<form action="/seoul/park/neareststation" method="GET">
    <input type="submit" value="NearestStation">
</form>


<form action="/seoul/park/nearest" method="GET">
    <input type="text" name="address" placeholder="주소를 입력하세요 (ex:노원구)"/>
    <input type="text" name="parkc" placeholder="출력할 공원수를 입력하세요"/>
    <input type="submit" value="NearestPark">
</form>

</body>
</html>
