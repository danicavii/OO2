
public interface State {
	
	public abstract String getResultado(Calculadora calcu);
	public abstract void borrar(Calculadora calcu);
	public abstract void setValor(double valor,Calculadora Calcu);
	public abstract void mas(Calculadora calcu);
	public abstract void menos(Calculadora calcu);
	public abstract void div(Calculadora calcu);
	public abstract void por(Calculadora calcu);
}
