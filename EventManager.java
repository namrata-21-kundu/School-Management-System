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

    public void viewEvents(){
        if(events.isEmpty()){
    System.out.println("No events available.");
        }
        else{
            for(Event e : events){
                e.displayEvent();
                System.out.println();
            }
        }
    }

    public Event searchEvent(int id) {
        for(Event e : events) {
            if(e.getEventId() == id) {
                return e;
            }
        }
        return null;
    }
}
