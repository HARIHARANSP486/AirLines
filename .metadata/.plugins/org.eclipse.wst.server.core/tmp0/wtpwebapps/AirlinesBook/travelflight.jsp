<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="HundredOfferServelt">
		<table>
			<tr>
				<td>
					<div align="center" style="width: 600px; padding-top: 150px">
						<h2>JOURNEY FLIGHTS:</h2>
						<table>
							<tr>
								<td class="select"><b>Source:</b></td>
								<td><select name="source">
										<option value="CHENNAI">CHENNAI</option>
										<option value="COIMBATORE">COIMBATORE</option>
										<option value="MADURAI">MADURAI</option>
										<option value="DELHI">DELHI</option>
										<option value="BANGALOERE">BANGALORE</option>
										<option value="HYDRABAD">HYDRABAD</option>
										<option value="PUNE">PUNE</option>
										<option value="MUMBAI">MUMBAI</option>
								</select></td>
								<td class="select"><b>Destination:</b></td>
								<td><select name="destination">
										<option value="CHENNAI">CHENNAI</option>
										<option value="COIMBATORE">COIMBATORE</option>
										<option value="MADURAI">MADURAI</option>
										<option value="DELHI">DELHI</option>
										<option value="BANGALORE">BANGALORE</option>
										<option value="HYDRABAD">HYDRABAD</option>
										<option value="PUNE">PUNE</option>
										<option value="MUMBAI">MUMBAI</option>
								</select></td>
								<td style="color: black"><b>Date:</b></td>
								<td><input type="date" name="date" required></td>
								<td><button type="submit" style="width: 100px">
										<b>SUBMIT</b>
									</button> <br></td>
						</table>
					</div>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>