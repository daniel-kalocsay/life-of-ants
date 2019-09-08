package life_of_ants.insects.ants;

import life_of_ants.Colony;
import life_of_ants.Util;

public class Drone extends Ant {
    private boolean currentlyMating = false;
    private int matingDuration = 2;


    public void communicate(String message) {
        System.out.println(message);
    }
    public void introduceSelf() {
        System.out.println("I'm a Drone!");
    }

    public void spendAnHour(Colony colony) {
        if (this.isFrozen() ) communicate(imFrozen);

        else {
            Queen queen = colony.getQueen();
            if (currentlyMating) keepMating();

            else if (calculateDistanceFromQueen(colony) > 3) {
                moveTowardsQueen();
            }

            else if (!queen.isMating()) tryToMateWithQueen(queen);
        }
    }

    private void moveTowardsQueen() {
        int direction = 321;

        if (posY < 0) direction = 0; // up
        else if (posY > 0) direction = 2; // down

        else if (posX < 0) direction = 1; // right
        else if (posX > 0) direction = 3; // left

        decideNextDirection(direction);
    }

    private void tryToMateWithQueen(Queen queen) {
        System.out.println("lemme smash");
        if (queen.isInTheMood()) {
            startMating(queen);
        }
        else {
            getYeeted();
            System.out.println("i got yeeted cause the queen won't smash");
        }
    }

    private void startMating(Queen queen) {
        System.out.println("HALLELUJAH");
        currentlyMating = true;
        queen.startMating(this);
    }

    private void stopMating() {
        currentlyMating = false;
        matingDuration = 2;
    }

    private void keepMating() {
        if (matingDuration > 0) {
            System.out.println("still mating");
            matingDuration--;
        }

        else stopMating();
    }

    public Drone() {
        posX = Util.getIntegerBetween(-5, 5);
        posY = Util.getIntegerBetween(-5, 5);
    }

}
