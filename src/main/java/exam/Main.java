package exam;

public class Main {
    public static void main(String[] args) {

        DomesticBody domesticBody = new DomesticBody();

        TerrestreBody terrestreBody = new TerrestreBody();
        System.out.println(terrestreBody.change());

        AirBody airBody = new AirBody();
        System.out.println(airBody.fight());
        System.out.println(airBody.actions());

        AquaticBody aquaticBody = new AquaticBody();
        System.out.println(aquaticBody.retire());
        System.out.println(aquaticBody.actions());

        System.out.println(domesticBody.cook());

    }
}
