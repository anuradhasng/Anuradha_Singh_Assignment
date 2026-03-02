package UniversityManagementSystem;
 
public class FinalExam extends ExamProcess {
 
    public FinalExam(String examCode) {
        super(examCode);
    }
 
    @Override
    void conductExam(Student std) {
        System.out.println("Conducting Final Examination for " + std.name);
    }
 
    @Override
    int evaluate(Student std) {
        System.out.println("Evaluating Final Exam Papers...");
        return 80;
    }
}
 