package hello;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PersonServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 요청 주소에 요청 흐름 제어
		PersonDAO dao = new PersonDAO();
		List<Person> list = null;
		try {
			dao.getPersonList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		req.setAttribute("list", list);
		req.getRequestDispatcher("result.jsp").forward(req, resp);
	}
}