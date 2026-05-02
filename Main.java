import java.util.* ;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        EventManager manager = new EventManager();

        while(true){
            System.out.println("1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Register Participant");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter Event ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter event name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter date of event: ");
                    String date = sc.nextLine();

                    System.out.println("Enter venue: ");
                    String venue = sc.nextLine();

                    System.out.println("Enter seats: ");
                    int seats = sc.nextInt();

                    Event e = new Event(id, name, date, venue, seats);
                    manager.addEvent(e);

                    break;
                    
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Thanks for visiting Event Management System. Exiting ---");
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
