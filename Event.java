public class Event {
    private int eventId;
    private String eventName;
    private String eventDate;
    private String venue;
    private int seats;

    public Event(int eventId, String eventName, String eventDate, String venue, int seats){
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.venue = venue;
        this.seats = seats;
    }

    public void displayEvent(){
        System.out.println("Event ID: " + eventId);
        System.out.println("Event Name: " + eventName);
        System.out.println("Date: " + eventDate);
        System.out.println("Venue: " + venue);
        System.out.println("Seats: " + seats);
    }
}
