package hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	private int some = 10; // ����!!
	
	public HelloServlet() {
		super();
		System.out.println("��� ���� �����ڴ� ���� ȣ��ǳ���?");
	}
	
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		some++;
		System.out.println("�ʵ� �� : " + some);
		PrintWriter pw = resp.getWriter();
		pw.println(req.getRequestURI());
		pw.flush();
	}
}
