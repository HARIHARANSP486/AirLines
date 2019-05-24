<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<style>
body {
	font-family: Times New Roman, Helvetica, sans-serif;
}

.display .display {
	position: absolute;
	top: 10%;
	left: 10%;
}

body {
	background-image: url("flightimage.jpg");
	background-repeat: no-repeat;
	height: 600px;
	background-position: center;
	background-size: cover;
	position: relative;
	font-size: 21px;
}

.hero-content {
	text-align: center;
	position: absolute;
	top: 2%;
	left: 96%;
	transform: translate(-50%, -50%);
	color: green;
}


.btn-default {
	background: #000;
	color: #fff;
}

.btn-default:hover {
	background: #fff;
	color: #000;
}

.topnav {
	overflow: hidden;
	background-color: #333;
}

.topnav a {
	float: left;
	color: #f2f2f2;
	text-align: center;
	padding: 15px 56.5px;
	text-decoration: none;
	font-size: 20px;
	background-color: grey;
}

.topnav a:hover {
	background-color: #ddd;
	color: black;
}

.topnav a.active {
	background-color: #4CAF50;
	color: white;
}

.topnav-right {
	float: right;
}

form {
	display: inline-block;
}

</style>
</head>
<body>
	<div class="hero-page">
		<h4>
			<b>&nbsp;&nbsp;&nbsp;&nbsp;It is the largest airline in India by fleet size and
				destinations!!&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				Customer Service:080 4666 2222
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				Contact: airlineservice@airlines.com</b>
		</h4>
	</div>
	<div class="topnav" >
		<a class="active" href="menupage.jsp">Home
		</a>
			 <a class="active-non" href="flightsearch.jsp">Available
			Flights</a> <a
			class="active-non" href="singletrip.jsp">New
			ticket Booking</a>
		<!-- <div class="topnav-right"> -->
		<a class="active-non" href="ticketstatus.jsp">Ticket
			Status</a> <a class="active-non" href="cancelticket.jsp">Cancel
			Ticket</a> <a class="active-non" href="support.jsp">Support Details</a>
	
		</div>
	<div class="hero-content">
		<a href="index.jsp" class="btn btn-info" role="button">LOGOUT</a>
	</div>
	<br>
	<h3><b>
	 Discount Flight and Airlines Ticket Best Price and Easy Online Booking. <br><br>
	 Easy Payment. 24 Hours Customer Service.<br><br>
	 Travel To Awesome Destinations. Book Online & Fly Now! Over 130 Destinations.</b> <br>
	 </h3> 
</body>
</body>
</html>
