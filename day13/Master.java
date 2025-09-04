public class Master extends Student { // Error --> final class cannot be inherited
    public Master(int rollNo, String name, String gender, double cgpa) {
        super(rollNo, name, gender, cgpa);
    }
    //Error --> final method cannot be overridden
    public void setStudent(int x, int rollNo, String name, String gender, double cgpa) {
        super.setStudent(rollNo, name, gender, cgpa);
    }
}

// 1 2 3 4 5
// 7 % 5
// 1st Rotation 5 1 2 3 4
// 2nd Rotation 4 5 1 2 3
