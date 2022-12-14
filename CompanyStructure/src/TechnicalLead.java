import java.util.ArrayList;// to load Arraylist class for user option
public class TechnicalLead extends TechnicalEmployee {
    public ArrayList<SoftwareEngineer> team;


    public TechnicalLead(String name){
        super(name);
        this.baseSalary*=1.3;
        headcount=4;
        this.team=new ArrayList<SoftwareEngineer>();
    }

    public boolean hasHeadCount(){
        return team.size() < headcount;
    }

    public boolean addReport(SoftwareEngineer e){
        if(hasHeadCount()){
            team.add(e);
            e.setManager(this);
            return true;
        } else {
            return false;
        }
    }

    public boolean approveCheckIn(SoftwareEngineer e){
        return e.getManager().equals(this) && e.getCodeAccess();
    }

    public boolean requestBonus(Employee e, double bonus){
        BusinessLead businessLead= (BusinessLead)getAccountantSupport().getManager();
        return businessLead.approveBonus(e, bonus);
    }

    public String getTeamStatus(){
        if (team.size()==0){
            return this.employeeStatus()+ " and no direct reports yet";
        } else {
            String teamStatus="";
            for (int i=0;i<team.size();i++){
                teamStatus+=(team.get(i).employeeStatus()+"\n");
            }
            return this.employeeStatus()+" and is managing: \n"+teamStatus;
        }
    }
}
