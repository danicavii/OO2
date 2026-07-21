import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;


public class Excursion {
	private List<Usuario> usuarios= new ArrayList<>();
	private List<Usuario> listaEspera = new ArrayList<>();
	private State estado;
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private int cupoMaximo;
	private int cupoMinimo;
	private double costo;
	
	public Excursion(String n, LocalDate f1, LocalDate f2, String p, int cm,int cmin,double c) {
		this.estado= new Provisoria();
		this.nombre=n;
		this.fechaInicio=f1;
		this.fechaFin=f2;
		this.puntoEncuentro=p;
		this.cupoMaximo=cm;
		this.cupoMinimo=cmin;
		this.costo=c;
	}
	
	
	public void setEstado(State estado) {
		this.estado=estado;
	}
	
	public State getEstado() {
		return this.estado;
	}
	public String informacion() {
		return this.estado.informacion(this);
	}
	public void inscribirUsuario(Usuario u) {
		this.estado.inscribirUsuario(this, u);
	}
	
	public int usuariosFaltanteMinimo() {
		return this.cupoMinimo- this.usuarios.size();
	}
	public int usuariosFaltanteMaximo() {
		return this.cupoMaximo- this.usuarios.size();
	}
	
	
	public List<Usuario> getListaEspera() {
		return this.listaEspera;
	}
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}
	public void setPuntoEncuentro(String puntoEncuentro) {
		this.puntoEncuentro = puntoEncuentro;
	}
	public int getCupoMaximo() {
		return cupoMaximo;
	}
	public void setCupoMaximo(int cupoMaximo) {
		this.cupoMaximo = cupoMaximo;
	}
	public int getCupoMinimo() {
		return cupoMinimo;
	}
	public void setCupoMinimo(int cupoMinimo) {
		this.cupoMinimo = cupoMinimo;
	}
	public double getCosto() {
		return this.costo;
	}
	
	
	
	
}
