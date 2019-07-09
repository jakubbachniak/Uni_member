package coursework1;

/**
 *
 * @author Jakub Bachniak
 */
public class TermSingleton {
    
    private Professor professor;
    private Lecturer lecturer;
    
    private static TermSingleton termSingletonUniqueInstance;
    
    TermRunningClassesSingleton runningClasses;
    TermTeachingStaffSingleton activeTeachingStaff;
    TermEnrolledStudentsSingleton enrolledStudents;
    TermResearchersSingleton activeResearchers;
    TermAreasOfExpertiseSingleton termAreasOfExpertise;
    TermAppointmentScheduleSingleton termAppointmentSchedule;
    
    
    private TermSingleton() {
        
        runningClasses = TermRunningClassesSingleton.getInstance();
        activeTeachingStaff = TermTeachingStaffSingleton.getInstance();
        enrolledStudents = TermEnrolledStudentsSingleton.getInstance();
        activeResearchers = TermResearchersSingleton.getInstance();
        termAreasOfExpertise = TermAreasOfExpertiseSingleton.getInstance();
        termAppointmentSchedule = TermAppointmentScheduleSingleton.getInstance();
        
    }
    
    public static TermSingleton getInstance() {
        if(termSingletonUniqueInstance == null) {
            termSingletonUniqueInstance = new TermSingleton();
        }
        return termSingletonUniqueInstance;
    }
    
    // get total number of students enrolled on classes
    public int getTotalEnrollments() {
        int totalEnrollments = 0;
        for(Class item : runningClasses.getRunningClasses()) {
            if(item.getNumberStudentsEnrolled() > 0 ) {
                totalEnrollments += item.getNumberStudentsEnrolled();
            }
        }
        return totalEnrollments;
    }
    
    // The monthly raport will comprise of the following:
    public void produceReport() {
        System.out.println("*******************************");
        System.out.println("Current running classes:");
        for(Class item : runningClasses.getRunningClasses()) {
            System.out.println("     " + item.toString());
            if(item.getNumberStudentsEnrolled() > 0 ) {
                System.out.println("     Following students are enrolled on this class:");
                for(Student student : item.getEnrolledStudents()) {
                    System.out.println("     " + student.toString());
                }
            }
        }
        System.out.println("*******************************");
        System.out.println("There are currently " + getTotalEnrollments() + " enrollments on " + runningClasses.getNumberActiveClasses() + " classes in total");
        System.out.println("*******************************");
        System.out.println("Student this term:");
        for(Student item : enrolledStudents.getEnrolledStudents()) {
            System.out.println("     " + item.toString());
        }
        System.out.println("*******************************");
        System.out.println("Teaching staff this term:");
        for(TeachingStaff item: activeTeachingStaff.getTermTeachingStaff()) {
            System.out.println("     " + item.toString());
        }
        System.out.println("*******************************");
        System.out.println("Researchers active this term");
        if(!activeResearchers.getResearchers().isEmpty())
            for(Researcher item : activeResearchers.getResearchers()) {
                System.out.println("     " + item.toString());
        } else {
            System.out.println("There are no researchers this term.");
        }
        System.out.println("*******************************");
        System.out.println("Academics specialise is the areas of expertise");
        for(String item : termAreasOfExpertise.getAreasOfExpertise()) {
            System.out.println("     " + item);
        }
        System.out.println("*******************************");
        System.out.println("Following appointments have been booked");
        for(Appointment item : termAppointmentSchedule.getAppointments()) {
            System.out.println(item.toString());
        }
    }
}
