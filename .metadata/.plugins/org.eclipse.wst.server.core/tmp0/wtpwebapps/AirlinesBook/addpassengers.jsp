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
	<form method="post" action="AddPassengersServlet">
		<h3>list of details:</h3>
		<table>
			<tbody>
				<tr align="center">
					<td style="color: black"><b>Name:</b></td>
					<td><input type="text" name="name" required></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr align="center">
					<td style="color: black"><b>Gender:</b></td>
					<td><input type="radio" name="gender" value="male" required>Male</td>
					<td><input type="radio" name="gender" value="female" required>Female</td>
					<td><input type="radio" name="gender" value="others" required>Others</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr align="center">
					<td style="color: black"><b>Age:</b></td>
					<td><input type="text" name="age" required></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
			</tbody>
		</table>
		<table>
			<tbody>
				<tr>
					<td></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<button type="submit" style="width: 100px">Login</button> <br>
					</td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>