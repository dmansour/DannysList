package wtf.dannyslist;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Scanner scanner = null;
		HttpURLConnection conn = null;
		String whattosearch = request.getParameter("search");
		String safestring = whattosearch.replaceAll("\\s", "+");
		URL url = new URL("http://walmartlabs.api.mashery.com/v1/search?query=" + safestring +"&format=xml&apiKey=uj8kf4z6aa83gb9dgs6tdmj2");
		StringBuilder jsonSB = new StringBuilder();
		conn = (HttpURLConnection) url
				.openConnection();
		//conn.setRequestProperty("Originating=Ip","50.180.120.58");
		InputStream in = new BufferedInputStream(conn.getInputStream());
		scanner = new Scanner(in);
		while (scanner.hasNext()) jsonSB.append(scanner.nextLine());
		File file = new File("walmartsearch.xml");
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		System.out.println(file.getAbsolutePath());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(jsonSB.toString());
		scanner.close();
		conn.disconnect();
		bw.close();
		response.sendRedirect("searchpage.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
