import java.util.*;

public class TaskComplexityComparator implements Comparator<Task> {
	
	public int compare(Task t1, Task t2) {
		return t1.getComplexity() - t2.getComplexity();
	}
}
