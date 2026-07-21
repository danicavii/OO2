import java.time.Duration;
import java.time.LocalDateTime;

public class ToDoItem {
	private String name;
	private Estado estado;
	private LocalDateTime startTime;
	
	public ToDoItem(String name) {
		this.setName(name);
		this.estado= new Pending();
	}
	
	public void Star() {
		this.estado.Star(this);
	}
	public void TogglePause() {
		this.estado.TogglePause(this);
	}
	public void Finish() {
		this.estado.Finish(this);
	}
	public Duration WorkTime() {
		return this.estado.WorkTime(this);
	}
	public void addComent(String comment) {
		this.estado.addComent(comment);
	}
	
	protected void setEstado(Estado estado) {
		this.estado= estado;
	}
	protected void setStarTime(LocalDateTime t) {
		this.startTime= t;
	}

	protected LocalDateTime getStartTime() {
		return this.startTime;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

}
