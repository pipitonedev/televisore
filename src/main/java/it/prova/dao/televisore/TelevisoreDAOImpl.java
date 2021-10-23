package it.prova.dao.televisore;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import it.prova.dao.DB_Mock;
import it.prova.model.Televisore;

public class TelevisoreDAOImpl implements TelevisoreDAO {

	private Connection connection;

	@Override
	public List<Televisore> findByMarcaAndModello(String marca, String modello) {
		List<Televisore> result = new ArrayList<>();

		for (Televisore televisoreItem : DB_Mock.LISTA_TELEVISORI) {
			if (televisoreItem.getMarca().startsWith(marca) && televisoreItem.getModello().startsWith(modello))
				result.add(televisoreItem);
		}
		return result;
	}

	@Override
	public List<Televisore> list() throws Exception {
		return DB_Mock.LISTA_TELEVISORI;
	}

	@Override
	public Televisore get(Long id) throws Exception {
		for(Televisore televisoreItem: DB_Mock.LISTA_TELEVISORI) {
			if(televisoreItem.getId() == id) {
				return televisoreItem;
			}
		}
		
		return null;
	}

	@Override
	public int update(Televisore input) throws Exception {
		for(Televisore televisoreItem: DB_Mock.LISTA_TELEVISORI) {
			if(televisoreItem.getId() == input.getId()) {
				televisoreItem.setMarca(input.getMarca());
				televisoreItem.setModello(input.getModello());
				televisoreItem.setPrezzo(input.getPrezzo());
				televisoreItem.setSerialNumber(input.getSerialNumber());
				return 1;
			}
		}
		
		return 0;
	}

	@Override
	public int insert(Televisore input) throws Exception {
		input.setId(DB_Mock.getNextIdAvailable());
		return DB_Mock.LISTA_TELEVISORI.add(input) ? 1 : 0;
	}

	@Override
	public int delete(Televisore input) throws Exception {
		return DB_Mock.LISTA_TELEVISORI.remove(input) ? 1 : 0;
	}

	@Override
	public void setConnection(Connection connection) {
		// TODO Auto-generated method stub

	}

}
