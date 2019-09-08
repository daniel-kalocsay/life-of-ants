package life_of_ants.insects.ants;

public class Drone extends Ant {

    public void communicate(String message) {
        System.out.println(message);
    }
    public void introduceSelf() {
        System.out.println("I'm a Drone!");
    }

    public void spendAnHour() {

        if (this.isFrozen()) moveTo(this.posX, this.posY);
        else moveTowardsQueen();
    }

    private void moveTowardsQueen() {
        int direction = 0;
        decideNextDirection(direction);
    }

}
