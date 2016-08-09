<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form name="addUser" method="post">
		<h1>Search User</h1>
		<label>ID :</label> <input type="text" name="id" value="${id}"
			readonly> <br> <br> <label>Name :</label> <input
			type="text" name="name" value="${name}" readonly> <br> <br>
			<%
				String gender =String.valueOf(request.getAttribute("gender")) ;
				System.out.println(gender);
				
				if(!(gender.equals("")) && gender.equals("male")){
					
			%>
				<label>Gender :</label> <input type="radio" name="gender" value="male"
				readonly checked="checked"> Male <input type="radio" name="gender"
				value="female" readonly> Female <input type="radio"
				name="gender" value="other" readonly> Other <br> <br>
			<%
				}
				else if(!(gender.equals("")) && gender.equals("female")){
			%>
				<label>Gender :</label> <input type="radio" name="gender" value="male"
				readonly> Male <input type="radio" name="gender"
				value="female" readonly checked="checked"> Female <input type="radio"
				name="gender" value="other" readonly> Other <br> <br>
			<%
				}
				else{
			%>
				<label>Gender :</label> <input type="radio" name="gender" value="male"
				readonly> Male <input type="radio" name="gender"
				value="female" readonly> Female <input type="radio"
				name="gender" value="other" readonly checked="checked"> Other <br> <br>
			<%
				}
			%>
		
		<label>Address :</label> <input type="text" name="address"
			value="${address}" readonly> <br> <br> <label>Email
			:</label> <input type="text" name="email" value="${email}" readonly>
		<br> <br> <label>No Of Vehicles :</label> <input type="text"
			name="nosVehicle" value="${nosVehicle}" readonly> <br> <br>
		<label>Contact No :</label> <input type="text" name="contact"
			value="${contact}" readonly> <br> <br>
	</form>
</body>
</html>