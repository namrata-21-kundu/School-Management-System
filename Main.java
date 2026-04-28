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
