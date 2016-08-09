
/**
 * Write a description of class User here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


import java.time.*;



public class User
{
    // instance variables - replace the example below with your own
    private LocalDate dob;
    private String email,name;
    
    

    /**
     * Constructor for objects of class User
     */
    public User(String nam,String emai, LocalDate dateofbirth)
    {
        // initialise instance variables
        dob=dateofbirth;
        
        email=emai;
        name=nam;
        
    }

    public String getName()
    {
        // put your code here
        return name;
        
    }
}
