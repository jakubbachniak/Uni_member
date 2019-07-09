package coursework1;

import java.util.ArrayList;

/**
 * TermResearchersSingleton holds researchers during term
 * It is a singleton design pattern to ensure only one collection of researchers
 * @author Jakub Bachniak
 */
public class TermResearchersSingleton {
    // static class as Singleton to contain term researchers0
    public static TermResearchersSingleton termResearchersUniqueInstance;
    
    // hold collection of the term researchers
    ArrayList<Researcher> termResearchers = new ArrayList<>();
    
    // declare private constructor
    private TermResearchersSingleton() {};
    
    // method to create the only instance of the class
    public static TermResearchersSingleton getInstance() {
        // ensure the only instance
        if(termResearchersUniqueInstance == null) {
            termResearchersUniqueInstance = new TermResearchersSingleton();
        }
        return termResearchersUniqueInstance;
    }
    
    public void addResearcher(Researcher researcher) {
        termResearchers.add(researcher);
    }
    
    public Researcher getResearcherById(String researcherId) {
         Researcher researcher = null;
        for(Researcher item : termResearchers) {
            if(item.getMemberId().equalsIgnoreCase(researcherId)) {
                researcher = item;
            }
        }
        return researcher;
    }
    public Researcher getResearcherByName(String name) {
        Researcher researcher = null;
        for(Researcher item : termResearchers) {
            if(item.getFullName().equalsIgnoreCase(name)) {
                researcher = item;
            }
        }
        return researcher;
    }
    
    public Researcher getResearcher(int i) {
        return termResearchers.get(i);
    }
    public ArrayList<Researcher> getResearchers() {
        return termResearchers;
    }
}
