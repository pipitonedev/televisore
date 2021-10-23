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

@WebServlet("/ExecuteModificaServlet")
public class ExecuteModificaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ExecuteModificaServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String destinazione = null;
		Long idTelevisore = Long.parseLong(request.getParameter("id"));
		String marcaTelevisore = request.getParameter("marcaInput");
		String modelloTelevisore = request.getParameter("modelloInput");
		int prezzoTelevisore = Integer.parseInt(request.getParameter("prezzoInput"));
		String serialNumberTelevisore = request.getParameter("serialNumberInput");
		 try {
			TelevisoreService televisoreServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();
			Televisore modificaTelevisore = new Televisore(idTelevisore, marcaTelevisore, modelloTelevisore,
					prezzoTelevisore, serialNumberTelevisore);
			televisoreServiceInstance.aggiorna(modificaTelevisore);
			destinazione = "searchForm.jsp";
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);
	}

}
