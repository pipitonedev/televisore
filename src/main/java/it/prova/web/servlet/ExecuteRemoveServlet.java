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

@WebServlet("/ExecuteRemoveServlet")
public class ExecuteRemoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ExecuteRemoveServlet() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Long idRichiesto = Long.parseLong(request.getParameter("id"));
		
		TelevisoreService televisoreServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();
		
		Televisore nuovoTelevisore = new Televisore();
		
		try {
			nuovoTelevisore = televisoreServiceInstance.caricaSingolo(idRichiesto);
			televisoreServiceInstance.rimuovi(nuovoTelevisore);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("searchForm.jsp");
		rd.forward(request, response);
	}

}
