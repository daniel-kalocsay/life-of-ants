package life_of_ants.insects.ants;

public class Drone extends Ant {
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
        System.out.println("I'm a Drone!");
    }

    public void spendAnHour() {

        if (this.isFrozen()) moveTo(this.posX, this.posY);
        else moveTo(calculateNextX(), calculateNextY());
    }

}
