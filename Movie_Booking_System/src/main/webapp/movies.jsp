<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.project.cinema.model.Movie" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <title>Movies</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <h1>Available Movies</h1>
    <table>
        <tr>
            <th>Title</th>
            <th>Genre</th>
            <th>Showtime</th>
            <th>Action</th>
        </tr>
        <%
            List<Movie> movies = (List<Movie>) request.getAttribute("movies");
            for (Movie movie : movies) {
        %>
        <tr>
            <td><%= movie.getTitle() %></td>
            <td><%= movie.getGenre() %></td>
            <td><%= movie.getShowtime() %></td>
            <td><a href="seats.jsp?movieId=<%= movie.getId() %>">Select Seats</a></td>
        </tr>
        <% } %>
    </table>
</body>
</html>
