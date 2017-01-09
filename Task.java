
public class Task implements Priority, Complexity, Comparable<Task> {
	
	private int priority;
	private int complexity;
	private String desc;
	
	public Task(int priority, int complexity, String desc){
		this.priority = priority;
		this.complexity = complexity;
		this.desc = desc;
	}	
	
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public void setComplexity(int complexity) {
		this.complexity = complexity;
	}
	
	public int getComplexity() {
		return complexity;
	}
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int compareTo(Task other) {
		return this.priority - other.priority;
	}
	
	public String toString(){
		return priority + " " + complexity + " " + desc;
	}
}
