import java.time.Duration;
import java.time.LocalDateTime;

public class Finished implements Estado{

	public  void Star(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pending ");
	}
	public  void TogglePause(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en InProgress/Paused ");
	}
	public  void Finish(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem ya esta en Finished ");
	}
	public Duration WorkTime(ToDoItem item) {
		return Duration.between(item.getStartTime(), LocalDateTime.now());
	}
	public  void addComent(String comment) {
		throw new RuntimeException("El objeto ToDoItem esta en Finished, no se puede comentar");	}
}
