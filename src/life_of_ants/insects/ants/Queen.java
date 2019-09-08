package life_of_ants.insects.ants;

import life_of_ants.Colony;
import life_of_ants.insects.Insect;

public class Queen extends Ant {
    boolean inTheMood = true;

    private boolean currentlyMating = false;
    private int matingDuration = 2;
    private Insect matingWith;

    public boolean isMating() {
        return currentlyMating;
    }

    public boolean isInTheMood() {
        return inTheMood;
    }

    public void introduceSelf() {
        communicate("I'm a lazy ass Queen!");
    }

    public void spendAnHour(Colony colony) {
        if (this.isFrozen() ) communicate(imFrozen);
        else {
            if (currentlyMating) keepMating();
            else sitAndDoNothing();
        }
    }

    private void sitAndDoNothing() {
        communicate("Just here sitting on my lazy ass doing absolutely nothing at all");;
    }

    void startMating(Insect insect) {
        communicate("i the queen started mating with a filthy pleb");

        currentlyMating = true;
        matingWith = insect;
    }

    private void stopMating() {
        currentlyMating = false;
        inTheMood = false;
        matingDuration = 2;

        yeet(matingWith);
        matingWith = null;
    }

    private void keepMating() {
        if (matingDuration > 0) {
            communicate("still mating");
            matingDuration--;
        }

        else stopMating();
    }

    private void yeet(Insect poorInsect) {
        poorInsect.getYeeted();
        communicate("i yeeted a pleb");
    }

    public Queen() {
        posX = 0;
        posY = 0;
    }
}
