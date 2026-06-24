import java.util.HashMap;

public class Student extends Person{
    private int rollNo;
    private HashMap<String, Integer> marks;

    public Student(String name, int age, int rollNo){
        super(name, age);
        this.rollNo = rollNo;
        this.marks = new HashMap<>();
    }

    public void addMarks(String subject, int mark){
        marks.put(subject,mark);
    }

    public double calculateAverage(){
        if(marks.isEmpty()){
            return 0;
        }

        int sum =0;

        for(int mark:marks.values()){
            sum+= mark;
        }

        return (double)sum/marks.size();
    }

    @Override
    public void displayInfo(){
        System.out.println("---Student Details---");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Roll No: "+rollNo);

        System.out.println("\nMarks: ");

        for(String subject: marks.keySet()){
            System.out.println(subject + " : " +marks.get(subject));
        }

        System.out.println("Average: " + calculateAverage());
    }
}
