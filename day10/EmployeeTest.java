public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(); // calls default constructor
        Employee employee = new Employee(1001, "Dhanya", 500000, "ADMIN");
        Employee employee2 = new Employee(1002, "Murugan", 1, "CM");
        // employee.setName("Sarjana");
        // employee.setSalary(700000);
        // employee.setDepartment("PRODUCTION");

        // System.out.println("Employee Id   : " +employee.getId());
        // System.out.println("Employee Name : " +employee.getName());
        // System.out.println("Salary        : " +employee.getSalary());
        // System.out.println("Department    : " +employee.getDepartment());
        // System.out.println("Employee Id   : " +employee2.getId());
        // System.out.println("Employee Name : " +employee2.getName());
        // System.out.println("Salary        : " +employee2.getSalary());
        // System.out.println("Department    : " +employee2.getDepartment());
        System.out.println(employee.toString());
        //This calls toString() automatically
        System.out.println(employee2);        
    }
}

// Student
//     States
//         rollNo
//         name
//         age
//         cgpa
//     Parameterized Constructor

//     Methods 
//         printStudent();
//         toString();

