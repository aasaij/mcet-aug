final public class Student {
    private int rollNo;
    private String name;
    private String gender;
    private double cgpa;
    final private static String collegeName;// = "Dr. Mahalingam College of Engineering and Technology";;
    // static block
    static {
      collegeName = "Dr. Mahalingam College of Engineering and Technology";
    }
    //Constructor
    public Student(int rollNo, String name, String gender, double cgpa) {
        this.rollNo = rollNo;
        this.name = name.toUpperCase();
        this.gender = gender.toUpperCase();
        this.cgpa = cgpa;
        // collegeName = "ABC"; -- error
    }
    final public void setStudent(int rollNo, String name, String gender, double cgpa) {
        this.rollNo = rollNo;
        this.name = name.toUpperCase();
        this.gender = gender.toUpperCase();
        this.cgpa = cgpa;       
    }
    //Getters
    public int getRollNo() {
        return rollNo;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public double getCgpa() {
        return cgpa;
    }
    public static String getCollegeName() {
        return collegeName;
    }
    //Setters
    public void setName(String name) {
        this.name = name.toUpperCase();
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }    
}
