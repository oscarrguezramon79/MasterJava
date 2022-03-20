


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class HolaMundo extends HttpServlet {
	
	protected void procesarPeticion(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
       
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet HolaMundo</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet HolaMundo at " + request.getContextPath () + "</h1>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
    

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        procesarPeticion(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        procesarPeticion(request, response);
    }
    
    public String getServletInfo() {
        return "Servlet HolaMundo";
    }
}
