public class PermanentEmployee extends Employee{
    private int hra, ca, pf;   
    //Constructor`
    public PermanentEmployee(int id, String name, String departmet,double salary, int hra, int ca, int pf) {
        super(id, name, salary, departmet);   
        this.hra = hra;
        this.ca = ca;
        this.pf = pf;
        setSalary(getSalary());
    }
    //Method overriding
    @Override
    public double getSalary(){
        double salary = super.getSalary();
        double allowances = salary * hra / 100 + salary * ca / 100;
        double deductions = salary * pf / 100;
        return salary + allowances - deductions;
    }
}
