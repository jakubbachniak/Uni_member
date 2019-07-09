package coursework1;

/**
 *
 * @author Jakub Bachniak
 */
public class Room {
    
    private String roomNo;
    private int roomCapacity;
    
    /**
     * Create instance of Room class
     * @param roomNo        roomNo of a room in which classes take place
     * @param roomCapacity  maximum number of students the room can sit
     * 
     */
    public Room(String roomNo, int roomCapacity) {
        this.roomNo = roomNo;
        this.roomCapacity = roomCapacity;
    }
    
    // accessor methods
    public String getStringRoomNo() {
        return roomNo;
    }
    public int getRoomCapacity() {
        return roomCapacity;
    }
    
    // mutator methods
    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }
    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }
}
