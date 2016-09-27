<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="/resource/styles/style.css" type = "text/css" />
<!-- <script>
	$(function() {
		alert("From javascript");
		console.log("From javascript");
	});
</script> -->
<script src="ajax.js"></script>
<!--CSS LINK -->
<link rel="stylesheet" type="text/css" href="/theme.css">


</head>
<body>
	<h3>Twitter Bar dynamic web project</h3>
	<nav class="navbar navbar-default">
	<div class="container col-lg-12 col-md-8 col-sm-4 col-xs-3">

		<div class="row">

			<c:forEach items="${categoryItems}" var="categoryItem">
				<div class="categoryItem col-sm-3">
					<a href="<c:url value='${categoryItem.itemURL}'/>" ><img
						src="<c:url value='${categoryItem.itemImageSrc}'/>" /> <span>${categoryItem.itemDescription}</span> </a>
				</div>
			</c:forEach>

			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="#">trending</a></li>
			</ul>


		</div>
	</div>

	</nav>

	<div class="container col-lg-12 col-md-8 col-sm-4 col-xs-3">
		<div class="row">

			<div class="image1 col-sm-3">
				<div id="imagelocation">
					<!-- <img src="1.jpg" alt="2.jpg"> -->
				</div>
			</div>
			<div class="image2 col-sm-3">
				<div>Image2</div>
			</div>
			<div class="image3 col-sm-3">
				<div>Image3</div>
			</div>
			<div class="image4 col-sm-3">
				<div>Image4</div>
			</div>
		</div>
	</div>
</body>
</html>