package UniversityManagementSystem;
 
public class LabExam extends ExamProcess {
 
    public LabExam(String examCode) {
        super(examCode);
    }
 
    @Override
    void conductExam(Student std) {
        System.out.println("Conducting Lab Practical for " + std.name);
    }
 
    @Override
    int evaluate(Student std) {
        System.out.println("Evaluating Lab Performance...");
        return 65;
    }
}
 