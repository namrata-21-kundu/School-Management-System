public class Participant extends Person {
    int id, String name, String phone;
    public Participant(int id, String name, String phone){
        super(id, name, phone);
    }

    public void displayParticipant(){
        displayPerson();
    }
}
