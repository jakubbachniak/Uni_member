package coursework1;

/**
 *
 * @author Jakub Bachniak
 */
public class Researcher extends Academic {
    
    /**
     * Create an instance of Researcher
     * 
     * @param memberId          - String - unique identification of the University member
     * @param fullName          - String - full name of the researcher 
     * @param address           - String - address of the researcher e.g. "123 Strawberry street, Manchester"
     * @param email             - String - email address
     * @param office            - String - office number of the researcher e.g. "office10"
     * @param areaOfExpertise   - String - researchers have areas of expertise e.g. "algorithms"
     */
    public Researcher (String memberId, String fullName, String address, String email, String office, String areaOfExpertise) {
        super(memberId, fullName, address, email, office, areaOfExpertise);
        TermResearchersSingleton.getInstance().addResearcher(this);
    }
    
    public void bookTeachingStaffAppointment(String appWeekNo, String appDay, String appTimeSlot, TeachingStaff toSeeTeachingStaff) {
        
        Appointment newAppointment = null;
        
        newAppointment = new ResearcherToTeachingStaffAppointment(appWeekNo, appDay, appTimeSlot, this, toSeeTeachingStaff);
        
        TermAppointmentScheduleSingleton.getInstance().addNewAppointment(newAppointment);
        
    }
    // not yet implemented
    // this is part of the advanced features of the system
    public boolean isBussyElswhere() {
        boolean isBusyElswhere = true;
        
        return isBusyElswhere;
    }

}
