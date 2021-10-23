package it.prova.model;

public class Televisore {

	private Long id;
	private String marca;
	private String modello;
	private int prezzo;
	private String serialNumber;

	public Televisore() {

	}

	public Televisore(Long id, String marca, String modello, int prezzo, String serialNumber) {
		super();
		this.id = id;
		this.marca = marca;
		this.modello = modello;
		this.prezzo = prezzo;
		this.serialNumber = serialNumber;
	}

	public Televisore(String marca, String modello, int prezzo, String serialNumber) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.prezzo = prezzo;
		this.serialNumber = serialNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

}
