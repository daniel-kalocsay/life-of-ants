package life_of_ants.insects.ants;

import life_of_ants.Colony;

public class Queen extends Ant {

    public void communicate(String message) {
        System.out.println(message);
    }
    public void introduceSelf() {
        System.out.println("I'm a lazy ass Queen!");
    }

    public void spendAnHour(Colony colony) {
        sitAndDoNothing();
    }

    private void sitAndDoNothing() {
        System.out.println("Just here sitting on my lazy ass doing absolutely nothing at all");;
    }

    public Queen() {
        posX = 0;
        posY = 0;
    }
}
