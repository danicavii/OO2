
public class Normal implements State {
	
	public String getResultado(Calculadora calcu) {
		if(calcu.getOperacionPendiente()== null) {
			return "No hay op";
		}else {
			return "mismo valor";
		}
	}
	
	public void borrar(Calculadora calcu) {
		calcu.setValorAcumulado(0);
		calcu.setValor(0);
	}
	
	public void setValor(double unvalor, Calculadora calcu) {
		calcu.setValor(unvalor);
	}
	
	public void mas(Calculadora calcu) {
		calcu.setOperacionPendiente(Operacion.SUMA);
		calcu.setState(new EsperandoValor());
	}
	public void menos(Calculadora calcu) {
		calcu.setOperacionPendiente(Operacion.RESTA);
		calcu.setState(new EsperandoValor());
	}
	public void por(Calculadora calcu) {
		calcu.setOperacionPendiente(Operacion.MULTIPLICAION);
		calcu.setState(new EsperandoValor());
	}
	public void div(Calculadora calcu) {
		calcu.setOperacionPendiente(Operacion.DIVISION);
		calcu.setState(new EsperandoValor());
	}
}
