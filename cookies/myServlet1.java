import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class myServlet1
 */
public class myServlet1 extends HttpServlet {
//	LinkedList<myData> myArray = new <myData>LinkedList();
	private static final long serialVersionUID = 1L;
       
    public myServlet1() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("nBox");
		String passwd = request.getParameter("pwd");
		System.out.println(uname+"  "+passwd);
		response.getWriter().append("Hello "+uname);
		Cookie c1 = new Cookie("user",uname);
		Cookie c2 = new Cookie("passwd",passwd);
		response.addCookie(c1); response.addCookie(c2);
		if(uname.equals("admin")&& passwd.equals("ncuindia")) {
			response.sendRedirect("SecondServlet");
		}
		else {
//			response.getWriter().append("Wrong Username or Password");
			response.sendRedirect("index.jsp");
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}
}

