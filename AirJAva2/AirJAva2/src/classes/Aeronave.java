package classes;

public class Aeronave {
	private int id;
	private String modelo;
	private Passagens[][] lugares;
	private int numeroVOO;
	
	
	public Aeronave(String modelo, int fileiras, int assentos) {
		setModelo(modelo);
		this.lugares = new Passagens[fileiras][assentos];
	}
	
	public boolean verificaLugarOcupado(int fileiras, int assentos) {
		return this.lugares[fileiras][assentos] != null;
	}
	
	public String getModelo() {
		return modelo;
	}
	public Passagens getLugares(int fileiras, int assentos) {
		return this.lugares[fileiras][assentos];
	}
	public int getNumeroVOO() {
		return numeroVOO;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Passagens setLugares(Passagens passageiro, int fileiras, int assentos) {
		return this.lugares[fileiras][assentos] = passageiro;
	}
	public void setNumeroVOO(int numeroVOO) {
		this.numeroVOO = numeroVOO;
	}

	@Override
	public String toString() {
		return this.modelo;
	}
	
}
