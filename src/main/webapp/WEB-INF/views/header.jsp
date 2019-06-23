<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Header</title>
</head>
<body>
<div class="header-container"> 
 <div class="site-name">Rent Movies</div>
 <div class = "header-bar">
 <c:if test="${pageContext.request.userPrincipal.name != null}"> Hello
 
  </c:if>
 <c:if test="${pageContext.request.userPrincipal.name == null}">
 <a href="${pageContext.request.contextPath}/login">Login</a>
 </c:if>
 
 </div>
 </div>

</body>
</html>