package exam;

public abstract class CombatBody extends Robot {

    public String fight(){
        return "Body fighting";
    }

    public String retire(){
        return "Body retired";
    }

    abstract String actions();

}
