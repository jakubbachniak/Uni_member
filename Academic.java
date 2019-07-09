package coursework1;

import java.util.Observable;

/**
 *
 * @author Jakub Bachniak
 */
public abstract class Academic extends UniversityMember {
    
    private String office;
    private String areaOfExpertise;
    
    /**
     * Create a member of Academic staff
     * @param memberId          String - unique member of staff identifier
     * @param fullName          String - full name e.g. 'John Smith'
     * @param address           String - member of staff address e.g. '12 chocolate cake avenue, Bristol'
     * @param email             String - member of staff email address e.g. john.smith@email.com
     * @param office            String - member of staff office number e.g. 'office 12'
     * @param areaOfExpertise   String - area of expertise e.g. 'algorithms'
     */
    public Academic(String memberId, String fullName, String address, String email, String office, String areaOfExpertise) {
        super(memberId, fullName, address, email);
        this.office = office;
        this.areaOfExpertise = areaOfExpertise;
        // add Academics' areaOfExpertise to collection
        TermAreasOfExpertiseSingleton.getInstance().addAreaOfExpertise(areaOfExpertise);
    }
}