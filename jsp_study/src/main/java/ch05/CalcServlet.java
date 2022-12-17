package ch05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/calc") // calc로부터 데이터 받음 
//calcForm.html에서 첫번째숫자는 n1, select는 op, 두번째 숫자는 n2로 이름이 지정되어 있음.
// 얘를 이용해서 servlet에서 어떻게 받을건지를 지정할 수 있다.

public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 보낸 값을 어떻게 받을 것인가? request 객체에는 클라이언트에서 요청한 내용들이 들어가있다.
		// submit버튼을 눌러서 클라이언트가 보낸 내용들이 request안에 들어가 있다고 보면 된다
		int n1 = Integer.parseInt(request.getParameter("n1")); 
		// 클라이언트 (html)로부터 request된 값중 이름 "n1"인 아이 받아옴.
		// getParameter 이 String 형이기 떄문에 형변환을 해줘야함.
		int n2 = Integer.parseInt(request.getParameter("n2")); 
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		
		String op = request.getParameter("op"); // 연산자 데이터 수령
		System.out.println("op: " + op);
		
		//사칙연산
		long result = 0; //연산 결과
		
		switch(op) {
		case "+" : result = n1+n2; break;
		case "-" : result = n1-n2; break;
		case "*" : result = n1*n2; break;
		case "/" : result = n1/n2; break;
		}	
		// 이제, 연산 결과를 response (결과값 돌려주기) 하면 된다.
		// 서블릿에서 response 하는 방법 적용		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.append("<!doctype html><html><head><title>Calculator Servlet</title></head><body>")
		.append("계산결과" + result + "</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	// post방식으로 보냈기 떄문에 doPost 작동, 근데 doPost 안에 위에있는 doGet을 실행한다.
	// 결국 실질적인 코드는 doGet에서 실행한다.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
