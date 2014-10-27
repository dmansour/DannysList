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
import javax.servlet.http.HttpSession;
import javax.websocket.server.ServerContainer;

import org.apache.catalina.connector.Request;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * This is an overload of doGet this method is responsible for searching and saving the searches 
	 * that users make.  
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nameString = request.getParameter("name");
		ArrayList<GameBean> gameBeanArrayList = new ArrayList<GameBean>();
		GameBean gameBean = new GameBean();
		/* get  session to help find username */
		HttpSession httpSession = request.getSession(true);
		String usernameString =  (String)httpSession.getAttribute("username");
		
		gameBean.setNameString(nameString);
		GameDAO.findGame(gameBeanArrayList, gameBean, usernameString);
		request.getSession().setAttribute("gameBeanArrayList", gameBeanArrayList);
		response.sendRedirect("SearchResult.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
