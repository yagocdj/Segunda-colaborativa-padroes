package br.edu.ifpb.pps.baralho;


public enum Cor {
	//
	VERMELHO("\u001B[31m","vermelho"),
	PRETO("\u001B[30m", "preto"),
	AMARELO("\u001B[33m", "amarelo"),
	VERDE("\u001B[32m", "verde"),
	RESET("\u001B[0m", "reset");
	
	private final String ansiCode;
	private final String value;

	Cor(String ansiCode, String cor) {
		this.ansiCode = ansiCode;
		this.value = cor;
	}
	public String ansiCode() {
		return this.ansiCode;
	}
	
	public String getValue() {
		return this.value;
	}
}
