import java.util.*;

public class EventManager {
    private ArrayList<Event> events;
    private ArrayList<Participant> participants;
    private ArrayList<Organiser> organisers;
    private ArrayList<Ticket> tickets;
    
    //Constructor 
    public EventManager(){
        events = new ArrayList<>();
        participants = new ArrayList<>();
        organisers = new ArrayList<>();
        tickets = new ArrayList<>();
    }

    //Event methods
    public void addEvent(Event e){
        events.add(e);
        System.out.println("Event added succesfully!");
    }
}
