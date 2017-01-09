import java.util.*;

public class TaskPriorityComplexityComparator implements Comparator<Task> {
	
	public int compare(Task t1, Task t2) {
		int result = t1.getPriority() - t2.getPriority();
		if (result == 0) {
			return t1.getComplexity() - t2.getComplexity();
		}
		return result;
	}
}
