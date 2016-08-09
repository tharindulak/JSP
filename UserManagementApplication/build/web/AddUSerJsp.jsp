<%-- 
    Document   : AddUSerJsp
    Created on : Aug 9, 2016, 7:15:57 PM
    Author     : Tharindu Jayathilake
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="com.user.UserController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
       
        <%
            String s = "";
            try {
                s = UserController.getLastId();
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            String s2 = s.substring(1);
            int x = Integer.parseInt(s2);
            x++;
            String s3 = "";
            if (x < 10) {
                s3 = "U" + "00" + String.valueOf(x);

            } else if (x < 100) {
                s3 = "U" + "0" + String.valueOf(x);
            } else if (x < 1000) {
                s3 = "U" + String.valueOf(x);
            }
            String s4 = s3.trim();
        %>
        <%=s4%>
