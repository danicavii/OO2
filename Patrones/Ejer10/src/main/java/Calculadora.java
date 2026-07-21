
public class Calculadora {
	private Operacion operacionPendiente;
	private double valorAcumulado;
	private State estado;
	
	public Calculadora() {
		this.estado = (State) new Normal();
	}
	
	
	public String getResultado() {
		return this.estado.getResultado(this);
	}
	
	public void borrar() {
		this.estado.borrar(this);
	}
	
	public void setValor(double nueValor) {
		this.estado.setValor(nueValor, this);
	}
	public void mas() {
		this.estado.mas(this);
	}
	public void menos() {
		this.estado.menos(this);
	}
	public void div() {
		this.estado.div(this);
	}
	public void por() {
		this.estado.por(this);
	}
	

	//getters setters
	public void setState(State nueEstado) {
		this.estado= nueEstado;
	}

	public Operacion getOperacionPendiente() {
		return operacionPendiente;
	}


	public void setOperacionPendiente(Operacion operacionPendiente) {
		this.operacionPendiente = operacionPendiente;
	}


	public double getValorAcumulado() {
		return valorAcumulado;
	}


	public void setValorAcumulado(double valorAcumulado) {
		this.valorAcumulado = valorAcumulado;
	}

}

	