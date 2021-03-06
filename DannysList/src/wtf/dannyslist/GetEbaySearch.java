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
@WebServlet("/GetEbaySearch")
public class GetEbaySearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetEbaySearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Scanner scanner = null;
		HttpURLConnection conn = null;

		HttpSession session = request.getSession(true);
		ArrayList<GameBean> search_array = (ArrayList<GameBean>) session.getAttribute("search_array");
		String whattosearch = (String) session.getAttribute("searchterm");
		String safestring = whattosearch.replaceAll("\\s", "%20");   
		String currUser = (String) session.getAttribute("username");
		//URL url = new URL("http://walmartlabs.api.mashery.com/v1/search?query=" + safestring +"&format=xml&apiKey=uj8kf4z6aa83gb9dgs6tdmj2");
		// Construct the request
		// Replace MyAppID with your Production AppID
		String eurl = "http://svcs.ebay.com/services/search/FindingService/v1?OPERATION-NAME=findItemsByKeywords&SERVICE-VERSION=1.0.0&SECURITY-APPNAME=DannysLi-c6ed-490b-9aec-4082453768e5&GLOBAL-ID=EBAY-US&RESPONSE-DATA-FORMAT=XML&REST-PAYLOAD&keywords=" + safestring +"%20Video%20game&paginationInput.entriesPerPage=3&sortOrder=BestMatch";
		URL url = new URL(eurl);
		StringBuilder jsonSB = new StringBuilder();
		conn = (HttpURLConnection) url.openConnection();
		InputStream in = new BufferedInputStream(conn.getInputStream());
		scanner = new Scanner(in);
		while (scanner.hasNext()) jsonSB.append(scanner.nextLine());
		File file = new File("xmls/" + currUser + "_ebaysearch.xml");
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		System.out.println(file.getAbsolutePath());
		session.setAttribute(currUser + "ebay_search", file.getAbsolutePath());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(jsonSB.toString());
		scanner.close();
		conn.disconnect();
		bw.close();
		
		XStream xstream = new XStream();
		xstream.processAnnotations(EbaySearchResponse.class);
				
		Object obj = xstream.fromXML(new File(file.getAbsolutePath()));
		
		EbaySearchResponse esr = (EbaySearchResponse) obj;
		EbayResponseItems eri = esr.getItemsList();
		List<EbayGame> lwg = eri.getEbayList();
		if(lwg != null){
		Iterator it = lwg.iterator();
		while(it.hasNext()){
			GameBean gb = new GameBean();
			
			EbayGame egame = (EbayGame) it.next();
			gb.setCostDouble(egame.getPrice());
			gb.setLinkString(egame.getURL());
			gb.setPlatformIDInt("1");
			gb.setSource("Ebay");
			gb.setSearchTerm(whattosearch);
			gb.setNameString(egame.getTitle());
			gb.setYearInt(2014);
			//GameDAO.addGame(gb);
			search_array.add(gb);
			//System.out.println(gb.getCostDouble());
		}
		}
		
		session.setAttribute("search_array", search_array);
		response.sendRedirect("searchpage.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
