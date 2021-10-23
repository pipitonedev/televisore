package it.prova.dao.televisore;

import java.sql.Connection;
import java.util.List;

import it.prova.dao.IBaseDAO;
import it.prova.model.Televisore;

public interface TelevisoreDAO extends IBaseDAO<Televisore> {
	public void setConnection(Connection connection);
	
	public List<Televisore> findByMarcaAndModello(String marca, String modello);

}
