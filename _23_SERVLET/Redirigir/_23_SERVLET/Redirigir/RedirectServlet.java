package _23_SERVLET.Redirigir;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class RedirectServlet extends HttpServlet{
	public void doPost (HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		redirect (request, response);
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		redirect (request, response);
	}
	
	/**
	 * establecer algunos parametros y objetos URL para la peticion 
	 * y ver lo que les sucede durante un redirecionamiento
	 */
	
	@SuppressWarnings("deprecation")
	protected void redirect (HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException{
		
		log ("llego una solicitud de " + req.getServletPath());
		
		req.setAttribute("Primer nombre", "John");
		req.setAttribute("Apellido", "Doe");
		
		String contextPath = req.getContextPath();
		String redirectStr = contextPath + "/result.jsp?username=foo&password=bar";
		log ("redirecting to "+redirectStr);
		
		//Llame siempre al metodo encodeRedirectURL cuando realice
		// un redireccionamiento
		resp.sendRedirect(resp.encodeRedirectUrl(redirectStr));
	}

}
