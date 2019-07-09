package coursework1;

/**
 * Classes implementing TeachingStaff interface can offer classes to students
 * 
 * @author Jakub Bachniak
 */
public interface TeachingStaff {
    
    public Class teachClass(String classIdNo, String classTitle, TeachingStaff lecturer, String classDay, String classTimeSlot, Room classRoomNo, String areaOfExpertise);
    
    public void lookUpClass();
    
        // accessor methods
    public String getMemberId();
    public String getFullName();
    public String getAddress();
    public String getEmail();
    
}
