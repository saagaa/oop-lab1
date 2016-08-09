
/**
 * Write a description of class EventKiosk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EventKiosk
{
    // instance variables - replace the example below with your own
    private Event[] eventlist;
    
    private int noOfEvents,noOfRegistrations,noOfUsers;
    
    
    private Registration[] registrationList;
    
    private User[] userList;
    
    public EventKiosk()
    {
        // initialise instance variables
        noOfEvents=-1;
        noOfRegistrations=-1;
        noOfUsers=-1;
        
    }
    
    private int addEvents( String username, Event[] events){
        
        // ?
    }
    
    int createEvent( String name, double cost)
    {
        eventList.add(event(new Event(name,cost)));
    }
    
    private int createRegistration( String username, Event[] events)
    {
    
        // creates a regisration object
    
    }
    

    
}
