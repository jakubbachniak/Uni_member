package coursework1;

/**
 *
 * @author Jakub Bachniak
 */
public class VisitorToResearcherAppointment extends Appointment {
    
    private Visitor visitor;
    private Researcher toSeeResearcher;
    
    /**
     * Create new visitor coming to see Researcher appointment
     * @param appWeekNo         - String e.g. "Week1"
     * @param appDay            - String e.g. "Monday"
     * @param appTimeSlot       - String e.g. "8:00 - 10:00"
     * @param visitor           - Visitor an instance of Visitor class
     * @param toSeeResearcher   - an instance of Researcher
     */
    public VisitorToResearcherAppointment(String appWeekNo, String appDay, String appTimeSlot, Visitor visitor, Researcher toSeeResearcher) {
        super(appWeekNo, appDay, appTimeSlot);
        this.visitor = visitor;
        this.toSeeResearcher = toSeeResearcher;
    }
    @Override
    public String toString() {
        return "Appointment in " + getAppointmentWeek() + " on " + getAppointmentDay() + " at " + getAppointmentTimeSlot() + " with " + toSeeResearcher.getClass().getSimpleName() + " " + getAppointmentResearcher();
    }
    public String getAppointmentResearcher() {
        return toSeeResearcher.getFullName();
    }
    
    
    
    
}
