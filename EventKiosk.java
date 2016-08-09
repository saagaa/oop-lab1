
/**
 * Write a description of class EventKiosk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import java.time.*;
public class EventKiosk
{
    // instance variables - replace the example below with your own
    private ArrayList <Event> eventList = new ArrayList <Event>(50);
    
    private int noOfEvents,noOfRegistrations,noOfUsers;
    
    
    private ArrayList<Registration> registrationList= new ArrayList<Registration>(500);
    
    private ArrayList<User> userList = new ArrayList<User> (500);
    
    
    public EventKiosk()
    {
        // initialise instance variables
        noOfEvents=-1;
        noOfRegistrations=-1;
        noOfUsers=-1;
        
    }
    
  
    int createEvent( String name, double cost)
    {
        eventList.add(new Event(name,cost) );
        
        
        return eventList.size();
    }
    
   
    
    
    public int createUser(String name, String email, LocalDate dob)
    {
        userList.add(new User(name , email , dob));
        return userList.size();
    }
    
    public int registerUser(String username,Event[] events)
    {
        int i=0;
        boolean contain=false;
        for( Registration register : registrationList)
        {
            if(register.getUserName().equals(username))
            {    contain=true;
                break;
            }
            i++;
        }
        if(contain){
        
        return registrationList.get(i).addEvents(events);
        }
        
        else{
            return -1;}
        //user= username;
        
    }
    
    
    
    private int createRegistration(String username, Event[] events)
    {
       // Registration x= new Registration(username,events);
       int i=0;
       boolean contain=false;
        for( Registration register : registrationList)
        {
            if(register.getUserName().equals(username))
            {
                contain=true;
                break;
            }
            
            i++;
        }
        
        if(!contain)
        {
            return -1;
        }
        return registerUser(username ,events);
        
       
    }
    
}
