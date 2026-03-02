package UniversityManagementSystem;
 
public class UniversityExamMain {
 
    public static void main(String[] args) {
 
        Student s1 = new Student("101", "Anuradha", 90);
        Student s2 = new Student("102", "Agrima", 70);
 
        ExamProcess mid = new MidTermExam("MID101");
        ExamProcess lab = new LabExam("LAB202");
        ExamProcess fin = new FinalExam("FIN303");
 
        System.out.println("----- MID TERM EXAM -----");
        mid.startExam(s1);
 
        System.out.println("\n----- LAB EXAM -----");
        lab.startExam(s2);
 
        System.out.println("\n----- FINAL EXAM -----");
        fin.startExam(s1);
    }
}
 