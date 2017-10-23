<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title><sitemesh:write property="title" /></title>
<link rel="stylesheet" href="/webjars/bootstrap/3.3.7/css/bootstrap.css">
<link rel="stylesheet" href="/webjars/animate.css/3.5.2/animate.css">
<c:if test="${false}">
	<link rel="stylesheet" href="../css/bootstrap.css">
	<link rel="stylesheet" href="../css/animate.css">
</c:if>
<sitemesh:write property="head" />
</head>
<body>
	<nav class="navbar navbar-inverse">
		<!-- Title -->
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">통계</a>
	    	</div>
	    	<!-- Nav bar list -->
			<ul class="nav navbar-nav">
				<li><a href="#">Home</a></li>
				<li class="active"><a href="/board/list">자유게시판</a></li>
				<li><a href="#">포인트상점</a></li>
				<li><a href="#">출석체크</a></li>
				<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">통계분석<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">항공</a></li>
						<li><a href="#">페이스북</a></li>
						<li><a href="#">Page 1-3</a></li>
					</ul>
				</li>
		    </ul>
			<!-- Sign Up & Login -->
			<ul class="nav navbar-nav navbar-right">
				<li><a href="/login/join"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a>
					<ul id="login-dp" class="dropdown-menu animated fadeInDown">
						<li>
							<div class="row">
								<div class="col-md-12">
									<form role="form" method="post" action="login" accept-charset="UTF-8" id="login-nav">
										<div class="form-group">
											<label class="sr-only" for="exampleInputEmail2">Email address</label>
											<input type="email" class="form-control" id="exampleInputEmail2" placeholder="Email address" required>
										</div>
										<div class="form-group">
											<label class="sr-only" for="exampleInputPassword2">Password</label>
											<input type="password" class="form-control" id="exampleInputPassword2" placeholder="Password" required>
											<div class="help-block text-right"><a href="">Forget the password ?</a></div>
										</div>
										<div class="form-group">
											 <button type="submit" class="btn btn-primary btn-block">Sign in</button>
										</div>
										<div class="checkbox">
											 <label>
											 <input type="checkbox"> keep me logged-in
											 </label>
										</div>
										<div class="social-buttons">
											<a href="#" class="btn btn-facebook"><!-- <i class="fa fa-facebook"></i> --> Facebook</a>
											<a href="#" class="btn btn-twitter"><!-- <i class="fa fa-twitter"></i> --> Twitter</a>
										</div>
									 </form>
								</div>
								<div class="bottom text-center">
									New here ? <a href="/login/join"><b>Join Us</b></a>
								</div>
							</div>
						</li>
					</ul>
				</li>
			</ul>
		    <!-- Search Form -->
			<form class="navbar-form navbar-right" role="search">
				<div class="form-group input-group">
					<input type="text" class="form-control" placeholder="Search..">
					<span class="input-group-btn">
						<button class="btn btn-default" type="button">
							<span class="glyphicon glyphicon-search"></span>
						</button>
					</span>        
				</div>
			</form>
		</div>
	</nav>
<sitemesh:write property="body" />
</body>
</html>