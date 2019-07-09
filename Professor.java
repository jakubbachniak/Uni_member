package coursework1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Jakub Bachniak
 */
public class Professor extends Academic implements TeachingStaff {
    
    // reference ot the Class class - objects of which Professor creates when they
    // offer - teach classes
    private Class newClassTaught;
    // Professor only teaches 2 lessons per week
    private final int NUMBER_CLASSES_WEEKLY = 2;
    // keep track of classes offered
    private ArrayList<Class> classesTaught;
    
    /**
     * Create an instance of Professor class
     * 
     * @param memberId          String - unique member of staff identifier
     * @param fullName          String - full name e.g. 'John Smith'
     * @param address           String - member of staff address e.g. '12 chocolate cake avenue, Bristol'
     * @param email             String - member of staff email address e.g. john.smith@email.com
     * @param office            String - member of staff office number e.g. 'office 12'
     * @param areaOfExpertise   String - area of expertise e.g. 'algorithms'
     */
    public Professor(String memberId, String fullName, String address, String email, String office, String areaOfExpertise) {
        super(memberId, fullName, address, email, office, areaOfExpertise);
        classesTaught = new ArrayList<>();
        // add new Professor to the static TermTeachingStaffSingleton instance
        TermTeachingStaffSingleton.getInstance().addTeachingStaff(this);
    }
    public Class teachClass(String classIdNo, String classTitle, TeachingStaff lecturer, String classDay, String classTimeSlot, Room classRoomNo, String areaOfExpertise) {
        if(this.classesTaught.size() < this.NUMBER_CLASSES_WEEKLY) {
            newClassTaught = new Class(classIdNo, classTitle, this, classDay, classTimeSlot, classRoomNo, areaOfExpertise);
            classesTaught.add(newClassTaught);
        } else {
            System.out.println("Professor only teaches two classes in a week.");
        }
        return newClassTaught;
    }
    
    public void lookUpClass() {
        Iterator professorClasses = classesTaught.iterator();
        while(professorClasses.hasNext()) {
            System.out.println(professorClasses.next().toString());
        }
    }
}
