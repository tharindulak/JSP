<%@page import="java.util.ArrayList"%>
<%@page import="com.user.*"%>
<%@page import="java.sql.SQLException"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title></title>
</head>
<body>
	<h1>View All Users</h1>

	<table style="width: 40%" border="1px">

		<tr>
			<th>User Id</th>
			<th>Name</th>
			<th>Gender</th>
			<th>Address</th>
			<th>Email</th>
			<th>No of Vehicles</th>
			<th>Contact No</th>
		</tr>

		<%
			ArrayList<Owner> ownerList = null;

			try {
				ownerList = UserController.getAllOwners();
			} catch (SQLException ex ) {
				ex.printStackTrace();
			}catch(ClassNotFoundException ex){
                                ex.printStackTrace();
                        }

			for (Owner owner : ownerList) {
				request.setAttribute("id", owner.getId());
				request.setAttribute("name", owner.getName());
				request.setAttribute("gender", owner.getGender());
				request.setAttribute("address", owner.getAddress());
				request.setAttribute("email", owner.getEmail());
				request.setAttribute("nosVehicle", owner.getNosVehicle());
				request.setAttribute("contact", owner.getContatct());
		%>
		<tr>
			<td>${id}</td>
			<td>${name}</td>
			<td>${gender}</td>
			<td>${address}</td>
			<td>${email}</td>
			<td>${nosVehicle}</td>
			<td>${contact}</td>
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>