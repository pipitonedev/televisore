package it.prova.service.televisore;

import java.util.List;

import it.prova.dao.televisore.TelevisoreDAO;
import it.prova.model.Televisore;

public interface TelevisoreService {
	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO);
	
	public List<Televisore> cercaPerMarcaEModello(String marca, String modello);
	
	public Televisore caricaSingolo(Long id) throws Exception;
	
	public int inserisciNuovo(Televisore televisoreInstance) throws Exception;
	
	public List<Televisore> stampaLista() throws Exception;
	
	public int aggiorna(Televisore televisoreInstance) throws Exception;
	
	public int rimuovi(Televisore televisoreInstance) throws Exception;
}
