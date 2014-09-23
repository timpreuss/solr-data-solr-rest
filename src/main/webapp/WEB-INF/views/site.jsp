<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Users</title>
</head>
<body>
<table border="1" align="center" style="width:50%">
        <tbody>
            <c:forEach var="locations" items="${locations}" >
                <tr>
                    <td>ID</td>
                    <td>${locations.id}</td>
                    <td>Year</td>
                    <td>${locations.year}</td>
                    <td>Site Num</td>
                    <td>${locations.site_num}</td>
                    <td>Latitude</td>
                    <td>${locations.latitude}</td>
                    <td>Longitude</td>
                    <td>${locations.longitude}</td>
                    <td>State</td>
                    <td>${locations.state_nm}</td>
                    <td>County</td>
                    <td>${locations.county_nm}</td>
                    <td>Parameter Name</td>
                    <td>${locations.parameter_nm}</td>
                    <td>Pol Standard</td>
                    <td>${locations.pol_standard}</td>
                    <td>Mean</td>
                    <td>${locations.mean}</td>
                    <td>Deviation</td>
                    <td>${locations.deviation}</td>
                </tr>
            </c:forEach> 
        </tbody>
    </table> 
</body>
</html>