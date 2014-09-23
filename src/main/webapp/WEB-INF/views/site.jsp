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
                    <th>ID</th>
                    <th>Year</th>
                    <th>Site Num</th>
                    <th>Latitude</th>
                    <th>Longitude</th>
                    <th>State</th>
                    <th>County</th>
                    <th>Parameter Name</th>
                    <th>Pol Standard</th>
                    <th>Mean</th>
                    <th>Deviation</th>
                    <th>POC</th>
                    <th>Max Value 1</th>
                    <th>Max Value 1 Day Time</th>
                    <th>Max Value 2</th>
                    <th>Max Value 2 Day Time</th>
                    <th>Max Value 3</th>
                    <th>Max Value 3 Day Time</th>
                    <th>Max Value 4</th>
                    <th>Max Value 4 Day Time</th>
                </tr>
                <tr>
                    <td>${locations.id}</td>
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
                    <td>${locations.poc}</td>
                    <td>${locations.max_value_1}</td>
                    <td>${locations.max_day_time_1}</td>
                    <td>${locations.max_value_2}</td>
                    <td>${locations.max_day_time_2}</td>
                    <td>${locations.max_value_3}</td>
                    <td>${locations.max_day_time_3}</td>
                    <td>${locations.max_value_4}</td>
                    <td>${locations.max_day_time_4}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>