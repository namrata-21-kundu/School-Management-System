public class Person {
    protected int id;
    protected String name;
    protected String phone;

    public Person(int id, String name, String phone){
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public void displayPerson(){
        System.out.println("ID: "+ id);
        System.out.println("Name: "+name);
        System.out.println("Phone No: "+phone);
    }
}
