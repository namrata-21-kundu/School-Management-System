public class Organiser extends Person {
    private String department;
    
    public Organiser(int id, String name, String phone, String department){
        super(id, name, phone);
        this.department = department;
    }

    public void displayOrganiser(){
        displayPerson();
        System.out.println("Department: " + department);
    }
}
