package wtf.dannyslist;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.ServerContainer;

import com.sun.xml.internal.ws.api.policy.PolicyResolver.ServerContext;

/**
 * Servlet implementation class SearchEngine
 */
@WebServlet("/")
public class SearchEngine extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchEngine() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String nameString = request.getParameter("name");
		ArrayList<GameBean> gameBeanArrayList = new ArrayList<GameBean>();
		GameBean gameBean = new GameBean();
		gameBean.setNameString(nameString);
		GameDAO.findGame(gameBeanArrayList, gameBean);
		if (gameBeanArrayList.size() > 0) {
			request.getSession().setAttribute("gameBeanArrayList",
					gameBeanArrayList);
			response.sendRedirect("SearchResult.jsp");
		} else {
			request.getSession().setAttribute("gameBeanArrayList", null);
			response.sendRedirect("GetWalmartSearch");
		}
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

}
