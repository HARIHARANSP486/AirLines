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
	left: 18%;
}

body {
	/* background-image: url("profile.bmp"); */
	background-repeat: no-repeat;
	height: 600px;
	background-position: center;
	background-size: cover;
	position: relative;
	font-size: 14px;
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
		</a> <a class="active-non" href="flightsearch.jsp">Available Flights</a> <a
			class="active" href="singletrip.jsp">New ticket Booking</a> <a
			class="active-non" href="ticketstatus.jsp">Ticket Status</a> <a
			class="active-non" href="cancelticket.jsp">Cancel Ticket</a> <a
			class="active-non" href="support.jsp">Support Details</a>
	</div>
	<form method="post" action="FlightIdServlet">
		<h3>List of flights :</h3>
		<table>
			<thead>
				<tr>
					<th
						style="border: 6px solid #dddddd; text-align: left; padding: 12px;">FlightID</th>
					<th
						style="border: 6px solid #dddddd; text-align: left; padding: 12px;">Flight
						Name</th>
					<th
						style="border: 6px solid #dddddd; text-align: left; padding: 12px;">Source</th>
					<th
						style="border: 6px solid #dddddd; text-align: left; padding: 12px;">Destination</th>
					<th
						style="border: 6px solid #dddddd; text-align: left; padding: 12px;">Date
						Of Journey</th>
					<th
						style="border: 6px solid #dddddd; text-align: left; padding: 12px;">Departure
						Time</th>
					<th
						style="border: 6px solid #dddddd; text-align: left; padding: 12px;">Arrival
						Time</th>
					<th
						style="border: 6px solid #dddddd; text-align: left; padding: 12px;">Available
						Ticket</th>
					<th
						style="border: 6px solid #dddddd; text-align: left; padding: 12px;">Adult
						Ticket Rate</th>
					<th
						style="border: 6px solid #dddddd; text-align: left; padding: 12px;">Children
						Ticket Rate</th>
					<th
						style="border: 6px solid #dddddd; text-align: left; padding: 12px;">Baby
						Ticket Rate</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="FLIGHTSLIST" items="${FLIGHTS}">
					<tr>
						<td
							style="border: 2px solid #dddddd; text-align: left; padding: 10px;">${FLIGHTSLIST.flightId}</td>
						<td
							style="border: 2px solid #dddddd; text-align: left; padding: 10px;">${FLIGHTSLIST.flightName}</td>
						<td
							style="border: 2px solid #dddddd; text-align: left; padding: 10px;">${FLIGHTSLIST.source}</td>
						<td
							style="border: 2px solid #dddddd; text-align: left; padding: 10px;">${FLIGHTSLIST.destination}</td>
						<td
							style="border: 2px solid #dddddd; text-align: left; padding: 10px;">${FLIGHTSLIST.dateOfJourney}</td>
						<td
							style="border: 2px solid #dddddd; text-align: left; padding: 10px;">${FLIGHTSLIST.departureTime}</td>
						<td
							style="border: 2px solid #dddddd; text-align: left; padding: 10px;">${FLIGHTSLIST.arrivalTime}</td>
						<td
							style="border: 2px solid #dddddd; text-align: left; padding: 10px;">${FLIGHTSLIST.avaliableTicket}</td>
						<td
							style="border: 2px solid #dddddd; text-align: left; padding: 10px;">${FLIGHTSLIST.adultTicketRate}</td>
						<td
							style="border: 2px solid #dddddd; text-align: left; padding: 10px;">${FLIGHTSLIST.childTicketRate}</td>
						<td
							style="border: 2px solid #dddddd; text-align: left; padding: 10px;">${FLIGHTSLIST.babyTicketRate}</td>
						<td><button type="submit" style="width: 60px"
								class="btn btn-info" role="button"
								value="${FLIGHTSLIST.flightId}" name="flightnumber">SELECT</button>
							</a>
					</tr>
					<tr>
						<td></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="hero-content">
			<a href="index.jsp" class="btn btn-info" role="button">LOGOUT</a>
		</div>
		<div class="hero-back">
			<a href="flightsearch.jsp" class="btn btn-info" role="button">BACK</a>
		</div>
		<br> <br> <br> <br> <br> <br> <br>
		<br>
	</form>
</body>
</html>