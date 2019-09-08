package life_of_ants.insects.ants;

import life_of_ants.Util;

public class Worker extends Ant {

    public void communicate(String message) {
        System.out.println(message);
    }
    public void introduceSelf() {
        System.out.println("I'm a Worker!");
    }

    public void spendAnHour() {

        if (this.isFrozen()) moveTo(this.posX, this.posY);
        else moveRandomly();
    }

    private void moveRandomly() {
        int direction = Util.getIntegerBetween(0, 3);
        decideNextDirection(direction);
    }
}
