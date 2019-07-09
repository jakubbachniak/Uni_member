package coursework1;

/**
 *
 * @author Jakub Bachniak
 */
public class ResearcherToTeachingStaffAppointment extends Appointment {
    
    private Researcher researcher;
    private TeachingStaff toSeeTeachingStaff;
    
    /**
     * Create new researcher wishing to see teaching staff appointment
     * @param appWeekNo                 - String e.g. "Week1"
     * @param appDay                    - String e.g. "Monday"
     * @param appTimeSlot               - String e.g. "8:00 - 10:00"
     * @param researcher                - an instance of Researcher
     * @param toSeeTeachingStaff        - an instance of TeachingStaff
     */
    public ResearcherToTeachingStaffAppointment(String appWeekNo, String appDay, String appTimeSlot, Researcher researcher, TeachingStaff toSeeTeachingStaff) {
        super(appWeekNo, appDay, appTimeSlot);
        this.researcher = researcher;
        this.toSeeTeachingStaff = toSeeTeachingStaff;
    }
    @Override
    public String toString() {
        return "Appointment in " + getAppointmentWeek() + " on " + getAppointmentDay() + " at " + getAppointmentTimeSlot() + " with " + toSeeTeachingStaff.getClass().getSimpleName() + " " + getAppointmentTeachingStaff();
    }
    public String getAppointmentTeachingStaff() {
        return toSeeTeachingStaff.getFullName();
    }
}
