package ch05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		if(id.equals("person")) {
			if(pw.equals("1234")) {
				out.append("<!doctype html><html><head><title>로그인 서블릿</title><h1>로그인 서블릿</h1></head><hr><body>")
				.append(id +"님 반갑습니다." + "</body></html>");
			}else {
				out.append("<!doctype html><html><head><title>로그인 서블릿</title><h1>로그인 서블릿</h1></head><hr><body>")
				.append("로그인 실패." + "</body></html>");
			}
		}else {
			out.append("<!doctype html><html><head><title>로그인 서블릿</title><h1>로그인 서블릿</h1></head><hr><body>")
			.append("로그인 실패." + "</body></html>");
		}		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
