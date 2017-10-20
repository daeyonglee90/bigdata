<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>글쓰기</title>
<c:if test="${false}">
	<link rel="stylesheet" href="../../css/bootstrap.css">
	<link rel="stylesheet" href="../../css/animate.css">
</c:if>
</head>
<body>
	<div class="container well">
		<h1>나는 등록하는 페이지다</h1>
		<form action="">
			<div class="form-group">
				<label>제목</label>
				<input class="form-control" type="text">
			</div>
			<div class="form-group">
				<label>내용</label>
				<textarea class="form-control" rows="10"></textarea>
			</div>
		</form>
	</div>

</body>
</html>