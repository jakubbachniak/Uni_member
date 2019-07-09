package coursework1;

/**
 *
 * @author Jakub Bachniak
 */
public class VisitorToTeachingStaffAppointment extends Appointment {
    
    private Visitor visitor;
    private TeachingStaff toSeeTeachingStaff;
    
    /**
     * Create new Visitor coming to see Teaching Staff appointment
     * @param appWeekNo             - String e.g. "Week1"
     * @param appDay                - String e.g. "Monday"
     * @param appTimeSlot           - String e.g. "10:00 - 12:00"
     * @param visitor               - Visitor an instance of Visitor class
     * @param toSeeTeachingStaff    - an instance of TeachingStaff
     */    
    public VisitorToTeachingStaffAppointment(String appWeekNo, String appDay, String appTimeSlot, Visitor visitor, TeachingStaff toSeeTeachingStaff) {
        super(appWeekNo, appDay, appTimeSlot);
        this.visitor = visitor;
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
