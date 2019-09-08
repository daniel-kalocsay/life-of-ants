package life_of_ants.insects.ants;

import life_of_ants.Colony;

public class Soldier extends Ant {
    private int counter = 0;

    public void communicate(String message) {
        System.out.println(message);
    }
    public void introduceSelf() {
        System.out.println("I'm a Soldier!");
    }

    public void spendAnHour(Colony colony) {
        if (this.isFrozen()) moveTo(this.posX, this.posY);
        else decideNextDirection(counter % 4);

        counter++;
    }


}
