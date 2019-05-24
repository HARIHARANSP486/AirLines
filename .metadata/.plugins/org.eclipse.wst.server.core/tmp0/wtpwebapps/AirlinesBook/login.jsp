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
	<form method="post" action="UserLoginServlet">
		<table>
			<tbody>
				<tr align="center">
					<td style="color: black" colspan="2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<b>USER LOGIN</b>
					</td>
					<td></td>
				</tr>
				<tr align="left">
					<td style="color: black"><b>Email-id:</b></td>
					<td><input type="text" name="email" required></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr align="left">
					<td style="color: black"><b>Password :</b></td>
					<td><input type="password" name="password" required></td>
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