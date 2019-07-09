package coursework1;

import java.util.ArrayList;

/**
 * TermAppointmentScheduleSingleton holds diary of all appointments during
 * term. It utilises the Singleton pattern to ensure the only instance of it is used
 during the term
 To schedule/create appointment I use the appointmentFactory pattern so that all appointments
 are created from within the AppointmentFactory class
 * @author Jakub Bachniak
 */
public class TermAppointmentScheduleSingleton {
    // static Singleton class to hold diary of appointments
    public static TermAppointmentScheduleSingleton termAppointmentScheduleUniqueInstance;
    
    // hold collection of appointments
    ArrayList<Appointment> termAppointmentsDiary = new ArrayList<>();
    
    // declare private constructor in line with the Singleton pattern
    private TermAppointmentScheduleSingleton() {};
    
    // method to create the only instance of the class
    public static TermAppointmentScheduleSingleton getInstance() {
        // ensure single instance is ever created
        if(termAppointmentScheduleUniqueInstance == null) {
            termAppointmentScheduleUniqueInstance = new TermAppointmentScheduleSingleton();
        }
        return termAppointmentScheduleUniqueInstance;
    }
    
    public void addNewAppointment(Appointment newAppointment) {
        termAppointmentsDiary.add(newAppointment);
    }
    
    public Appointment getAppointment(int i) {
        return termAppointmentsDiary.get(i);
    }
    
    public ArrayList<Appointment> getAppointments() {
        return termAppointmentsDiary;
    }
    
}
