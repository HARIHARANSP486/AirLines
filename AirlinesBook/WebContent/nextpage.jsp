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
	background-image: url("Airline-Header.jpg");
	background-repeat: no-repeat;
	height: 600px;
	background-position: center;
	background-size: cover;
	position: relative;
	font-size: 19px;
}

.hero-content {
	text-align: center;
	position: absolute;
	top: 2%;
	left: 96%;
	transform: translate(-50%, -50%);
	color: green;
}
.hero-back{
	txt-align: center;
	position:absolute;
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

.hero-con {
	text-align: center;
	position: absolute;
	top: 160%;
	left: 60%;
	transform: translate(-50%, -50%);
	color: green;
	size: 30px;
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
			<b>&nbsp;&nbsp;It is the largest airline in India by
				fleet size and
				destinations!!&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
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
			Flights</a> <a class="active" href="singletrip.jsp">New ticket
			Booking</a>
		<!-- <div class="topnav-right"> -->
		<a class="active-non" href="ticketstatus.jsp">Ticket Status</a> <a
			class="active-non" href="cancelticket.jsp">Cancel Ticket</a> <a
			class="active-non" href="support.jsp">Support Details</a>
		<!-- </div> -->
	</div>
	<center>
		<h3>
			<b>Enter the Flight Id to Continue Ticket Booking</b>
		</h3>
	</center>
	<form method="post" action="FlightIdServlet">
		<div class="hero-context">
			<table>
				<tbody>
					<tr align="center">
						<td style="color: black"><b>FlightId:</b></td>
						<td><input type="number" name="flightId" required></td>
						<td><button type="submit" class="btn btn-info"
								style="width: 120px">
								<b>SUBMIT</b>
							</button> <br></td>
						<!-- <td><button type="submit" style="width: 100px">
							<b>SUBMIT</b>
						</button> <br></td> -->
						<!-- <div class="hero-con">
							<button type="submit" class="btn btn-info" role="button">submit</button>
						</div>
 -->
					</tr>
				</tbody>
			</table>
		</div>
		<div class="hero-content">
			<a href="index.jsp" class="btn btn-info" role="button">LOGOUT</a>
		</div>
		<div class="hero-back">
			<a href="listflights.jsp" class="btn btn-info" role="button">BACK</a>
		</div>
	</form>
</body>
</html>