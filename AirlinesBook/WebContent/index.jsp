<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- <link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script> -->
<title>Insert title here</title>
<style>
.display {
	position: absolute;
	top: 37%;
	left: 22%;
}

body {
	margin: 0;
}

.hero-image {
	background-image: url("profile.bmp");
	height: 600px;
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
}

.hero-print {
	text-align: center;
	position: absolute;
	top: 150%;
	left: 20%;
	transform: translate(-50%, -50%);
	color: green;
	font-size: 15px;
}

.hero-text {
	text-align: center;
	position: absolute;
	top: 50%;
	left: 80%;
	transform: translate(-50%, -50%);
	color: white;
}

.hero-content {
	text-align: center;
	position: absolute;
	top: 120%;
	left: 60%;
	transform: translate(-50%, -50%);
	color: green;
}

.title-text {
	text-align: center;
	position: absolute;
	top: 5%;
	left: 50%;
	transform: translate(-50%, -50%);
	color: red;
}

form {
	display: inline-block;
}

.btn-default {
	background: #000;
	color: #fff;
}

.btn-default:hover {
	background: #fff;
	color: #000;
}

form {
	display: inline-block;
}
</style>
</head>
<body style="font-family: Times New Roman; font-size: 19px">
	<div class="title-text">
		<!-- <h2>AIRLINE-BOOKING</h2> -->
	</div>
	<div class="hero-image">
		<div class="hero-text">
			<form method="post" action="UserLoginServlet">
				<table>
					<tbody>
						<tr align="center">
							<td style="color: black" colspan="2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<b> LOGIN</b>
							</td>
							<td></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr align="left">
							<td style="color: black"><b>Email-id:</b></td>
							<td><input type="text" name="email" required></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr align="left">
							<td style="color: black"><b>Password:</b></td>
							<td><input type="password" name="password" required></td>
						</tr>
					</tbody>
				</table>
				<div class="hero-content">
					<button type="submit" style="width: 60px" class="btn btn-info"
						role="button">submit</button>
				</div>
				<div class="hero-print">
					<label style="color: red"><b>${ERROR}</b></label>
				</div>
			</form>
		</div>
	</div>
</body>
</html>