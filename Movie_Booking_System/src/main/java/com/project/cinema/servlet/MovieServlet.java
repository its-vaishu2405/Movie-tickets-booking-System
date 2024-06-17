package com.project.cinema.servlet;


import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.cinema.model.Movie;
import com.project.cinema.util.DButil;

@WebServlet("/movies")
public class MovieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Movie> movies = new ArrayList<>();
        try (Connection con = DButil.getConnection()) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM movies");
            while (rs.next()) {
                Movie movie = new Movie();
                movie.setId(rs.getInt("id"));
                movie.setTitle(rs.getString("title"));
                movie.setGenre(rs.getString("genre"));
                movie.setShowtime(rs.getTimestamp("showtime"));
                movies.add(movie);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("movies", movies);
        request.getRequestDispatcher("views/movies.jsp").forward(request, response);
    }
}
