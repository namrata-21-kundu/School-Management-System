public class Participant extends Person {
    public Participant(int id, String name, String phone){
        super(id, name, phone);
    }

    public void displayParticipant(){
        displayPerson();
    }
}
