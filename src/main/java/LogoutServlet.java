import java.io.IOException;

import javax.servlet.*;

import javax.servlet.http.*;



public class LogoutServlet extends HttpServlet {



	    protected void doPost(HttpServletRequest request, HttpServletResponse response)

		                throws ServletException, IOException {



				        HttpSession session = request.getSession(false);

					        if (session != null) {

							            session.invalidate();

								            }



						        request.setAttribute("expired", "You have logged out successfully.");

							        RequestDispatcher rd = request.getRequestDispatcher("login.html");

								        rd.forward(request, response);

									    }

}


