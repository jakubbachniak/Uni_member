package coursework1;

/**
 * Abstract class UniversityMember serves as a generic blueprint
 * for all members of university to provide general profile
 * for: students, teaching staff and researchers
 * 
 * @author Jakub Bachniak
 */
public abstract class UniversityMember {
    private String memberId;
    private String fullName;
    private String address;
    private String email;
    
    public UniversityMember(String memberId, String fullName, String address, String email) {
        this.memberId = memberId;
        this.fullName = fullName;
        this.address = address;
        this.email = email;
    }
    
    // accessor methods
    public String getMemberId() {
        return memberId;
    }
    public String getFullName() {
        return fullName;
    }
    public String getAddress() {
        return address;
    }
    public String getEmail() {
        return email;
    }

    // mutator methods
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return this.getClass().getSimpleName() + "'s name: " + this.getFullName() + ", Id no: " + this.getMemberId();
    }
}
