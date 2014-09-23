<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List by State</title>
</head>
<body>
<table border="1" align="center" style="width:50%">
        <thead>
            <tr>
                <th>Id</th>
                <th>Year</th>
                <th>Site Number</th>
                <th>Latitude</th>
                <th>Longitude</th>
                <th>State</th>
                <th>County</th>
                <th>Parameter Name</th>
                <th>Pol Standard</th>
                <th>Mean</th>
                <th>Deviation</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="locations" items="${locations}" >
                <tr>
                    <td ><a href="http://localhost:8085/aqs-rest-service-0.1.0/data/siteview?id=${locations.id}">${locations.id}</a></td>
                    <td>${locations.year}</td>
                    <td>${locations.site_num}</td>
                    <td>${locations.latitude}</td>
                    <td>${locations.longitude}</td>
                    <td>${locations.state_nm}</td>
                    <td>${locations.county_nm}</td>
                    <td>${locations.parameter_nm}</td>
                    <td>${locations.pol_standard}</td>
                    <td>${locations.mean}</td>
                    <td>${locations.deviation}</td>
                </tr>
            </c:forEach> 
        </tbody>
    </table> 
</body>
</html>