<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="include.jsp" %>
<h3>Printing from 1 to 10</h3>
	 <c:forEach var="i" begin="1" end="10">
	 ${i}
	 </c:forEach>
</body>
</html>