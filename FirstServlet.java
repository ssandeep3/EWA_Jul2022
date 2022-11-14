

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet
	 (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		PrintWriter wr = response.getWriter();
		wr.append("<form>");
		wr.append("<label>Name:</label>");
		wr.append("<input type='text' name='nmBox'>");
		wr.append("<label>Roll No.:</label>");
		wr.append("<input type='text' name='rnBox'>");
		wr.append("<input type='submit'>");
		wr.append("</form>");
		String name = request.getParameter("nmBox");
		String rollno = request.getParameter("rnBox");
		System.out.println("Name="+name+" Roll No.:"+rollno);
		*/
		response.sendRedirect("second_servlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("nBox");
		String passwd = request.getParameter("pwd");
		System.out.println("UserName:"+name+" Password:"+passwd);
		//PrintWriter wr = response.getWriter();
		response.getWriter().append("USername:"+name+" Password:"+passwd);
		
	}

}
