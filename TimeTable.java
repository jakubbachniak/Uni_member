package coursework1;

import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;


/**
 * TimeTable class will serve as a template for Scheduling term appointments
 * and classes when implementing the advanced features of the assignment
 * 
 * @author Jakub Bachniak
 */
public class TimeTable {
    
    public static final String[] WEEK_DAYS = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    // day is divided into 5 two-hour slots into which a class
    // or an appointment can be allocated
    public static String[] TIME_SLOT = {"8:00 - 10:00", "10:00 - 12:00", "12:00 - 14:00", "14:00 - 16:00", "16:00 - 18:00"};
    
    private final int NUMBER_WEEKS = 12;
    
    private ArrayList<String> termTimeTable;
    
    
    
    // create Timetable
    public TimeTable(){
        
        //create 12-weekly term timetable
        termTimeTable = new ArrayList<>();
        
        for(int i = 1; i <= NUMBER_WEEKS; i+=1) {
            for(int j = 0; j < WEEK_DAYS.length; j+=1) {
                for(int k = 0; k <TIME_SLOT.length; k+=1) {
                    termTimeTable.add("Week " + i + " , " + WEEK_DAYS[j] + " , " + TIME_SLOT[k]);
                }
            }
        }

    }
    
    public void listTermTable() {
        Iterator termSlots = termTimeTable.iterator();
        while(termSlots.hasNext()) {
            System.out.println(termSlots.next().toString());
        }
    }

}
