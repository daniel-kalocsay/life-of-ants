package life_of_ants.insects;

import life_of_ants.Colony;

public class Wasp extends Insect{

    protected int calculateNextX() {
        return 0;
    }

    protected int calculateNextY() {
        return 0;
    }

    public void communicate(String message) {
        System.out.println(message);
    }

    public void introduceSelf() {
        System.out.println("I'm a Wasp hurr durr!");
    }

    public void spendAnHour() {
        if (this.isFrozen()) moveTo(this.posX, this.posY);
        else moveTo(calculateNextX(), calculateNextY());
    }

}
