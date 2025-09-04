public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ananthi", "Female", 10);
        Student s2 = new Student(102, "Sakthi", "Male", 9.9);
        Student s3 = new Student(103,"Anusanth","Male",10.1);
        System.out.println((s1.getGender().equals("FEMALE")?"Ms. " : "Mr. ") + 
            s1.getName() + " has scored " + s1.getCgpa() + " CGPA. " + Student.getCollegeName());
        System.out.println((s2.getGender().equals("FEMALE")?"Ms. " : "Mr. ") + 
            s2.getName() + " has scored " + s2.getCgpa() + " CGPA. " + Student.getCollegeName());
        System.out.println((s3.getGender().equals("FEMALE")?"Ms. " : "Mr. ") + 
            s3.getName() + " has scored " + s3.getCgpa() + " CGPA. " + Student.getCollegeName());
    }
}
