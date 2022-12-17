package ch05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/Hello") 
//annotation : 현재 클래스가 Servlet 클래스임을 이야기함. 
//Hello -> URLPattern: 어떤 요청에 의해 서블릿을 호출할 것인지 결정 (url mapping)

public class HelloWorld extends HttpServlet { //Servlet에서 상속받은 Helloworld.
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super(); // 상속받음.
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 *  
	 */ 
    
    //오버라이드 된 doGet - get요청 위해
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		// response(클라이언트 한테 응답) 한다. 
		response.setContentType("text/html;charset=utf-8"); // 클라이언트에게 보낼 html의 타입을 지정
		PrintWriter out = response.getWriter(); // 응답값을 out에 작성해준다.
		out.append("<!doctype html><html><head><title>Hello World Servlet</title></head><body>")
		.append("<h2>Hello World !!</h2><hr>")
		.append("현재 날짜와 시간은: "+java.time.LocalDateTime.now())
		.append("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 *   
	 */
	//doPost - Post 요청 위해
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
