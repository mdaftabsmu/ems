<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%-- <%String UserName = request.getParameter("user");
session.setAttribute("user",UserName);

%> --%>
</head>
<style>
/* Full-width input fields */
input[type=text], input[type=password] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

/* Set a style for all buttons */
button {
	background-color: #03033C;
	color: white;
	padding: 6px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
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
	width: 35%;
	border-radius: 0%;
}

.container {
	padding: 16px;
}

span.pwd {
	float: right;
	padding-top: 16px;
}

/* The Modal (background) */
.modal {
	display: none; /*Hidden by default */
	position: fixed; /* Stay in place */
	z-index: 1; /* Sit on top */
	left: 0;
	top: 0;
	width: 100%; /* Full width */
	height: 100%; /* Full height */
	overflow: auto; /* Enable scroll if needed */
	background-color: rgb(0, 0, 0); /* Fallback color */
	background-color: rgba(0, 0, 0, 0.4); /* Black w/ opacity */
	padding-top: 60px;
}

/* Modal Content/Box */
.modal-content {
	background-color: #fefefe;
	margin: 5% auto 15% auto;
	/* 5% from the top, 15% from the bottom and centered */
	border: 1px solid #888;
	width: 250px; /* Could be more or less, depending on screen size */
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

.bodybg {
	background-image: url('./static/image/berkeley-domain-image (1).jpg');
	background-repeat: no-repeat;
	background-size: 100% 100%;
	height: 100vh;
}
</style>
<body class="bodybg">

	<h2 align="right">
		Admin&nbsp;
		<button
			onclick="document.getElementById('id01').style.display='block'"
			style="width: auto;">Login</button>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</h2>
	<div id="id01" class="modal">
		<form:form id="loginForm" modelAttribute="loginForm" action="login"
			class="modal-content animate" method="post">
			<div class="imgcontainer">
			<span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
				<img src="./static/image/logo.png" alt="Avatar" class="avatar">
			</div>

			<div class="container">
				<form:label path="userId">User Name</form:label>
				<form:input path="userId" name="userId" id="userId" />
				<form:label path="pwd">Password</form:label>
				<form:input path="pwd" name="pwd" id="pwd" />
				<form:button id="login" name="login">Login</form:button>
				<input type="checkbox" checked="checked"> Remember me
			</div>

			<div class="container" style="background-color: #f1f1f1">
				<span class="psw">Forgot <a href="#">password ?</a></span>
			</div>
		</form:form>
	</div>

	<script>
// Get the modal



window.onload = function(){
var modal = document.getElementById('myModal');

// Get the button that opens the modal
var btn = document.getElementById("myBtn");

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];
// When the user clicks on the button, open the modal
btn.onclick = function() {
    modal.style.display = "block";
}

// When the user clicks on <span> (x), close the modal
span.onclick = function() {
    modal.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}};


/* var modal = document.getElementById('id01');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "non";
    }
    else
    	
    	modle.style.display="hold";
    	
} */
</script>

</body>
</html>
