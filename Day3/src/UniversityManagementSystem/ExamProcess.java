package UniversityManagementSystem;
 
public abstract class ExamProcess {
 
    static final int PASS_MARKS = 40;
    final String examCode;
 
    public ExamProcess(String examCode) {
        this.examCode = examCode;
    }
 
    boolean validateEligibility(Student std) {
        return std.attendPer >= UniversityRules.MIN_ATTENDANCE;
    }
 
    String generateHallTicket() {
        return UniversityRules.generateHallTicket();
    }
 
    abstract void conductExam(Student std);
 
    abstract int evaluate(Student std);
 
    final void publishResult(Student std, int marks) {
        if (marks >= PASS_MARKS) {
            System.out.println(std.name + " PASSED with Marks: " + marks);
        } else {
            System.out.println(std.name + " FAILED with Marks: " + marks);
        }
    }
 
    final void startExam(Student std) {
 
        if (!validateEligibility(std)) {
            System.out.println(std.name + " is not eligible due to low attendance.");
            return;
        }
 
        String hallTicket = generateHallTicket();
        System.out.println("Hall Ticket Generated: " + hallTicket);
 
        conductExam(std);
        int marks = evaluate(std);
        publishResult(std, marks);
    }
}
 