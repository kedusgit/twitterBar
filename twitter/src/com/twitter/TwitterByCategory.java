package com.twitter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TwitterByCategory")
public class TwitterByCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String category = request.getParameter("category");
		
		String jsonResponse = "[{\"screen_name\": \"Tito\", \"mini_profile_pictuer_url\": \"http://www.panacomp.net/wp-content/uploads/2015/09/TITO.jpg\", \"twit\": \"Helo world, I'm gonna fuck you\"},{\"screen_name\": \"Tito\", \"mini_profile_pictuer_url\": \"http://www.panacomp.net/wp-content/uploads/2015/09/TITO.jpg\", \"twit\": \"Helo world, I'm gonna fuck you\"}]";
		
		response.getWriter().println(jsonResponse);
	}

}
