package TrainingCoforge.Project;

public interface MyInterface {
	public void display();
	
	public default void printDetails() {
		
		System.out.println("default method of MyInterface invoked");
	}

}
