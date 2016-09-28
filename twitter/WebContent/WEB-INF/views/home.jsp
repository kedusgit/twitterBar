
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
						<a class="navbar-brand" href="#">WAP Project - Pink Group</a>
					</div>
					<div id="navbar" class="navbar-collapse collapse">
						<ul class="nav navbar-nav">
							<li data-category="romance" class="menu-item"><a href="#">Romance</a></li>
							<li data-category="comedy" class="menu-item"><a href="#">Comedy</a></li>
							<li data-category="sci" class="menu-item"><a href="#">SCI-Fiction</a></li>
							<li data-category="sitcoms" class="menu-item"><a href="#">Sitcoms</a></li>
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

		</div>

		<div id="twits-container" class="row"></div>


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
