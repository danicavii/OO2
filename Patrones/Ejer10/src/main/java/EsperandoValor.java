public class EsperandoValor implements State {

    @Override
    public String getResultado(Calculadora calcu) {
        // Podría devolver el acumulado actual, no necesariamente error
        return String.valueOf(calcu.getValorAcumulado());
    }

    @Override
    public void borrar(Calculadora calcu) {
        calcu.setValorAcumulado(0);
        calcu.setOperacionPendiente(null);
        calcu.setState(new Normal());
    }

    @Override
    public void setValor(double unValor, Calculadora calcu) {
        switch (calcu.getOperacionPendiente()) {
            case SUMA:
                calcu.setValorAcumulado(calcu.getValorAcumulado() + unValor);
                break;
            case RESTA:
                calcu.setValorAcumulado(calcu.getValorAcumulado() - unValor);
                break;
            case MULTIPLICACION:
                calcu.setValorAcumulado(calcu.getValorAcumulado() * unValor);
                break;
            case DIVISION:
                if (unValor == 0) {
                    calcu.setState(new Error());
                    return;
                }
                calcu.setValorAcumulado(calcu.getValorAcumulado() / unValor);
                break;
        }
        calcu.setOperacionPendiente(null);
        calcu.setState(new Normal());
    }

    @Override
    public void mas(Calculadora calcu) { calcu.setState(new Error()); }
    @Override
    public void menos(Calculadora calcu) { calcu.setState(new Error()); }
    @Override
    public void por(Calculadora calcu) { calcu.setState(new Error()); }
    @Override
    public void div(Calculadora calcu) { calcu.setState(new Error()); }
}