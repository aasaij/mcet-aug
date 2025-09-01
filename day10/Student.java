public class Student {
    //States
    private int rollNo, age;
    private String name;    
    private double cgpa;
    //Constructor
    public Student(int no, String name, double score, int age){
        rollNo = no;
        this.name = name;
        cgpa = score;
        this.age = age;
    }
    public void printStudent(){
        System.out.println("Student Roll Number : " + this.rollNo);
        System.out.println("Student Name        : " + name);
        System.out.println("CGPA                : " + cgpa);
        System.out.println("Age                 : " + age);
    }
    public String toString(){
        return String.format("Student[RollNo:%d, Name='%s', Age=%d, CGPA=%.2f]",rollNo, name, age, cgpa);
    }
}

// MobilePhone
//     model, brand
//     batteryPercentage

//     makeCall() --> batteryPercentage should be decreased by 2%
//     chargePhone() --> batteryPercentage should be increased by 5%
//     getBatteryPercentage() --> returns current batteryPercentage

