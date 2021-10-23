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

@WebServlet("/ExecuteInsertServlet")
public class ExecuteInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ExecuteInsertServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String destinazione = null;

		String marcaTelevisore = request.getParameter("marcaInput");
		String modelloTelevisore = request.getParameter("modelloInput");
		String prezzoTelevisore = request.getParameter("prezzoInput");
		String serialNumberTelevisore = request.getParameter("serialNumberInput");

		if (marcaTelevisore.equals("") || modelloTelevisore.equals("") || prezzoTelevisore.equals("")
				|| serialNumberTelevisore.equals("")) {
			String messaggio = "Attenzione! E' necessario valorizzare tutti i campi.";
			request.setAttribute("messaggioDiErrore", messaggio);
			destinazione = "inserisciTelevisore.jsp";
		} else {
			try {
				int prezzo = Integer.parseInt(prezzoTelevisore);
				Televisore inserisciTelevisore = new Televisore(marcaTelevisore, modelloTelevisore, prezzo,
						serialNumberTelevisore);
				MyServiceFactory.getTelevisoreServiceInstance().inserisciNuovo(inserisciTelevisore);
				request.setAttribute("listTelevisoriAttributo",
						MyServiceFactory.getTelevisoreServiceInstance().stampaLista());
				destinazione = "results.jsp";
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);

	}

}
