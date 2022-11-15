

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public SecondServlet() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie c[] = request.getCookies();
		System.out.println([0].getValue());
		if(c[1].getValue().equals("admin")&&c[2].getValue().equals("ncuindia")) {
			response.getWriter().append("Secret Information");
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
