public class InheritanceTest {
    public static void main(String[] args) {
        Employee emp = new ContractEmployee(101, "Sakthi", 500000,"IT",2030);
        // System.out.println("Employee Name : " + emp.getName());
        // System.out.println("Salary      : " + emp.getSalary());
        System.out.println(emp);
        emp = new PermanentEmployee(102, "Mukesh", "IT",700000,10, 20, 12);        
        // System.out.println("Employee Name : " + emp.getName());
        // System.out.println("Salary      : " + emp.getSalary());
        System.out.println(emp);
    }   
}
// input
// education

// output
// odicatuen

// test@123

// test@123




