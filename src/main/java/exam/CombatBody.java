package exam;

public abstract class CombatBody {

    public CombatBody() {
    }

    public String fight(){
        return "Body fighting";
    }

    public String retire(){
        return "Body retired";
    }

    abstract String actions();

     String change(){
        return "change body to Combat body";
    }

}
