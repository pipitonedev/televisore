package it.prova.service.televisore;

import java.util.List;

import it.prova.dao.televisore.TelevisoreDAO;
import it.prova.model.Televisore;

public class TelevisoreServiceImpl implements TelevisoreService{
	
	private TelevisoreDAO televisoreDAO;

	@Override
	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO) {
		this.televisoreDAO = televisoreDAO;
		
	}

	@Override
	public List<Televisore> cercaPerMarcaEModello(String marca, String modello) {
		
		return televisoreDAO.findByMarcaAndModello(marca, modello);
	}

	@Override
	public Televisore caricaSingolo(Long id) throws Exception {
		return televisoreDAO.get(id);
	}

	@Override
	public int inserisciNuovo(Televisore televisoreInstance) throws Exception {
		return televisoreDAO.insert(televisoreInstance);
	}

	@Override
	public List<Televisore> stampaLista() throws Exception {
		return televisoreDAO.list();
	}

	@Override
	public int aggiorna(Televisore televisoreInstance) throws Exception {
		return televisoreDAO.update(televisoreInstance);
	}

	@Override
	public int rimuovi(Televisore televisoreInstance) throws Exception {
		return televisoreDAO.delete(televisoreInstance);
	}



}
