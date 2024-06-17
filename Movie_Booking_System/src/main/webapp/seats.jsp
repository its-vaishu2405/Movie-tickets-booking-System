<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.project.cinema.model.Seat" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <title>Seats</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <h1>Select Seats</h1>
    <form action="reserve" method="post">
        <%
            List<Seat> seats = (List<Seat>) request.getAttribute("seats");
            for (Seat seat : seats) {
        %>
        <div>
            <label>
                <input type="checkbox" name="seatIds" value="<%= seat.getId() %>">
                <%= seat.getSeatNumber() %> (<%= seat.getStatus() %>)
            </label>
        </div>
        <% } %>
        <input type="hidden" name="movieId" value="<%= request.getParameter("movieId") %>">
        <input type="hidden" name="totalPrice" value="50.00"> <!-- Hardcoded for simplicity -->
        <button type="submit">Reserve</button>
    </form>
</body>
</html>
