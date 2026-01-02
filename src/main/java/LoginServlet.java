import java.io.IOException;

import javax.servlet.*;

import javax.servlet.http.*;



public class LoginServlet extends HttpServlet {



	    protected void doPost(HttpServletRequest request, HttpServletResponse response)

		                throws ServletException, IOException {



				        String username = request.getParameter("username");

					        String password = request.getParameter("password");



						        // Hard-coded credentials
							//
							//         if (username.equals("admin") && password.equals("1234")) {
							//
							//
							//
							//                     HttpSession session = request.getSession();
							//
							//                                 session.setAttribute("username", username);
							//
							//
							//
							//                                             RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
							//
							//                                                         rd.forward(request, response);
							//
							//
							//
							//                                                                 } else {
							//
							//                                                                             request.setAttribute("error", "Invalid Username or Password");
							//
							//                                                                                         RequestDispatcher rd = request.getRequestDispatcher("login.html");
							//
							//                                                                                                     rd.forward(request, response);
							//
							//                                                                                                             }
							//
							//                                                                                                                 }
							//
							//                                                                                                                 }
							//
							//
