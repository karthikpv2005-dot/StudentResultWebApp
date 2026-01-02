package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;
import java.sql.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import db.DBConnection;

@WebServlet("/downloadPdf")
public class PdfServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {

        resp.setContentType("application/pdf");
        resp.setHeader("Content-Disposition","attachment; filename=students.pdf");

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM students");
            ResultSet rs = ps.executeQuery();

            Document doc = new Document();
            PdfWriter.getInstance(doc, resp.getOutputStream());
            doc.open();

            doc.add(new Paragraph("Student Result Report"));
            doc.add(new Paragraph(" "));
            
            PdfPTable table = new PdfPTable(8);
            table.addCell("ID");
            table.addCell("Name");
            table.addCell("M1");
            table.addCell("M2");
            table.addCell("M3");
            table.addCell("M4");
            table.addCell("Total");
            table.addCell("Grade");

            while(rs.next()){
                table.addCell(String.valueOf(rs.getInt("id")));
                table.addCell(rs.getString("name"));
                table.addCell(String.valueOf(rs.getInt("m1")));
                table.addCell(String.valueOf(rs.getInt("m2")));
                table.addCell(String.valueOf(rs.getInt("m3")));
                table.addCell(String.valueOf(rs.getInt("m4")));
                table.addCell(String.valueOf(rs.getInt("total")));
                table.addCell(rs.getString("grade"));
            }

            doc.add(table);
            doc.close();

            rs.close(); ps.close(); con.close();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
