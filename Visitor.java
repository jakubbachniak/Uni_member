package coursework1;

/**
 *
 * @author Jakub Bachniak
 */
public class Visitor {
    
    private String fullName;
    private String phoneNumber;
    
    /**
     * Create an instance of the Visitor class
     * Business visitors book appointments with Researchers and Teaching staff
     * @param fullName      - String e.g. "John Smith"
     * @param phoneNumber   - String e.g. "02222555999"
     */
    public Visitor(String fullName, String phoneNumber) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }
    
    public void bookTeachingStaffAppointment(String appWeekNo, String appDay, String appTimeSlot, TeachingStaff teachingStaff){
        
        Appointment newAppointment = null;
        
        newAppointment = new VisitorToTeachingStaffAppointment(appWeekNo, appDay, appTimeSlot, this, teachingStaff);
        
        TermAppointmentScheduleSingleton.getInstance().addNewAppointment(newAppointment);
        
    }
    public void bookResearchersAppointment(String appWeekNo, String appDay, String appTimeSlot, Researcher researcher){
        
        Appointment newAppointment = null;
        
        newAppointment = new VisitorToResearcherAppointment(appWeekNo, appDay, appTimeSlot, this, researcher);
        
        TermAppointmentScheduleSingleton.getInstance().addNewAppointment(newAppointment);
    }
    
    public String getVisitorsFullName() {
        return fullName;
    }
    public String getVisitorsPhoneNumber() {
        return phoneNumber;
    }
    public String toString() {
        return "Visitor: " + getVisitorsFullName() + "; phone no: " + getVisitorsPhoneNumber();
    }
    
}
