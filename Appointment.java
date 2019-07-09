package coursework1;

/**
 *
 * @author Jakub Bachniak
 */
public abstract class Appointment {
    
    private String appWeekNo;
    private String appDay;
    private String appTimeSlot;
    
    public Appointment(String appWeekNo, String appDay, String appTimeSlot) {
        this.appWeekNo = appWeekNo;
        this.appDay = appDay;
        this.appTimeSlot = appTimeSlot;
    }
    public String toString() {
        return "Appointment in " + getAppointmentWeek() + " on " + getAppointmentDay() + " at " + getAppointmentTimeSlot();
    }
    public String getAppointmentWeek() {
        return appWeekNo;
    }
    public String getAppointmentDay() {
        return appDay;
    }
    public String getAppointmentTimeSlot() {
        return appTimeSlot;
    }
}
