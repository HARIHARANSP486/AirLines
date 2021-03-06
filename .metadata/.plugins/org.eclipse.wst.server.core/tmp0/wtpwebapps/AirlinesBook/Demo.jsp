<HTML>
<HEAD>
<TITLE>Add/Remove dynamic rows in HTML table</TITLE>
<SCRIPT language="javascript">
	var count = 1;
	function addRow(tableID, x) {
		if (count < x) {
			var table = document.getElementById(tableID);
			var rowCount = table.rows.length;
			var row = table.insertRow(rowCount);
			var colCount = table.rows[0].cells.length;
			for (var i = 0; i < colCount; i++) {
				var newcell = row.insertCell(i);
				newcell.innerHTML = table.rows[0].cells[i].innerHTML;
				//alert(newcell.childNodes);
				switch (newcell.childNodes[0].type) {
				case "text":
					newcell.childNodes[0].value = "";
					newcell.childNodes[0].name = "name" + count;
					break;
				case "checkbox":
					newcell.childNodes[0].checked = false;
					break;
				case "date":
					newcell.childNodes[3].selectedIndex = 0;
					newcell.childNodes[3].name = "gender" + count;
					break;
				}
			}
			count++;
		}
	}
	function deleteRow(tableID) {
		try {
			count--;
			var table = document.getElementById(tableID);
			var rowCount = table.rows.length;
			for (var i = 0; i < rowCount; i++) {
				var row = table.rows[i];
				var chkbox = row.cells[0].childNodes[0];
				if (null != chkbox && true == chkbox.checked) {
					if (rowCount <= 1) {
						alert("Cannot delete all the rows.");
						break;
					}
					table.deleteRow(i);
					rowCount--;
					i--;
				}
			}
		} catch (e) {
			alert(e);
		}
	}
</SCRIPT>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

</HEAD>
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
	font-size: 20px;
}

.hero-content {
	text-align: center;
	position: absolute;
	top: 10%;
	left: 97%;
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
	padding: 15px 20px;
	text-decoration: none;
	font-size: 20px;
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
	font-size: 20px;
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
	top: 45%;
	left: 15%;
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
<BODY>
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
	<div class="hero-text">
		<h3>
			<left> <b>Enter the valid details of Passengers:</b></left>
		</h3>
		<br>
		<form method="post" action="AddPassengersServlet">
			<INPUT type="button" value="Add Row"
				onclick="addRow('dataTable','${totalTravelpassengers }')" /> <INPUT
				type="button" value="Delete Row" onclick="deleteRow('dataTable')" />
			<TABLE id="dataTable" width="350px" border="2">
				<TR>
					<TD><INPUT type="checkbox" name="chk" /></TD>
					<td style="color: black"><b>Name:</b></td>
					<TD><INPUT type="text" name="name0" /></TD>
					<!-- <td style="color: black"><b>Age:</b></td> -->
					<!-- <TD><INPUT type="text" name="age" /></TD> -->
					<TD><input type="date" style="display: none"><b>Gender:</b>
						<SELECT name="gender0">
							<OPTION value="male">Male</OPTION>
							<OPTION value="female">Female</OPTION>
							<OPTION value="others">Others</OPTION>
					</SELECT></TD>
					<!-- <td class="select"><b>Gender:&nbsp;&nbsp;&nbsp;&nbsp;</b></td>
					<td><select name="Gender">
							<OPTION value="male">Male</OPTION>
							<OPTION value="female">Female</OPTION>
							<OPTION value="others">Others</OPTION>
					</select></td> -->
					<!-- <td><a href="passengersubmit.jsp">submit</a>
			</td>
			 -->
				</TR>
			</TABLE>
			<table>
				<tbody>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr align="center">
						<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<button type="submit" class="btn btn-info" style="width: 120px">
								<b>SUBMIT</b>
							</button> <br>
						</td>
					</tr>
				</tbody>
			</table>
			<div class="hero-content">
			<a href="index.jsp" class="btn btn-info" role="button">LOGOUT</a>
		</div>
			<div class="hero-back">
				<a href="passengersnumber.jsp" class="btn btn-info" role="button">BACK</a>
			</div>
	</div>
</BODY>
</HTML>