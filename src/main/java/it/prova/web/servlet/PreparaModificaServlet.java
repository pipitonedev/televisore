package it.prova.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.model.Televisore;
import it.prova.service.MyServiceFactory;
import it.prova.service.televisore.TelevisoreService;

@WebServlet("/PreparaModificaServlet")
public class PreparaModificaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public PreparaModificaServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idRichiesto = request.getParameter("idDaInviareComeParametro");
		
		TelevisoreService televisoreServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();
		
		try {
			Televisore risultato = televisoreServiceInstance.caricaSingolo(Long.parseLong(idRichiesto));
			
			request.setAttribute("televisoreDaInviare", risultato);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		RequestDispatcher rd = request.getRequestDispatcher("modificaTelevisore.jsp");
		rd.forward(request, response);
		
		
	}


}
