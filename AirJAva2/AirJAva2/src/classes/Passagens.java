package classes;

public class Passagens {
	protected String origem;
	protected String destino;
	protected String data;
	protected String hora;
	protected String[][] assentos;
	
	
	
	public Passagens(String origem, String destino, String data, String hora, String[][] assentos) {
		setOrigem(origem);
		setDestino(destino);
		setData(data);
		setHora(hora);
		setAssentos(assentos);
	}
	
	public String getOrigem() {
		return origem;
	}
	public String getDestino() {
		return destino;
	}
	public String getData() {
		return data;
	}
	public String getHora() {
		return hora;
	}
	public String[][] getAssentos() {
		return assentos;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public void setData(String data) {
		this.data = data;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public void setAssentos(String[][] assentos) {
		this.assentos = assentos;
	}
	
	
}
