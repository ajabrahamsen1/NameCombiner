package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.NameCombiner;

// AJ Abrahamsen

/**
 * Servlet implementation class getNameServlet
 */
@WebServlet("/getNameServlet")
public class getNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getNameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		
		NameCombiner fullName = new NameCombiner(firstName, lastName);
		
		request.setAttribute("nameHolder", fullName);
		
		getServletContext().getRequestDispatcher("/result1.jsp").forward(request, response);
		
		
	}

}
