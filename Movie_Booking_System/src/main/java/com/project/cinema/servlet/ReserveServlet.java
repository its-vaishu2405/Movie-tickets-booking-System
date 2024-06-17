package com.project.cinema.servlet;



import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.cinema.util.DButil;

@WebServlet("/reserve")
public class ReserveServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId = (Integer) request.getSession().getAttribute("userId");
        int movieId = Integer.parseInt(request.getParameter("movieId"));
        String[] seatIds = request.getParameterValues("seatIds");
        String seatIdString = String.join(",", seatIds);
        String totalPrice = request.getParameter("totalPrice");

        try (Connection con = DButil.getConnection()) {
            PreparedStatement ps = con.prepareStatement("INSERT INTO bookings (user_id, movie_id, seat_ids, total_price, status) VALUES (?, ?, ?, ?, ?)");
            ps.setInt(1, userId);
            ps.setInt(2, movieId);
            ps.setString(3, seatIdString);
            ps.setString(4, totalPrice);
            ps.setString(5, "Confirmed");
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.sendRedirect("confirmation.jsp");
    }
}
