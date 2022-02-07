package modelo.destino;

public class Destino {

	private int numeroBilhete;
	private String origem;
	private String destino;
	private String dataEmbarque;
	private String horarioEmbarque;
	
	public int getNumeroBilhete() {
		return numeroBilhete;
	}
	
	public void setNumeroBilhete(int numeroBilhete) {
		this.numeroBilhete = numeroBilhete;
	}
	
	public String getOrigem() {
		return origem;
	}
	
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public String getDataEmbarque() {
		return dataEmbarque;
	}
	
	public void setDataEmbarque(String dataEmbarque) {
		this.dataEmbarque = dataEmbarque;
	}
	
	public String getHorarioEmbarque() {
		return horarioEmbarque;
	}
	
	public void setHorarioEmbarque(String horarioEmbarque) {
		this.horarioEmbarque = horarioEmbarque;
	}
	
}
