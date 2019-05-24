<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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
						style="border: 2px solid #dddddd; text-align: left; padding: 8px;">${FLIGHTSLIST.flightId}</td>
					<td
						style="border: 2px solid #dddddd; text-align: left; padding: 8px;">${FLIGHTSLIST.flightName}</td>
					<td
						style="border: 2px solid #dddddd; text-align: left; padding: 8px;">${FLIGHTSLIST.source}</td>
					<td
						style="border: 2px solid #dddddd; text-align: left; padding: 8px;">${FLIGHTSLIST.destination}</td>
					<td
						style="border: 2px solid #dddddd; text-align: left; padding: 8px;">${FLIGHTSLIST.dateOfJourney}</td>
					<td
						style="border: 2px solid #dddddd; text-align: left; padding: 8px;">${FLIGHTSLIST.departureTime}</td>
					<td
						style="border: 2px solid #dddddd; text-align: left; padding: 8px;">${FLIGHTSLIST.arrivalTime}</td>
					<td
						style="border: 2px solid #dddddd; text-align: left; padding: 8px;">${FLIGHTSLIST.avaliableTicket}</td>
					<td
						style="border: 2px solid #dddddd; text-align: left; padding: 8px;">${FLIGHTSLIST.adultTicketRate}</td>
					<td
						style="border: 2px solid #dddddd; text-align: left; padding: 8px;">${FLIGHTSLIST.childTicketRate}</td>
					<td
						style="border: 2px solid #dddddd; text-align: left; padding: 8px;">${FLIGHTSLIST.babyTicketRate}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<table>
		<tbody>
			<a class="active" href="nextprocess.jsp">NEXT</a>
		</tbody>
	</table>
	<!-- </form> -->
</body>
</html>