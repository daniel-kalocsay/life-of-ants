package life_of_ants.insects.ants;

import life_of_ants.Colony;
import life_of_ants.insects.Insect;
import life_of_ants.insects.Wasp;

public class Soldier extends Ant {
    private int counter = 0;

    public void introduceSelf() {
        communicate("I'm a Soldier!");
    }

    public void spendAnHour(Colony colony) {

        if (this.isFrozen()) huntWasp(colony);
        else patrol();
    }

    private void patrol() {
        communicate("patrolling");

        decideNextDirection(counter % 4);
        counter++;
    }

    private void huntWasp(Colony colony) {
        Wasp waspToHunt = colony.getWasp();
        communicate("i'm hunting the wasp");
        int waspX = waspToHunt.getPosX();
        int waspY = waspToHunt.getPosY();

        if (posX == waspX && posY == waspY) killWasp(colony);
        else moveTowardsWasp(waspX, waspY);
    }

    private void moveTowardsWasp(int waspX, int waspY) {
        int direction = 123;

        if (posY < waspY) direction = 0; // up
        else if (posY > waspY) direction = 2; // down

        else if (posX < waspX) direction = 1; // right
        else if (posX > waspX) direction = 3; // left

        decideNextDirection(direction);
    }

    private void killWasp(Colony colony) {

        for (Insect insect : colony.getInsectsInColony()) {
            insect.unfreeze();
        }

        communicate("HAJIME");
        colony.removeWasp();
    }


}
