
public class Error implements State{
	
	public String getResultado(Calculadora calcu) {
		return "Error";
	}
	
	public void borrar(Calculadora calcu) {
		calcu.setValorAcumulado(0);
		calcu.setValor(0);
		calcu.setState(new Normal());
	}
	
	public void setValor(double unvalor, Calculadora calcu) {
		
	}
	public void mas(Calculadora calcu) {calcu.setState(new Error());}
	public void	menos(Calculadora calcu) {calcu.setState(new Error());}
	public void	div(Calculadora calcu) {calcu.setState(new Error());}
	public void por(Calculadora calcu) {calcu.setState(new Error());}
}
