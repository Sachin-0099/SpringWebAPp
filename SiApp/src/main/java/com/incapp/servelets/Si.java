package com.incapp.servelets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Si
 */
@WebServlet("/si")
public class Si extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int p=Integer.parseInt(request.getParameter("p"));
		double r=Double.parseDouble(request.getParameter("r"));
		int t=Integer.parseInt(request.getParameter("t"));
		double si=(p*r*t)/100;
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Welcome to Simple interest App</h1>");
		out.print("<hr>");
		out.print("<p> Sum Simple  = "+si+" </p>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}

}
