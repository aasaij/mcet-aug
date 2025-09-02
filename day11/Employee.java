public class Employee {
    //States or properties
    private int id; // default
    private String name;
    private double salary;
    private String department;
    //Constructor
    public Employee(){
        System.out.println("Default Constructor");
    }
    //Parameterzied Constructor
    //Constructor overloading
    public Employee(int id, String name, double salary, String department){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    //Methods or behaviour
    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    //getters
    public int getId(){
        return id;
    }
    public String getName(){
        return name.toUpperCase();
    }
    public double getSalary(){
        return salary;
    }

    public String getDepartment(){
        return department.toUpperCase();
    }
    public String toString(){
   //     return "Employee[id="+id+", name=" + name + ", salary = " + salary + ", department=" + department+"]";
        return String.format("Employee[id=%d, name='%s', salary=%.2f, department='%s']",
                id, name, salary, department);
    }
}
//POJO Class --> Plain Old Java Object
