package life_of_ants.insects.ants;

import life_of_ants.Colony;
import life_of_ants.Util;

public class Worker extends Ant {

    public void introduceSelf() {
        communicate("I'm a Worker!");
    }

    public void spendAnHour(Colony colony) {
        if (this.isFrozen() ) communicate(imFrozen);
        else moveRandomly();
    }

    private void moveRandomly() {
        int direction = Util.getIntegerBetween(0, 3);
        decideNextDirection(direction);
    }
}
