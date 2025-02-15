package br.edu.senaisp.modelo;

public class Sala {
	private Integer nrSala;  
	private int capacidade;
	private String coordenacaoResp;
	
	
	
	public Sala(Integer nrSala, int capacidade, String coordenacaoResp) {
		super();
		this.nrSala = nrSala;
		this.capacidade = capacidade;
		this.coordenacaoResp = coordenacaoResp;
	}



	public Integer getNrSala() {
		return nrSala;
	}



	public void setNrSala(Integer nrSala) {
		this.nrSala = nrSala;
	}



	public int getCapacidade() {
		return capacidade;
	}



	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}



	public String getCoordenacaoResp() {
		return coordenacaoResp;
	}



	public void setCoordenacaoResp(String coordenacaoResp) {
		this.coordenacaoResp = coordenacaoResp;
	}
	
	


}
