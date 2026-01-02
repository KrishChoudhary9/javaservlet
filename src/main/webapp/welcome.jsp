<%@ page import="javax.servlet.http.HttpSession" %>



<%

    HttpSession session1 = request.getSession(false);

        if (session1 == null || session1.getAttribute("username") == null) {

	        request.setAttribute("expired", "Session expired. Please login again.");

		        RequestDispatcher rd = request.getRequestDispatcher("login.html");

			        rd.forward(request, response);

				    }

				    %>
				    %
				    %
				    %
				    %<!DOCTYPE html>
				    %
				    %<html>
					    %
					    %<head>
						    %
						    %    <title>Welcome</title>
						    %
						    %    </head>
					    %
					    %    <body>
						    %
						    %
						    %
						    %    <h2>Welcome <%= session1.getAttribute("username") %></h2>
						    %
						    %
						    %
						    %    <form action="LogoutServlet" method="post">
							    %
							    %        <input type="submit" value="Logout">
							    %
							    %        </form>
						    %
						    %
						    %
						    %        </body>
					    %
					    %        </html>
				    %
				    %
