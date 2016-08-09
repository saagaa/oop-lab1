
/**
 * Write a description of class Registration here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class Registration
{
    
    private ArrayList <Event> eventsRegistered =new ArrayList <Event>();
    private int noOfEvents;
    private User user;
    /**
     * Constructor for objects of class Registration
     */
    public Registration(User usr)
    {
        user=usr;
        noOfEvents=-1;
    }
    
    public Registration(User usr,Event[] events)
    {
        user=usr;
        noOfEvents=-1;
        addEvents(events);
    }
    
    public int addEvents(Event[] events)
    {
        int check=0,added=0;
        for(Event my_event : events )
        {
            
            
            
            if(eventsRegistered.contains(my_event) )
            {
                check=1;
            }
            else{
                added++;
                eventsRegistered.add(my_event);
            }
            
            

            
        }
        
        
        return added;
    }
    
    
    public boolean isEventRegistered(String eventName)
    {
        boolean ans=false;
        for(Event my_event : eventsRegistered)
        {
            if(my_event.getName().equals(eventName))
            {
                   ans=true;
            }
        }
        
        return ans;
    }
    
    
    
    public String getUserName()
    {
    
        return user.getName();
    }
}
