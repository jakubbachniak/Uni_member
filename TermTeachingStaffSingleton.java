package coursework1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * TermTeachingStaffSingleton holds information about all teaching staff
 * during the 12-week term
 * It is a singleton pattern class which ensures there is only one instance of it
 * during the term created
 * @author Jakub Bachniak
 */
public class TermTeachingStaffSingleton {
    
    // static class as Singleton to hold all active members of teaching staff
    // during the term
    public static TermTeachingStaffSingleton termTeachingStaffUniqueInstance;
    
    // hold collection of all teaching staff during the term
    ArrayList<TeachingStaff> termActiveTeacingStaff = new ArrayList<>();
    
    // declare private constructor
    private TermTeachingStaffSingleton(){};
    
    // method to create the only instance of the class
    public static TermTeachingStaffSingleton getInstance() {
        // ensure the only instance of the class
        if(termTeachingStaffUniqueInstance == null) {
            termTeachingStaffUniqueInstance = new TermTeachingStaffSingleton();
        }
        return termTeachingStaffUniqueInstance;
    }
    
    public TeachingStaff getTeachingStaffById(String teachingStaffId) {
        TeachingStaff teachingStaff = null;
        for(TeachingStaff item : termActiveTeacingStaff) {
            if(item.getMemberId().equalsIgnoreCase(teachingStaffId)) {
                teachingStaff = item;
            }
        }
        return teachingStaff;
    }
    public TeachingStaff getTeachingStaffByName(String name) {
        TeachingStaff teachingStaff = null;
        for(TeachingStaff item : termActiveTeacingStaff) {
            if(item.getFullName().equalsIgnoreCase(name)) {
                teachingStaff = item;
            }
        }
        return teachingStaff;
    }
    
    public void addTeachingStaff(TeachingStaff teachingStaff) {
        termActiveTeacingStaff.add(teachingStaff);
    }
    
    public void listTeachingStaff() {
        Iterator teachers = termActiveTeacingStaff.iterator();
        while(teachers.hasNext()) {
            System.out.println(teachers.next().toString());
        }
    }
    public ArrayList<TeachingStaff> getTermTeachingStaff() {
        return termActiveTeacingStaff;
    }
}
