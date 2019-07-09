package coursework1;

import java.util.ArrayList;

/**
 *
 * @author Jakub Bachniak
 */
public class Class {
    
    private String classIdNo;
    private String classTitle;
    private TeachingStaff lecturer;
    private String classDay;
    private String classTimeSlot;
    private Room classRoomNo;
    private String areaOfExpertise;
    private ArrayList<Student> enrolledStudents;
    
    /**
     * Constructor - create instance of Class class
     * 
     * @param classIdNo         unique class identifier
     * @param classTitle        title of the class taught by teaching staff
     * @param lecturer          class teacher
     * @param classDay          week day on which the class takes place
     * @param ClassTimeSlot     e.g. 10:00 - 12:00 each class runs for 2 hours
     * @param classRoomNo       room in which class takes place
     * @param areaOfExpertise   class area of expertise
     * 
     * 
     */
    public Class(String classIdNo, String classTitle, TeachingStaff lecturer, String classDay, String classTimeSlot, Room classRoomNo, String areaOfExpertise) {
        this.classIdNo = classIdNo;
        this.classTitle = classTitle;
        this.lecturer = lecturer;
        this.classDay = classDay;
        this.classTimeSlot = classTimeSlot;
        this.classRoomNo = classRoomNo;
        this.areaOfExpertise = areaOfExpertise;
        
        // record students enrolled on the class
        enrolledStudents = new ArrayList<>();
        TermRunningClassesSingleton.getInstance().addToActiveClasses(this);
    }
    
    // accessor methods
    public String getClassIdNo() {
        return classIdNo;
    }
    public String getClassTitle() {
        return classTitle;
    }
    public String toString() {
        return ("ClassId: " + classIdNo + "; Class title: " + classTitle + "; Class " + lecturer.toString() + "; The area of expertise is: " + areaOfExpertise);
    }
    public TeachingStaff getLecturer() {
        return lecturer;
    }
    public String getClassDay() {
        return classDay;
    }
    public String getClassTimeSlot() {
        return classTimeSlot;
    }
    public Room getClassRoomNo() {
        return classRoomNo;
    }
    public String getAreaOfExpertise() {
        return areaOfExpertise;
    }
    public int getNumberStudentsEnrolled() {
        return enrolledStudents.size();
    }
    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
    // test if class has available spaces
    public boolean hasAvailableSpaces() {
        boolean hasSpacesLeft = false;
        if(enrolledStudents.size() <= classRoomNo.getRoomCapacity()) {
            hasSpacesLeft = true;
        }
        return hasSpacesLeft;
    }
    public void addStudentToClass(Student student) {
        if(hasAvailableSpaces()) {
            enrolledStudents.add(student);
        } else {
            System.out.println("No available spaces in this class.");
        }
    }
    
    // mutator methods
    public void setClassIdNo(String classIdNo) {
        this.classIdNo = classIdNo;
    }
    public void setClassTitle(String classTitle) {
        this.classTitle = classTitle;
    }
    public void setLecturer(TeachingStaff lecturer) {
        this.lecturer = lecturer;
    }
    public void setClassDay(String classDay) {
        this.classDay = classDay;
    }
    public void setClassTimeSlot(String classTimeSlot) {
        this.classTimeSlot = classTimeSlot;
    }
    public void setClassRoomNo(Room classRoomNo) {
        this.classRoomNo = classRoomNo;
    }
    public void setAreaOfExpertise(String areaOfExpertise) {
        this.areaOfExpertise = areaOfExpertise;
    }
    
}
