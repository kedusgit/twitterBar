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
<link rel="stylesheet" href="/twitter/resources/styles/style.css" type="text/css" />

<script src="ajax.js"></script>
<!--CSS LINK -->
<link rel="stylesheet" type="text/css" href="/theme.css">


</head>
<body>
	<h3>Twitter Bar dynamic web project</h3>
	<nav class="navbar navbar-default">
	<div class="container col-lg-12 col-md-8 col-sm-4 col-xs-3">

		<div class="row">
			<ul class="nav navbar-nav navbar-left">
			
				<li class="active" ><a
					href="<c:url value='/categoryController?categoryName=romance'/>">Romance
				</a></li>
				<li class="active"><a
					href="<c:url value='/categoryController?categoryName=sciFiction'/>">Sci Fiction
				</a></li>
				<li class="active"><a
					href="<c:url value='/categoryController?categoryName=commedy'/>">Comedy
				</a></li>
				<li class="active"><a
					href="<c:url value='/categoryController?categoryName=sitCom'/>">SitCom
				</a></li>
			</ul>


			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="#">trending</a></li>
			</ul>
        <span><ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="/twitter/staticpages/googlemap.html">GoogleMap</a></li>
			</ul></span>

		</div>
	</div>

	</nav>
    <div class ="outer">
	<div class="container col-lg-12 col-md-8 col-sm-4 col-xs-3">
		<div class="row">

			<c:forEach items="${categoryItems}" var="categoryItem">
				<div class="categoryItem col-sm-3">
					<a href="<c:url value='${categoryItem.itemURL}'/>"><img
						src="<c:url value='${categoryItem.itemImageSrc}' />" alt="item image" /> <span>${categoryItem.itemDescription}</span>
					</a>
				</div>
			</c:forEach>
		</div>
	</div>
	</div>
	
</body>
</html>