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

import com.project.cinema.model.Seat;
import com.project.cinema.util.DButil;

@WebServlet("/seats")
public class SeatServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int movieId = Integer.parseInt(request.getParameter("movieId"));
        List<Seat> seats = new ArrayList<>();
        try (Connection con = DButil.getConnection()) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM seats WHERE movie_id = " + movieId);
            while (rs.next()) {
                Seat seat = new Seat();
                seat.setId(rs.getInt("id"));
                seat.setScreenId(rs.getInt("screen_id"));
                seat.setSeatNumber(rs.getString("seat_number"));
                seat.setStatus(rs.getString("status"));
                seats.add(seat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("seats", seats);
        request.getRequestDispatcher("views/seats.jsp").forward(request, response);
    }
}
