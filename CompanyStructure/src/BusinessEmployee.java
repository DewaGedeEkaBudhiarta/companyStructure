public class BusinessEmployee extends Employee {
    public BusinessEmployee(String name){
        super(name,50000.00);
    }

    public double getBonusBudget(){
        return bonusBudget;
    }

    public void setBonusBudget(double bonusBudget) {
        this.bonusBudget = bonusBudget;
    }

    public String employeeStatus(){
        String convert= String.format("%.2f",bonusBudget);//reduce the double to 2 decimals
        return this +" with a budget of "+ convert;
    }
}