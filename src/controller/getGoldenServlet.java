package controller;

// AJ Abrahamsen

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GoldenBirthdayFinder;

/**
 * Servlet implementation class getGoldenServlet
 */
@WebServlet("/getGoldenServlet")
public class getGoldenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getGoldenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String monthName = request.getParameter("monthName");
		String dayOfMonth = request.getParameter("dayOfMonth");
		String year = request.getParameter("year");
		
		GoldenBirthdayFinder goldenBirthday = new GoldenBirthdayFinder(monthName, Integer.parseInt(dayOfMonth), Integer.parseInt(year));
		
		request.setAttribute("goldenBirthdayHolder", goldenBirthday);
		
		getServletContext().getRequestDispatcher("/result2.jsp").forward(request, response);
		
		//PrintWriter writer = response.getWriter();
		//writer.println(monthName + " " + dayOfMonth + " " + year);
		//writer.close();
	}

}
