<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>자유게시판</title>
<c:if test="${false}">
	<link rel="stylesheet" href="../../css/bootstrap.css">
	<link rel="stylesheet" href="../../css/animate.css">
</c:if>
<style type="text/css">
.best {
  padding: 10px 15px;
  margin: 10px;
  border-bottom: 1px solid transparent;
  border-top-left-radius: 3px;
  border: 2px solid #ff9900;

}
</style>
</head>
<body>
	<div class="container" >
		<div class="panel">
			<div class="best">
				<h1>조회가 많은 글</h1>
				<table class="table table-condensed">
					<tr>
						<td>테스트1</td>
						<td>테스트1</td>
						<td>테스트1</td>
					</tr>
					<tr>
						<td>테스트2</td>
						<td>테스트2</td>
						<td>테스트2</td>
					</tr>
					<tr>
						<td>테스트3</td>
						<td>테스트3</td>
						<td>테스트3</td>
					</tr>
				</table>	
			</div>
			
			<div class="panel-body pull-right">
				<h3><a class="label label-primary" href="/board/register">글쓰기</a></h3>
			</div>
			<div class="panel-body">
				<table class="table table-striped table-bordered">
					<thead>
						<tr>
							<th>t1</th><th>t2</th><th>t3</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>테스트1</td>
							<td>테스트1</td>
							<td>테스트1</td>
						</tr>
						<tr>
							<td>테스트2</td>
							<td>테스트2</td>
							<td>테스트2</td>
						</tr>
						<tr>
							<td>테스트3</td>
							<td>테스트3</td>
							<td>테스트3</td>
						</tr>
						<tr>
							<td>테스트4</td>
							<td>테스트4</td>
							<td>테스트4</td>
						</tr>
						<tr>
							<td>테스트5</td>
							<td>테스트5</td>
							<td>테스트5</td>
						</tr>
						<tr>
							<td>테스트6</td>
							<td>테스트6</td>
							<td>테스트6</td>
						</tr>
						<tr>
							<td>테스트7</td>
							<td>테스트7</td>
							<td>테스트7</td>
						</tr>
						<tr>
							<td>테스트8</td>
							<td>테스트8</td>
							<td>테스트8</td>
						</tr>
						<tr>
							<td>테스트9</td>
							<td>테스트9</td>
							<td>테스트9</td>
						</tr>
						<tr>
							<td>테스트10</td>
							<td>테스트10</td>
							<td>테스트10</td>
						</tr>
					</tbody>
				</table>
				<div style="float: right;">
					<nav>
						<ul class="pagination">
							<li><a href="#">Previous</a></li>
							<li class="active"><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">5</a></li>
							<li><a href="#">Next</a></li>
						</ul>
					</nav>
					<div>
							<select id='searchType'>
								<option>제목+내용</option>
								<option>제목만</option>
								<option>작성자</option>
								<option>코멘트내용</option>
								<option>코멘트작성자</option>
							</select>
							<input type='text' id='searchKeyword' value="${pageVO.keyword}">
							<button id='searchBtn'>Search</button> 
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<footer class="container-fluid" style="text-align: center;">
  		<p>Copyright 2017-2018 daeyonglee. All rights reserved</p>
	</footer>
</body>
</html>