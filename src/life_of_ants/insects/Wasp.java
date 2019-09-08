package life_of_ants.insects;

import life_of_ants.Colony;

public class Wasp extends Insect{

    public void communicate(String message) {
        System.out.println(message);
    }

    public void introduceSelf() {
        System.out.println("I'm a Wasp hurr durr!");
    }

    public void spendAnHour(Colony colony) {
        wreakHavoc();
    }

    private void wreakHavoc() {
        System.out.println("REEEEEEEEEEEEEEEEEEEEEEE");
    }

}
