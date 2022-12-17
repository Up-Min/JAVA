package ch09;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/studentControl")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StudentDAO dao;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config); // 서블릿 초기화
		dao = new StudentDAO(); // init시에 딱 한번만 만들어지는 DAO 객체 -> 공유해서 쓸 수 있다.
	}
       
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get, post방식을 구분해주던 기존 service에서,
		// 오버라이드 후 재정의 하여 servlet의 service순서에서 하려는 액션을 집어넣어 준다.
		// request : view에서 넘어온 데이터, 정보가 들어있음.
		request.setCharacterEncoding("UTF-8"); //view에서 넘어오는 한글 데이터 깨짐 방지
		String action = request.getParameter("action"); // 'insert'가 들어감.
		String view = "";
		
		//request, response에서 온 데이터들을 그대로 넘겨주는 insert
		view = insert(request,response);
	
		// getServletContext : ServletContext얻어오고
		// .getRequestDispatcher : 이동할 경로 지정
		getServletContext().getRequestDispatcher("/ch09/"+view).forward(request, response);	
		// forward는 페이지 밖에서가 아닌 안에서 움직이기 때문에, 주소가 바뀌지는 않는다
	}
	//그리고 insert한 것을 DAO에 넘겨줘야함.
	
	//request 데이터 받아온 걸 -> DAO에 있는 insert 실행 -> 페이지명 studentinfo.jsp
	public String insert(HttpServletRequest request, HttpServletResponse response) {
		Student s = new Student();
		try {
			BeanUtils.populate(s, request.getParameterMap());// populate(객체의 이름, 파라메터들) 
			// request.getParameterMap을 통해 선언되었던 파라미터들을 hashmap형태로 가져온다.
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		//DAO에서 만든 객체는 각 pstmt.에 get을 사용해서 값을 넣어준다.
		// 값을 가져오고 싶을 때는 request.getParameter을 넣어둔다 (view - insert에 request, response 넣은 이유)
		//studentinfo 에 선언된 각 label별 name을 집어넣는다/

//		s.setUsername(request.getParameter("username"));
//		s.setEmail(request.getParameter("email"));
//		s.setUniv(request.getParameter("univ"));
//		s.setBirth(request.getParameter("birth"));
//		-> 일일이 받을 데이터를 입력하는 것을 대체해주는 라이브러리가 있다 (date도 일일이 바꿀거야?)
		// BeanUtils.populate(s, request.getParameterMap());
		
		// DB insert.
		dao.insert(s); //컨트롤러는 DAO에 있는 메소드를 사용한다. DAO한테 DB관련 요청을 해야한다.
		return "studentInfo.jsp";
	}
	
	
}
