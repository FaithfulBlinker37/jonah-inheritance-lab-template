public class Teacher extends Person{
    
    // TODO: Add fields.
    private String subject;
    private double salary;


    public Teacher(String name, int age, String gender)
    {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    // TODO Add methods
    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSubject(String newSubject) {
        subject = newSubject;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    public String toString(){
        // TODO: improve this.
        return super.toString() + " subject: " + subject + " salary: " + salary;
    }
}
