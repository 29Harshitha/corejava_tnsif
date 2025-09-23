package interfacedemo;

public class Student implements Registerable {
    private int id;
    private String name;
    private double fees;
    private String course;

    // Constructor
    public Student(int id, String name, double fees, String course) {
        this.id = id;
        this.name = name;
        this.fees = fees;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    // Implementing methods from Registerable
    public void register() {
        System.out.println("Student " + name + " registered for course: " + course);
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Fees: " + fees);
        System.out.println("Course: " + course);
    }
}
