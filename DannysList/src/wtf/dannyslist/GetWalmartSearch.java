package wtf.dannyslist;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.thoughtworks.xstream.XStream;

/**
 * Servlet implementation class GetWalmartSearch
 */
@WebServlet("/GetWalmartSearch")
public class GetWalmartSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetWalmartSearch() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Scanner scanner = null;
		HttpURLConnection conn = null;
		String whattosearch = request.getParameter("search");
		String safestring = whattosearch.replaceAll("\\s", "+");
		HttpSession session = request.getSession(true);
		String currUser = (String) session.getAttribute("username");
		URL url = new URL("http://walmartlabs.api.mashery.com/v1/search?query="
				+ safestring + "&format=xml&apiKey=uj8kf4z6aa83gb9dgs6tdmj2");
		StringBuilder jsonSB = new StringBuilder();
		conn = (HttpURLConnection) url.openConnection();
		InputStream in = new BufferedInputStream(conn.getInputStream());
		scanner = new Scanner(in);
		while (scanner.hasNext())
			jsonSB.append(scanner.nextLine());
		File file = new File("xmls/" + currUser + "_walmartsearch.xml");
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		System.out.println(file.getAbsolutePath());
		session.setAttribute(currUser + "walmart_search",
				file.getAbsolutePath());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(jsonSB.toString());
		scanner.close();
		conn.disconnect();
		bw.close();

		XStream xstream = new XStream();
		xstream.processAnnotations(WalmartSearchResponse.class);

		Object obj = xstream.fromXML(new File(file.getAbsolutePath()));

		WalmartSearchResponse wsr = (WalmartSearchResponse) obj;
		WalmartResponseItems wri = wsr.getItemsList();
		List<WalmartGame> lwg = wri.getWalmartList();
		ArrayList<GameBean> search_array = new ArrayList<GameBean>();

		Iterator it = lwg.iterator();
		while (it.hasNext()) {
			GameBean gb = new GameBean();

			WalmartGame wgame = (WalmartGame) it.next();
			gb.setCostDouble(wgame.getSalePrice());
			gb.setLinkString(wgame.getProductUrl());
			gb.setPlatformIDInt("1");
			gb.setNameString(wgame.getName().replace("'", "''"));
			gb.setYearInt(2014);
			gb.setSource("walmart");
			gb.setSearchTerm(whattosearch);
			if (gb.getNameString().contains("(PS4)")
					|| gb.getNameString().contains("(PS3)")
					|| gb.getNameString().contains("(PS2)")
					|| gb.getNameString().contains("(Wii)")
					|| gb.getNameString().contains("(Wii U)")
					|| gb.getNameString().contains("(Xbox)")
					|| gb.getNameString().contains("(Xbox 360)")
					|| gb.getNameString().contains("(Xbox One)")
					|| gb.getNameString().contains("(PC)")) {
				GameDAO.addGame(gb);
				search_array.add(gb);
			}
			// System.out.println(gb.getCostDouble());
		}

		session.setAttribute("searchterm", whattosearch);
		session.setAttribute("search_array", search_array);
		// response.sendRedirect("searchpage.jsp");
		response.sendRedirect("GetEbaySearch");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
