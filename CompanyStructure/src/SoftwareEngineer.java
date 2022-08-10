public class SoftwareEngineer extends TechnicalEmployee{
    public boolean CodeAccess;

    public SoftwareEngineer(String name){
        super(name);
        setCodeAccess(true);
    }

    public boolean getCodeAccess(){
        return CodeAccess;
    }

    public void setCodeAccess(boolean access){
        this.CodeAccess=access;
    }

    public int getSuccessfulCheckIns(){
        return checkins;
    }

    public boolean checkInCode(){
        TechnicalLead manager=(TechnicalLead) this.getManager();
        if (manager.approveCheckIn(this)){
            this.checkins++;
            return true;
        } else {
            CodeAccess=false;
            return false;
        }
    }

}
