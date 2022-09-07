package hello;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class addPeopleServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		int age1 = Integer.parseInt(age);
		
		
		PersonDAO dao = new PersonDAO();
		
		try {
			dao.inputPersonList(name, age1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		resp.sendRedirect(req.getContextPath());
	}


}
