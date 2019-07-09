package coursework1;

import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Jakub Bachniak
 */
public class TermRunningClassesSingleton {
    // static variable to hold the unique instance of TermRunningClassesSingleton object
    private static TermRunningClassesSingleton uniqueTermRunningClassesInstsnce;
    // collection of all ruunign classes during term, to which all classes created by
    // lecturers will be added
    private static ArrayList<Class> runningClasses = new ArrayList<>();
    // register me as an observer of Teaching staff members
    
    /**
     * TremRunningClasses constructor is declared private in order to ensure
     * the only instance is ever created
     */
    private TermRunningClassesSingleton() {
    };
    
    public static TermRunningClassesSingleton getInstance() {
        
        if(uniqueTermRunningClassesInstsnce == null) {
            uniqueTermRunningClassesInstsnce = new TermRunningClassesSingleton();
        }
        return uniqueTermRunningClassesInstsnce;
    }
    
    public void addToActiveClasses(Class newClass) {
        runningClasses.add(newClass);
    }
    public void deleteClass(Class aClass) {
        runningClasses.remove(aClass);
    }
    
    public void showClasses() {
        for(Class item : runningClasses) {
            System.out.println(item.toString());
        }
    }
    
    public Class getClassByIdNo(String classIdNo) {
        Class foundClass = null;
        for(Class item : runningClasses) {
            if(item.getClassIdNo() == classIdNo) {
                foundClass = item;
            }
        }
        return foundClass;
    }
    
    public ArrayList<Class> getRunningClasses() {
        return runningClasses;
    }
    // return number of classes with students enrlled
    public int getNumberActiveClasses() {
        int numberActiveClasses = 0;
        for(Class item : runningClasses) {
            if(item.getNumberStudentsEnrolled() > 0 ) {
                numberActiveClasses +=1;
            }
        }
        return numberActiveClasses;
    }
    // return total number of running classes
    public int numberRunningClasses() {
        return runningClasses.size();
    }
    // find class in given area of exepertise
    public ArrayList<Class> lookUpClass(String areaOfExpertise) {
        ArrayList<Class> classesInSubject = new ArrayList<>();
        for(Class item : runningClasses) {
            String classAreaOfExpertise = item.getAreaOfExpertise();
            if(classAreaOfExpertise.equals(areaOfExpertise)) {
                classesInSubject.add(item);
            }
        }
        return classesInSubject;
    }
    // print classes in the specified area of exepertise
    public void showClassesInAreaOfExpertise(String areaOfExpertise) {
        ArrayList<Class> classesInSubject = lookUpClass(areaOfExpertise);
        for(Class item : classesInSubject) {
            System.out.println(item.toString());
        }
            
    }
}
