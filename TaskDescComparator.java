import java.util.Comparator;

public class TaskDescComparator implements Comparator<Task> {

	@Override
	public int compare(Task t1, Task t2) {
		return t1.getDesc().compareTo(t2.getDesc());
	}

}
