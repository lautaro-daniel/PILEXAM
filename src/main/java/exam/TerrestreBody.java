package exam;

public class TerrestreBody extends CombatBody{

    public String actions(){
        return "Body Running";
    }

    @Override
    public String change(){
        return "change to terrestre body";
    }
}
