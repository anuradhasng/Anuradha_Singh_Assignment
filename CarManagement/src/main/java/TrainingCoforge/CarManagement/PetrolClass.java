package TrainingCoforge.CarManagement;

public class PetrolClass extends Car {
	public void engineType() {
		System.out.println("Engine type is petrol type");
	}
	
	public void audioSystem() {
		System.out.println("Audio System is with 6 speaker, woofers added");
	}
	
	public PetrolClass(String model) {
		super(model);
		
		
		
	}
	
	public void showWarrantyPolicy() {
		AddOns.warrantyPolicy();
	}
	

}
