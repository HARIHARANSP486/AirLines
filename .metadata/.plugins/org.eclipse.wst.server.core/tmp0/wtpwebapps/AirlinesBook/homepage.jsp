<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
	font-family: Apple Chancery, cursive, Helvetica, sans-serif;
	font-size: 20px;
}

p.italic {
	font-style: italic;
}

.hero-content {
	text-align: left;
	position: absolute;
	top: 60%;
	left: 60%;
	transform: translate(-50%, -50%);
	color: green;
}
/* Full-width input fields */
input[type=text], input[type=password] {
	width: 20%;
	padding: 12px 20px;
	margin: 8px 0;
	padding-left: 80px;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

body {
	background-position: center;
	background-size: cover;
	position: relative;
	background-position: center center;
	text-align: left;
	padding-left: 260px;
	font-family: Times New Roman;
}
/* Set a style for all buttons */
button {
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 4px 0;
	border: none;
	cursor: pointer;
	width: 20%;
}

button:hover {
	opacity: 0.8;
}

/* Extra styles for the cancel button */
.cancelbtn {
	width: auto;
	padding: 10px 18px;
	background-color: #f44336;
}

/* Center the image and position the close button */
.imgcontainer {
	text-align: center;
	margin: 24px 0 12px 0;
	position: relative;
}

img.avatar {
	width: 40%;
	border-radius: 50%;
}

.container {
	padding: 16px;
}

span.psw {
	float: right;
	padding-top: 16px;
}

/* The Modal (background) */
.modal {
	display: none; /* Hidden by default */
	position: fixed; /* Stay in place */
	z-index: 1; /* Sit on top */
	left: 0;
	top: 0;
	width: 100%; /* Full width */
	height: 100%; /* Full height */
	overflow: auto; /* Enable scroll if needed */
	background-color: rgb(0, 0, 0); /* Fallback color */
	background-color: rgba(0, 0, 0, 0.4); /* Black w/ opacity */
	padding-top: 100px;
}

/* Modal Content/Box */
.modal-content {
	background-color: #fefefe;
	margin: 5% auto 15% auto;
	/* 5% from the top, 15% from the bottom and centered */
	border: 1px solid #888;
	width: 80%; /* Could be more or less, depending on screen size */
}

/* The Close Button (x) */
.close {
	position: absolute;
	right: 25px;
	top: 0;
	color: #000;
	font-size: 35px;
	font-weight: bold;
}
/* .hero-image {
	background-image: url("Airline-Header.jpg");
	height: 600px;
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
	
} */
.hero-img {
	background-image: url("profile.bmp");
	height: 400px;;
	background-position: left;
	background-repeat: no-repeat;
	background-size: cover
}

.close:hover, .close:focus {
	color: red;
	cursor: pointer;
}

/* Add Zoom Animation */
.animate {
	-webkit-animation: animatezoom 0.6s;
	animation: animatezoom 0.6s
}

@
-webkit-keyframes animatezoom {
	from {-webkit-transform: scale(0)
}

to {
	-webkit-transform: scale(1)
}

}
@
keyframes animatezoom {
	from {transform: scale(0)
}

to {
	transform: scale(1)
}

}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
	span.psw {
		display: block;
		float: none;
	}
	.cancelbtn {
		width: 100%;
	}
}
</style>
</head>
<body>
	<!-- <div class="hero-image"> -->
	<div class="imgcontainer">
		<div class="hero-img">
			<form method="post" action="UserLoginServlet">
				<%-- <h2><center>AIRLINE BOOKING</center></h2> --%>
				<%--
<center><button onclick="document.getElementById('id01').style.display='block'" style="width:auto;">LOGIN </button></center>

<div id="id01" class="modal">
  
  <form class="modal-content animate" action="/action_page.php">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
      <!-- <img src="img_avatar2.png" alt="Avatar" class="avatar"> --> --%>

				<!-- <img src="profile.bmp" alt="Profile Picture" align="left" style="width:100px;height:100px;"> -->
				<div class="hero-content">
					<table>
						<tbody>
							<tr align="center">
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
								<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<button type="submit" style="width: 100px">Login</button> <br>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
		</div>
		</form>
	</div>
	<!--  <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
      <span class="psw">Forgot <a href="#">password?</a></span>
    </div>
  -->
	</div>
	<!-- </div> -->
	<!-- </div> -->
	<script>
		// Get the modal
		var modal = document.getElementById('id01');

		// When the user clicks anywhere outside of the modal, close it
		window.onclick = function(event) {
			if (event.target == modal) {
				modal.style.display = "none";
			}
		}
	</script>
</body>
</html>
