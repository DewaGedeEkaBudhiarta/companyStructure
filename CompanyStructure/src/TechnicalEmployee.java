public class TechnicalEmployee extends Employee {
    public int checkins;

    public TechnicalEmployee(String name){
        super(name,75000.00);
        checkins=0;
    }

    public String employeeStatus(){
        return super.toString()+" has "+checkins+" successful check ins";
    }

    public void setCheckin(){
        checkins++;
    }

}
