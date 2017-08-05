<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First JSP Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h1 class="jumbotron">First JSP Page</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<form role="form" method="get" action="/first-web-application/submit.do">
					<div class="form-group">
						<label for="userName">Enter Name</label>
						<input type="text" class="form-control" placeholder="Enter your name" />
					</div>
					<button type="submit" class="btn btn-large">Submit</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>