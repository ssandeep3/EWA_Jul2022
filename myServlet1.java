

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class myServlet1
 */
public class myServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("<h1>This is my first Servlet</h1>");
		String param1 =""; 
		response.getWriter().append("<form>"
				+ "	<label>Name:</label> <input type='text' name='nmBox'>"
				+ "	<label>Roll No.:</label> <input type='text' name='rnBox'>"
				+ "	<input type='submit'>"
				+ "</form>");
		param1 = request.getParameter("param1");
		String p2 = request.getParameter("p2");
		String p3 = request.getParameter("p3");
		System.out.println(param1+" "+p2+" "+p3);
		String name = request.getParameter("nmBox");
		String rollno = request.getParameter("rnBox");
		response.getWriter().append("<table style='border:5px solid blue'><tr><td style='border:2px solid red'>Name</td><td style='border:2px solid red'>Roll No</td></tr>");
		response.getWriter().append("<tr><td style='border:2px solid red'>"+name+"</td>   <td style='border:2px solid red'>"+rollno+"</td></tr></table");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
