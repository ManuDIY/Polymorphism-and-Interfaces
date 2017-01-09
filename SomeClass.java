
public class SomeClass implements Priority {

	private int priority;
	
	@Override
	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public int getPriority() {
		return priority;
	}

}
