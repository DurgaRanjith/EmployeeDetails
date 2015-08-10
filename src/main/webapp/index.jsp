<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="myCSS">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
 
      <div >
        <div ng-view></div>
      </div>
 
      <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.28/angular.min.js"></script>
      <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.28//angular-route.min.js"></script>
      <script type="text/javascript" src="main.js"></script>
      <script type="text/javascript" src="controllers/loginController.js"></script>
      <script type="text/javascript" src="controllers/displayMessageController.js"></script>
   <!--    <script type="text/javascript" src="services/storageService.js"></script> -->
    </body>
</html>