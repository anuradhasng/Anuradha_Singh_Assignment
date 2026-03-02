package TrainingCoforge.CarManagement;

public interface AddOns {
	public default void audioSystem() {
		System.out.println("Audio System, by default 2 speaker");
	}
	
	public default void roofOpen() {
		System.out.println("By default roof open disabled");
	}

	public static void warrantyPolicy() {
		System.out.println("Validity of warranty policy");
		
	}

}
