package ch08;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcController
 */



// calcForm에서 보낸 데이터가 여기로 들어옴. 즉, Controller의 역할을 함.

@WebServlet("/CalcController")
public class CalcController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n1 = Integer.parseInt(request.getParameter("n1")); 
		int n2 = Integer.parseInt(request.getParameter("n2")); 
		String op = request.getParameter("op"); // 연산자 데이터 수령
		//사칙연산
		long result = 0; //연산 결과
		switch(op) {
		case "+" : result = n1+n2; break;
		case "-" : result = n1-n2; break;
		case "*" : result = n1*n2; break;
		case "/" : result = n1/n2; break;
		}	
		//로직 끝난 데이터 전달해주기
		// request를 사용하여 데이터를 set 해두면, request 할때까지 살아있다. 그것을 이용한다.
		// 데이터 request 이용하여 저장 완료
		request.setAttribute("result", result);
		// 페이지 호출
		getServletContext().getRequestDispatcher("/ch08/calcResult.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
