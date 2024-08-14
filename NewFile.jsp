<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP File</title>

<style>
img {
	height: 20%;
	width: 20%;
}

h1, h3 {
	color: white;
	margin: 15px;
}

input, button, select {
	font-size: 25px;
	color: white;
	border-radius: 5%;
	background-color: black;
	border: 2px solid white;
}

body {
	text-align: center;
	background: linear-gradient(to right, #07121a, #2b40ff);
}
</style>
</head>

<body>
	<img src="images/emojy.jpg">
	<h1>Random Joke</h1>
	<h2><%=request.getParameter("joke")%>🚩</h2>
	<form action="MyServlet" method="get">
		<input name="num1" placeholder="First No"> 
		<input name="num2" placeholder="Second No">
		 <select name="option">
			<option value="1">+</option>
			<option value="2">-</option>
			<option value="3">*</option>
			<option value="4">/</option>
		</select>
		 </br>
		</br>
		<button >Submit</button>
		<button type="button" onclick="window.location.href='index.html';">Back</button>
		
		
	</form>
	<h1>Ans = <%=request.getParameter("ans")%>🚩</h1>
	
	
</body>
</html>