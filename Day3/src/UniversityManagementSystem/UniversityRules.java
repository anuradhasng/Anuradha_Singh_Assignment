package UniversityManagementSystem;
 
public final class UniversityRules {
 
    static final int MIN_ATTENDANCE = 75;
    static final String UNIVERSITY_CODE = "CFG2026";
 
    static int hallTicketCounter = 1000;
 
    static String generateHallTicket() {
        hallTicketCounter++;
        return UNIVERSITY_CODE + hallTicketCounter;
    }
}
 