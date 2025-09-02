public class ContractEmployee extends Employee{
    private int endYear;
    //Constructor
    public ContractEmployee(int id, String name, double salary, String department, int endYear) {
        super(id, name, salary, department);
        this.endYear = endYear;
    }

    public int getEndYear() {
        return endYear;
    }
    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }
    public String toString(){        
        return super.toString().replaceAll("]", ", EndYear=" + endYear + "]");
    }
}
