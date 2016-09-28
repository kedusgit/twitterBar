
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>Navbar Template for Bootstrap</title>

<!-- Bootstrap core CSS -->
<link href="https://getbootstrap.com/dist/css/bootstrap.min.css"
	rel="stylesheet">


<!-- Custom styles for this template -->
<link href="resources/styles/wap.css" rel="stylesheet">




</head>

<body>

	<div class="container">

		<div class="row">

			<!-- Static navbar -->
			<nav class="navbar navbar-default">
				<div class="container-fluid">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed"
							data-toggle="collapse" data-target="#navbar"
							aria-expanded="false" aria-controls="navbar">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="#">Project name</a>
					</div>
					<div id="navbar" class="navbar-collapse collapse">
						<ul class="nav navbar-nav">
							<li class="active"><a href="#">Home</a></li>
							<li><a href="#">About</a></li>
							<li><a href="#">Contact</a></li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown" role="button" aria-haspopup="true"
								aria-expanded="false">Categories <span class="caret"></span>
								</a>
								<ul class="dropdown-menu">
									<li><a href="#">Romance</a></li>
									<li><a href="#">Comedy</a></li>
									<li><a href="#">SCI-Fiction</a></li>
									<li><a href="#">Sitcoms</a></li>
								</ul></li>
						</ul>
						<ul class="nav navbar-nav navbar-right">
							<li class="active"><a href="./">Default <span
									class="sr-only">(current)</span></a></li>
							<li><a href="../navbar-static-top/">Static top</a></li>
							<li><a href="../navbar-fixed-top/">Fixed top</a></li>
						</ul>
					</div>
					<!--/.nav-collapse -->
				</div>
				<!--/.container-fluid -->
			</nav>

			<!-- Main component for a primary marketing message or call to action -->
			<div class="jumbotron">
				<h1>Navbar example</h1>
				<p>This example is a quick exercise to illustrate how the
					default, static navbar and fixed to top navbar work. It includes
					the responsive CSS and HTML, so it also adapts to your viewport and
					device.</p>
				<p>
					<a class="btn btn-lg btn-primary" href="../../components/#navbar"
						role="button">View navbar docs &raquo;</a>
				</p>
			</div>

		</div>

		<div class="row">

			<div class="col-xs-12 col-md-3">
				<div class="twit">Here the content of the twit</div>

			</div>

			<div class="col-xs-12 col-md-3">
				<div class="twit">Here the content of the twit</div>
			</div>

			<div class="col-xs-12 col-md-3">
				<div class="twit">Here the content of the twit</div>
			</div>

			<div class="col-xs-12 col-md-3">
				<div class="twit">Here the content of the twit</div>
			</div>

		</div>

	</div>
	<!-- /container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script>
		window.jQuery
				|| document
						.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')
	</script>

	<script src="https://getbootstrap.com/dist/js/bootstrap.min.js"></script>

	<script src="resources/scripts/twiter.js"></script>

</body>
</html>
