public class Main
{
  public static void main(String [] args)
  {
    // Student(String name, int age, String gender, String idNum, double gpa)
    Person me = new Student("H", 3, "M", "2584", 4.0);
    
    System.out.println("Hi, " + me.getName() + ". What's your GPA?");
    System.out.println("My GPA is: " + ((Student)me).getGPA());

    Teacher you = new Teacher("C", 30, "F");
    System.out.println("My teacher is: " + you.getName());
    System.out.println(you);

    CollegeStudent jonah = new CollegeStudent("jonah Junior", 16, "M", "UCB123", 4.0, 1, "I don't know");
    System.out.println("My college friend is: " + ima.getName());
    System.out.println(jonah);
  }
}
