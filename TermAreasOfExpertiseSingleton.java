package coursework1;

import java.util.HashSet;
import java.util.Set;

/**
 * Class TermAreasOfExpertise as Singleton to contain areas of Expertise
 * of the UNiversity Academics
 * @author Jakub Bachniak
 */
public class TermAreasOfExpertiseSingleton {
    // static class as Singleton to contain areas of Expertise
    // of the UNiversity Academics
    public static TermAreasOfExpertiseSingleton termAreasOfExpertiseUniqueInstance;
    
    // hold collection of all areas of expertise this term
    Set<String> areasOfExpertise = new HashSet<String>();
    
    // declare private constructor
    private TermAreasOfExpertiseSingleton() {};
    
    // method to create the only instance of the class
    public static TermAreasOfExpertiseSingleton getInstance() {
        // ensure the only instance
        if(termAreasOfExpertiseUniqueInstance == null) {
            termAreasOfExpertiseUniqueInstance = new TermAreasOfExpertiseSingleton();
        }
        return termAreasOfExpertiseUniqueInstance;
    }
    
    // add area of expertise to collection
    // since it is an instance of a set it doesn't allow duplicates
    public void addAreaOfExpertise(String areaOfExpertise) {
        areasOfExpertise.add(areaOfExpertise);
    }
    
    public Set<String> getAreasOfExpertise() {
        return areasOfExpertise;
    }
}
