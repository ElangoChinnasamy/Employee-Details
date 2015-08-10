<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="myLogin">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index Page</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<script src="Angularjs/angular.min.js"></script>
<script src="Angularjs/angular-route.min.js"></script>
</head>
<body>

<div>
<ng-view></ng-view>
</div>
<script type="text/javascript" src="LoginController.js"></script>
<script type="text/javascript" src="RegisterController.js"></script>

<script type="text/javascript" src="main.js"></script>

</body>
</html>