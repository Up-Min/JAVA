package ch08;

import java.io.IOException;
import java.util.*;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/pcontrol")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// productservice 선언
    ProductService service;  
	
    //ServletConfig를 사용할 수 있는 init을 오버라이드 해옴.
    // servlet의 초기화를 담당하는 init 메소드 호출
    
    @Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		service = new ProductService(); 
		// init는 맨 처음 딱 한번만 선언된다. 그리고 선언된 new product를 공유한 상태에서 service형태로 사용하게 되는데,
		// 반복되는 작업을 막기 위해서 init를 오버라이드 하여 안에 service를 선언해준다.
		// 서블릿이 초기화 될 때 필드로 선언된 service를 이용, productservice를 객체를 생성해줌.
    }
    // 요청을 받아서 본인이 판단해서 do get이나 do post르 보내주는 service 호출 
    // 클라이언트에서 request가 오면 service가 실행된다. 
    // 서비스의 원래 역할은 들어오는게 get인지, post인지 확인 하는 역할인데,
    // 재정의를 했다는 것을 기억하자.
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 클라이언트에서 요청했을 때 값을 가져올 수 있는 getParameter
		String action = request.getParameter("action"); //action 파라미터의 값을 얻어온다.
		String view = "";
		
		if(action == null) {
			// 페이지 이동시키기
			// pcontrol안에 값이 없을경우, (최초인 경우에는) default 값으로 list를 나오게 한다.
			getServletContext().getRequestDispatcher("/pcontrol?action=list").forward(request, response);
		}else {
			// 액션에 대해!
			switch(action) {
				case "list" : view = list(request,response); break;
				case "info" : view = info(request,response); break;
			}
			getServletContext().getRequestDispatcher("/ch08/"+ view).forward(request, response);
		}
	}
	
	//request와 response를 받는 info, list 선언
	private String info(HttpServletRequest request, HttpServletResponse response) {
		// ProductService에 있는 find 메소드를 사용 시킬거임. (한가지 상품만!)
		// 그리고 가져오는 거는 productlist안에 있는 /jsp_study/pcontrol?action=info&id=${p.id}
		// 에서 가져올거임.
		Product prod = service.find(request.getParameter("id"));
		// key랑 value를 넣어준다.
		request.setAttribute("p", prod);
		return "productInfo.jsp";
		// view에는 productInfo.jsp가 들어간다.
	}
	private String list(HttpServletRequest request, HttpServletResponse response) {
		// ProductService에 있는 findAll 메소드를 사용 시킬거임. (모든 상품을!)
		List<Product> plist = service.findAll();
		request.setAttribute("products", plist);
		return "productList.jsp";
	}

}
