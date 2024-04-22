class Employee {
    // Instance Variables
    private int id;
    private String name;
    private double salary;
    private String companyName;

    // The Name Of Constructor Should be Same as Class Name
    // Constructor is used for Initialize the instance variable
    // {
    // System.out.println("This is Init Block This will Call Before the constructor
    // Calling");
    // System.out.println(this.id);
    // System.out.println(this.name);
    // System.out.println(this.salary);
    // System.out.println(this.companyName);
    // }

    Employee() {
        this.companyName = "Brain Mentors";
    }

    Employee(int id, String name, double salary) {
        this();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Setters
    void setSalary(double salary) {
        this.salary = salary;
    }

    double getSalary() {
        return this.salary;
    }

    public int hashCode() {
        return 1;
    }

    public String toString() {
        return "Name " + name + " id " + id + " Salary " + salary + " companyName " + companyName;
    }

    void takeInput(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void printValues() {
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.salary);
        System.out.println(this.companyName);
    }
}
