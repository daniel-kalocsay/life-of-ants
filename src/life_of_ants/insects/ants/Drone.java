package life_of_ants.insects.ants;

import life_of_ants.Colony;

public class Drone extends Ant {

    public void communicate(String message) {
        System.out.println(message);
    }
    public void introduceSelf() {
        System.out.println("I'm a Drone!");
    }

    public void spendAnHour(Colony colony) {
        if (this.isFrozen()) moveTo(this.posX, this.posY);
        else {
            if (calculateDistanceFromQueen(colony) > 3) {
                moveTowardsQueen();
            }
            else tryToMateWithQueen(colony.getQueen());
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

    }

}
