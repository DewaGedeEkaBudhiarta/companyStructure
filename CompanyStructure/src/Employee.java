public abstract class Employee {

    public String name;
    private static int counter;
    public int employeeID;
    public double baseSalary;
    public double bonus;//to declare data type of bonus.
    public Employee manager;
    public Accountant accountantSupport;
    public int headcount=0;
    public double bonusBudget;

    public Employee(String name, double baseSalary){
        this.name=name;
        this.baseSalary=baseSalary;
        counter++;
        this.employeeID=counter;
    }

    public double getBaseSalary(){
        return this.baseSalary;
    }

    public String getName(){
        return this.name;
    }

    public int getEmployeeID(){
        return this.employeeID;
    }

    public Employee getManager(){
        return manager;
    }

    public Accountant getAccountantSupport() {
        return accountantSupport;
    }

    public void setManager(Employee manager){
        this.manager=manager;
    }

    public boolean equals(Employee other){
        return this.getEmployeeID()==other.getEmployeeID();
    }

    public String toString(){
        return getEmployeeID()+" "+getName();
    }

    public abstract String employeeStatus();
    public void getBonus(){
    }
}
