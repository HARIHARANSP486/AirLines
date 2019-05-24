<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<style>
body {
	font-family: Times New Roman, Helvetica, sans-serif;
}

.display .display {
	position: absolute;
	top: 10%;
	left: 22%;
}

body {
	background-image: url("flgphoto.jpg");
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

.hero-back {
	txt-align: center;
	position: absolute;
	top: 2%;
	left: 90%;
	transform: translate(-50%, -50%);
	color: green;
}

.hero-context {
	text-align: center;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	color: green;
}

.hero-table {
	text-align: center;
	position: absolute;
	top: 37%;
	left: 15%;
	transform: translate(-50%, -50%);
	color: green;
}

.hero-con {
	text-align: center;
	position: absolute;
	top: 160%;
	left: 60%;
	transform: translate(-50%, -50%);
	color: green;
	size: 30px;
}

.hero-list {
	text-align: center;
	position: absolute;
	top: 20%;
	left: 10%;
	transform: translate(-50%, -50%);
	color: blue;
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
<body>
	<div class="hero-page">
		<h4>
			<b>&nbsp;&nbsp;It is the largest airline in India by fleet size
				and destinations!!&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Customer
				Service:080 4666 2222
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				Contact: airlineservice@airlines.com</b>
		</h4>
	</div>
	<div class="topnav">
		<a class="active-non" href="menupage.jsp">Home <span
			class="sr-only">(current)</span>
		</a> <a class="active-non" href="flightsearch.jsp">Available
			Flights</a> <a class="active-non" href="singletrip.jsp">New ticket
			Booking</a>
		<!-- <div class="topnav-right"> -->
		<a class="active" href="ticketstatus.jsp">Ticket Status</a> <a
			class="active-non" href="cancelticket.jsp">Cancel Ticket</a> <a
			class="active-non" href="support.jsp">Support Details</a>
		<!-- </div> -->
	</div>
	
		<div class="hero-list">
			<h2>
				<b>Passengers Details:</b>
			</h2>
		</div>
		<!-- <div class="hero-table"> -->
		<br> <br> <br>
		<table>
			<thead>
				<tr>
					<!-- <th
						style="border: 8px solid #eeeeee; text-align: center; padding: 12px;">FLG
						ID</th> -->
					<th
						style="border: 8px solid #eeeeee; text-align: center; padding: 12px;">FLG
						NAME</th>
					<th
						style="border: 8px solid #eeeeee; text-align: center; padding: 12px;">FLG
						SOURCE</th>
					<th
						style="border: 8px solid #eeeeee; text-align: center; padding: 12px;">FLG
						DESTINATION</th>
					<th
						style="border: 8px solid #eeeeee; text-align: center; padding: 12px;">FLG
						JOURNEY DATE</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="booking" items="${LIST}">
					<tr>
						<%-- 	<td
							style="border: 6px solid #dddddd; text-align: left; padding: 8px;">${booking.flightId}</td> --%>
						<td
							style="border: 6px solid #dddddd; text-align: left; padding: 8px;">${booking.flightName}</td>
						<td
							style="border: 6px solid #dddddd; text-align: left; padding: 8px;">${booking.source}</td>
						<td
							style="border: 6px solid #dddddd; text-align: left; padding: 8px;">${booking.destination}</td>
						<td
							style="border: 6px solid #dddddd; text-align: left; padding: 8px;">${booking.dateOfJourney}</td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
		<form method="post" action="StatusPassengerServlet">
		<table>
			<tbody>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<button type="submit" class="btn btn-info" style="width: 400px">IN
							NEXT PAGE YOU WILL GET THE PASSENGERS DETAILS</button> <br>
					</td>
				</tr>
			</tbody>
		</table>
		<!-- </div> -->
		<div class="hero-content">
			<a href="index.jsp" class="btn btn-info" role="button">LOGOUT</a>
		</div>
		<div class="hero-back">
			<a href="ticketstatus.jsp" class="btn btn-info" role="button">BACK</a>
		</div>
		<!-- <table>
		<tbody>
			<a class="active" href="menupage.jsp">homepage</a>
		</tbody>
	</table> -->
	</form>
</body>
</html>