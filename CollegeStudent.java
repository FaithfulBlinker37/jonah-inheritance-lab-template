public class CollegeStudent extends Student {
    private int studentYear;
    private String studentMajor;
  
    public CollegeStudent(String name, int age, String gender,
                          String idNum, double gpa, int year, String major) {
      super(name, age, gender, idNum, gpa);
      studentYear = year;
      studentMajor = major;
    }
  
    public int getYear() {
      return studentYear;
    }
  
    public String getMajor() {
      return studentMajor;
    }
  
    public void setYear(int year) {
      studentYear = year;
    }
  
    public void setMajor(String major) {
      studentMajor = major;
    }
  
    public String toString() {
      return super.toString() + ", year: " + studentYear + ", major: " + studentMajor;
    }
  }
  