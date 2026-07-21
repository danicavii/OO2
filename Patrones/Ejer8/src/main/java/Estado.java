import java.time.Duration;

public interface Estado {

	public abstract void Star(ToDoItem item);
	public abstract void TogglePause(ToDoItem item);
	public abstract void Finish(ToDoItem item);
	public abstract Duration WorkTime(ToDoItem item);
	public abstract void addComent( String comment);
}
