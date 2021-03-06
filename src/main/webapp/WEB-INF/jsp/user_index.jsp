<%@ page import="com.se325.controller.*"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="">
	<link rel="shortcut icon" href="../../assets/ico/favicon.png">

	<title>drs &middot; Dota Replay Statistics</title>

	<!-- Bootstrap core CSS -->
	<link href="../dist/css/bootstrap.css" rel="stylesheet">

	<!-- Custom styles for this template -->
	<link href="jumbotron.css" rel="stylesheet">

	<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
  	<!--[if lt IE 9]>
		<script src="assets/js/html5shiv.js"></script>
		<script src="assets/js/respond.min.js"></script>
		<![endif]-->
	</head>

	<body>

		<div class="navbar navbar-inverse navbar-fixed-top">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a href="/user/home"><img class="bannerLogo" src="../img/smallLogo.png"></a>
				</div>

				<div class="navbar-collapse collapse">
					<ul class="nav navbar-nav">						
						<li><a href="/user/home">Home</a></li>
						<li class="active"><a href="#">Generate Stats</a></li>
					</ul>
					<form class="navbar-form navbar-right" style="margin-top:20px;">						
						<a name="logout()" href="/logout" style="color:white;">Logout(${username})</a>
					</form>
				</div><!--/.navbar-collapse -->
			</div>
		</div>

		<div class="jumbotron">
			<div class="container marketing" style="margin-top:50px;text-align:center;">
				<form class="form-signin" action="/user/stats?replayId=${replayId}">
					<h2 class="form-signin-heading">Please enter a replay number</h2>
					<input name="replayId" type="text" class="form-control" placeholder="e.g. 15612354" autofocus>
				</form>
			</div>
		</div>

		<div class="container">
			<hr>
			<footer>
				<p>&copy; EJK 2013</p>
			</footer>
		</div> <!-- /container -->

		<!-- Bootstrap core JavaScript
		================================================== -->
		<!-- Placed at the end of the document so the pages load faster -->
		<script src="../assets/js/jquery.js"></script>
		<script src="../dist/js/bootstrap.min.js"></script>
	</body>
</html>
