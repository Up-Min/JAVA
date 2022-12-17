package qq;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistController
 */
@WebServlet("/RControl")
public class RegistController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RegistService Regist;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		Regist = new RegistService();
	}

	@Override
    	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		String action = request.getParameter("action");
    		String view = "";   		
    		if(action == null) {
    			getServletContext().getRequestDispatcher("/RControl?action=list").forward(request, response);
    		}else {
    			switch (action) {
				case "list": view = list(request, response); break;
				case "info": view = info(request, response); break;
				case "confirm" : view = confirm(request, response); break;
    		}
    		getServletContext().getRequestDispatcher("/qq/"+view).forward(request, response);	
    		}
    	}

	public String info(HttpServletRequest request, HttpServletResponse response) {
		Regist info = Regist.find(request.getParameter("id"));
		request.setAttribute("Info", info);
		return "registInfo.jsp";
	}
    		
	public String list(HttpServletRequest request, HttpServletResponse response) {
		List<Regist> list = Regist.findAll();
		request.setAttribute("List", list);
		return "registList.jsp";	
	}
    	
	public String confirm (HttpServletRequest request, HttpServletResponse response) {
		List<Regist> list = Regist.findAll();
		request.setAttribute("List", list);
		return "registConfirm.jsp";
	}
    	
	
}
