import java.time.Duration;
import java.time.LocalDateTime;

public class Pending implements Estado{

	public  void Star(ToDoItem item) {
		item.setStarTime(LocalDateTime.now());
		System.out.println(item.getName()+"Cambiando a InProgess");
		item.setEstado(new InProgress());
		
	}
	public  void TogglePause(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en in-progress o paused");

	}
	public  void Finish(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en in-progress o paused");
	}
	public Duration WorkTime(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no esta iniciado");
	}
	public  void addComent( String comment) {
		System.out.println(comment);
	}
}
