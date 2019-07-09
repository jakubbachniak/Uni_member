package coursework1;

import java.util.ArrayList;

/**
 * class Student
 * 
 * @author Jakub Bachniak
 */
public class Student extends UniversityMember {
    
    // record classes student signs up on
    private ArrayList<Class> enrolledOnClasses;
    
    /**
     * Constructor - create instance of Student class
     * 
     * @param memberId      unique identifier six characters e.g. "SN1234"
     * @param fullName      student's fullName e.g. "John Doe"
     * @param address       student's address e.g. "12 Strawberry Avenue, Devon"
     * @param email         student's email address e.g. "john.doe@email.net"
     */
    
    public Student(String memberId, String fullName, String address, String email) {
        super(memberId, fullName, address, email);
        TermEnrolledStudentsSingleton.getInstance().addStudent(this);
        enrolledOnClasses = new ArrayList<>();
    }
    // sign up student on a class
    public void signUpOnClass(Class chosenClass) {
        chosenClass.addStudentToClass(this);
        enrolledOnClasses.add(chosenClass);
    }
    
    public ArrayList<Class> getStudentEnrolledClasses() {
        return enrolledOnClasses;
    }
}
