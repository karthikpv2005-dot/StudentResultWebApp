package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Student;
import db.DBConnection;

@WebServlet("/addStudent")
public class AddStudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("Servlet reached — data processed");

        String name = req.getParameter("name");
        int m1 = Integer.parseInt(req.getParameter("m1"));
        int m2 = Integer.parseInt(req.getParameter("m2"));
        int m3 = Integer.parseInt(req.getParameter("m3"));
        int m4 = Integer.parseInt(req.getParameter("m4"));

        Student s = new Student(name, m1, m2, m3, m4);

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
            		 "INSERT INTO students(name,m1,m2,m3,m4,total,grade) VALUES (?,?,?,?,?,?,?)"
            );
            ps.setString(1, s.getName());
            ps.setInt(2, s.getM1());
            ps.setInt(3, s.getM2());
            ps.setInt(4, s.getM3());
            ps.setInt(5, s.getM4());
            ps.setInt(6, s.getTotal());
            ps.setString(7, s.getGrade());


            ps.executeUpdate();
            ps.close();
            con.close();

            req.setAttribute("student", s);
            req.getRequestDispatcher("result.jsp").forward(req, resp);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 👉 Add THIS method inside the class
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("doGet reached");
        resp.getWriter().println("Servlet is working");
    }
}
