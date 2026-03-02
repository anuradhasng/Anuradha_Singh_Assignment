package TrainingCoforge.Project;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        MyInterface mi=new DemoClass();
        mi.display();
        mi.printDetails();
        mi=new HelloJava();
        mi.display();
    }
}
