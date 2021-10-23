package it.prova.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import it.prova.model.Televisore;

public class DB_Mock {
	
	public static final List<Televisore> LISTA_TELEVISORI = new ArrayList<>();
	
	static {
		
		LISTA_TELEVISORI.add(new Televisore(1L, "lg", "olead", 550, "AXYT654FD"));
		LISTA_TELEVISORI.add(new Televisore(2L, "lg", "4k curve", 890, "STU655FD"));
		LISTA_TELEVISORI.add(new Televisore(3L, "lg", "mini 1080", 260, "8VFTR65FD"));
		LISTA_TELEVISORI.add(new Televisore(4L, "samsung", "tv led", 200, "M4R6T4FD"));
		LISTA_TELEVISORI.add(new Televisore(5L, "samsung", "8k", 1450, "Q950R"));
		LISTA_TELEVISORI.add(new Televisore(6L, "lg", "olead smart tv ultra", 1200, "R1STU4"));
		LISTA_TELEVISORI.add(new Televisore(7L, "philips", "smart tv wifi", 380, "6060S"));
		LISTA_TELEVISORI.add(new Televisore(8L, "samsung", "android tv", 800, "Q60A"));
		LISTA_TELEVISORI.add(new Televisore(9L, "sony", "bravia olead", 1399, "A8S"));
		LISTA_TELEVISORI.add(new Televisore(10L, "sony", "4k ultra", 900, "XH80"));	
	}
	
	public static Long getNextIdAvailable() {
		
		Long resultId = null;
		if(LISTA_TELEVISORI == null || LISTA_TELEVISORI.isEmpty()) {
			resultId = 1L;
		}
		
		resultId=LISTA_TELEVISORI.stream().max(Comparator.comparing(Televisore::getId)).get().getId();
		return ++resultId;
		
	}

}
