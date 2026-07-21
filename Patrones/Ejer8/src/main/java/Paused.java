import java.time.Duration;
import java.time.LocalDateTime;

public class Paused implements Estado{
	
	public  void Star(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pending ");
	}
	public  void TogglePause(ToDoItem item) {
		System.out.println(item.getName()+"Cambiando a InProgress");
		item.setEstado(new InProgress());
	}
	public  void Finish(ToDoItem item) {
		System.out.println(item.getName()+"Cambiando a Finished");
		item.setEstado(new Finished());
		
	}
	public Duration WorkTime(ToDoItem item) {
		return Duration.between(item.getStartTime(), LocalDateTime.now());
	}
	public  void addComent( String comment) {
		System.out.println(comment);
	}
}
