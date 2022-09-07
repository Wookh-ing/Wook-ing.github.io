package kr.co.greenart;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PeopleServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 요청 주소에 요청 흐름 제어
		String people = req.getParameter("people");
		PeopleDAO dao = new PeopleDAO();
		List<People> list = null;
		try {
			list = dao.getPeopleByNameAndAge(people);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		req.setAttribute("list", list);
		req.getRequestDispatcher("result.jsp").forward(req, resp);
		
	}

}
