package TrainingCoforge.CarManagement;

public abstract class Car implements AddOns{
	private String model;
	public Car() {
		super();
	}
	public Car(String model) {
		super();
		this.model=model;
	}
	
	public abstract void engineType();
	
	public void showModel() {
		System.out.println("Model :"+this.model);
	}
	
	

}
