public class Main
{
  public static void main(String [] args)
  {
    // Student(String name, int age, String gender, String idNum, double gpa)
    Person me = new Student("jonah", 105, "Gender Fluid", "2584", 0.2);
    
    System.out.println("Hi, " + me.getName() + ". What's your GPA?");
    System.out.println("My GPA is: " + ((Student)me).getGPA());

    Teacher you = new Teacher("John Pork", 30, "F");
    System.out.println("My teacher is: " + you.getName());
    System.out.println(you);

    CollegeStudent jonah = new CollegeStudent("Tim Cheese", 16, "Non-binary", "321044210", 0.1, 3, "I don't know");
    System.out.println("My college friend is: " + jonah.getName());
    System.out.println(jonah);
  }
}
