package coursework1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * TermEnrolledStudentsSingleton serves as a container for storing information
 * about enrolled students during term
 * Is is a singleton pattern class in order to ensure there is only one instance of it
 * created during the single 12-week term
 * 
 * @author Jakub Bachniak
 */
public class TermEnrolledStudentsSingleton {
    
    // static class as Singletorn to contain all students during term
    public static TermEnrolledStudentsSingleton termEnrolledStudentsUniqueInstance;
    
    // hold collection of all students
    ArrayList<Student> termEnrolledStudents = new ArrayList<>();
    
    // declare private constructor
    private TermEnrolledStudentsSingleton(){};
    
    // method to create the only instance of the class
    public static TermEnrolledStudentsSingleton getInstance() {
        // ensure the only instance of the class
        if(termEnrolledStudentsUniqueInstance == null) {
            termEnrolledStudentsUniqueInstance = new TermEnrolledStudentsSingleton();
        }
        return termEnrolledStudentsUniqueInstance;
    }
    public void addStudent(Student student) {
        termEnrolledStudents.add(student);
    }
    public Student getStudentById(String studentId) {
        Student student = null;
        for(Student item : termEnrolledStudents) {
            if(item.getMemberId().equalsIgnoreCase(studentId)) {
                student = item;
            }
        }
        return student;
    }
    public Student getStudentByName(String name) {
        Student student = null;
        for(Student item : termEnrolledStudents) {
            if(item.getFullName().equalsIgnoreCase(name)) {
                student = item;
            }
        }
        return student;
    }
    public ArrayList<Student> getEnrolledStudents() {
        return termEnrolledStudents;
    }
    public void listEnrolledStudents() {
        Iterator students = termEnrolledStudents.iterator();
        while(students.hasNext()) {
            System.out.println(students.next().toString());
        }
    }
    
}
