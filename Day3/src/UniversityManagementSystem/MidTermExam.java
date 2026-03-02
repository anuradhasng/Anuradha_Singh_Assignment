package UniversityManagementSystem;
 
public class MidTermExam extends ExamProcess {
 
    public MidTermExam(String examCode) {
        super(examCode);
    }
 
    @Override
    void conductExam(Student std) {
        System.out.println("Conducting Mid-Term Examination for " + std.name);
    }
 
    @Override
    int evaluate(Student std) {
        System.out.println("Evaluating Mid-Term Answer Sheets...");
        return 55;
    }
}
 