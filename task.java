package task;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class studentservlet
 */
@WebServlet("/studentservlet")
public class studentservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public studentservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
	PrintWriter out=response.getWriter();
      	out.print("<h1>Hello world</h2>");

		 
		String name=request.getParameter("studentname");
		String id=request.getParameter("studentid");
		String department=request.getParameter("department");
		out.print("<h2>student details</h2>");
		out.print("<p>student name:"+name+"</p>");
		out.print("<p>student id:"+id+"</p>");
		out.print("<p>department:"+department+"</p>");
		
		 
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		if(username.equals("Nandhini") && password.equals("12345"))
		{
		out.print("<h2>login successfully</h2>");
		}
	else {
		
		out.print("<h2>Invalid login</h2>");
	}
		
	}		 
		
		
